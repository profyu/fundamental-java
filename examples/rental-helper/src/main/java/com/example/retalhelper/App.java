package com.example.retalhelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.commons.net.util.TrustManagerUtils;

public class App {
	public static void main(String[] args) {

		try {
			// 信任所有SSL憑證發行單位
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, new TrustManager[] { TrustManagerUtils.getAcceptAllTrustManager() }, new SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// 透過 ListPageCrawler 實例來抓回列表頁面當中，通往各屋詳細連頁面結網址
			ListPageCrawler lpc = new ListPageCrawler(1, 1);
			List<String> detailUrls = lpc.getDetailUrls();

			// 用來存放所有爬回的租屋資料的清單
			List<House> houses = new ArrayList<>();

			// 走訪各詳細頁面
			for (String detailUrl : detailUrls) {
				System.out.println("詳細頁面網址: " + detailUrl);

				// 透過 DetailPageCrawler 實例來抓取各屋詳細資料
				DetailPageCrawler dpc = new DetailPageCrawler(detailUrl);
				House house = dpc.getHouse();

				// 如果成功才加入租屋資料清單
				if (house != null) {
					houses.add(house);
					System.out.println(house.toString());
				}

			}

			System.out.println("抓取完畢");

		} catch (IOException | NoSuchAlgorithmException | KeyManagementException e) {
			System.out.println("網頁抓取失敗");
			e.printStackTrace();
		}

	}
}
