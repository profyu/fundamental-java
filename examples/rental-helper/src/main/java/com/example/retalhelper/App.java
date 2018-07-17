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

			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, new TrustManager[] { TrustManagerUtils.getAcceptAllTrustManager() }, new SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			ListPageCrawler lpc = new ListPageCrawler(1, 1);

			List<String> detailUrls = lpc.getDetailUrls();

			List<House> houses = new ArrayList<>();

			for (String detailUrl : detailUrls) {
				System.out.println("詳細頁面網址: " + detailUrl);

				DetailPageCrawler dpc = new DetailPageCrawler(detailUrl);
				House house = dpc.getHouse();
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
