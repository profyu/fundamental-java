package com.example.retalhelper;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import org.apache.commons.net.util.TrustManagerUtils;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class App {
	public static void main(String[] args) {

		try {
			// 信任所有SSL憑證發行單位
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, new TrustManager[] { TrustManagerUtils.getAcceptAllTrustManager() }, new SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// 引導 Morphia 來讀取標記
			Morphia morphia = new Morphia();
			morphia.mapPackage("com.example.retalhelper");

			// 建立 MongoDB 網路連線
			MongoClientURI uri = new MongoClientURI("注意:此處應填入自己MongoDB的連線字串");
			MongoClient mongoClient = new MongoClient(uri);
			Datastore datastore = morphia.createDatastore(mongoClient, "rental_helper");

			// 無限迴圈
			while (true) {
				// 抓取台北市 1~12 區
				for (int sectionId = 1; sectionId <= 12; sectionId++) {

					System.out.println("目前 sectionId = " + sectionId);

					// 透過 ListPageCrawler 實例來抓回列表頁面當中，通往各屋詳細連頁面結網址
					ListPageCrawler lpc = new ListPageCrawler(1, sectionId);
					List<String> detailUrls = lpc.getDetailUrls();

					// 走訪各詳細頁面
					for (String detailUrl : detailUrls) {
						System.out.println("詳細頁面網址: " + detailUrl);

						// 透過 DetailPageCrawler 實例來抓取各屋詳細資料
						DetailPageCrawler dpc = new DetailPageCrawler(detailUrl);
						House house = dpc.getHouse();

						// 如果成功才加入資料庫
						if (house != null) {

							// 查詢資料庫: 是否已經有符合的 postId 的租屋資料
							List<House> existed = datastore.createQuery(House.class).field("postId")
									.equal(house.getPostId()).asList();

							if (existed.size() == 0) {
								datastore.save(house);
								System.out.println("資料已寫入");
							} else {
								System.out.println("資料已存在");
							}
							System.out.println(house.toString());
						}

					}
				}
				System.out.println("抓取完成");
				Thread.sleep(300000);

			}

		} catch (IOException | NoSuchAlgorithmException | KeyManagementException | InterruptedException e) {
			System.out.println("網頁抓取失敗");
			e.printStackTrace();
		}

	}
}