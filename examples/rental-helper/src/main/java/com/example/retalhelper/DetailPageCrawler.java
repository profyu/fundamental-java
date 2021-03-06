package com.example.retalhelper;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.mongodb.morphia.geo.Point;
import org.mongodb.morphia.geo.PointBuilder;

public class DetailPageCrawler {

	private Document doc;

	public DetailPageCrawler(String deatilPageUrl) throws IOException {

		this.doc = Jsoup.connect(deatilPageUrl).get();

	}

	public House getHouse() {

		// 抓取頁面編號
		Element postIdElement = doc.selectFirst("#propNav i");
		String rawPostId = postIdElement.text();
		int postId = Integer.parseInt(rawPostId.substring(2, rawPostId.length() - 1));

		// 抓取房東名稱
		Element ownerElement = doc.selectFirst("div.avatarRight i");
		if (ownerElement == null) {
			return null;
		}
		String owner = ownerElement.text();

		// 抓取地址
		Element addrElement = doc.selectFirst("span.addr");
		if (addrElement == null) {
			return null;
		}
		String address = addrElement.text();

		// 抓取價格
		Element priceElement = doc.selectFirst("div.price i");
		if (priceElement == null) {
			return null;
		}
		String rawPrice = priceElement.text();
		int price = Integer.parseInt(rawPrice.split(" ")[0].replaceAll(",", ""));

		// 抓取 坪數 + 現況
		float area = 0;
		String type = null;
		List<Element> liElements = doc.select("ul.attr li");
		for (Element liElement : liElements) {
			String attrText = liElement.text();

			if (attrText.startsWith("坪數")) {
				// 抓取坪數
				area = Float.parseFloat(attrText.substring(5, attrText.length() - 1));
			} else if (attrText.startsWith("現況")) {
				// 抓取房屋型態(現況)
				type = attrText.substring(5);
			}

		}
		if (area == 0 || type == null) {
			return null;
		}
		
		// 抓取經緯度
		MapPageCrawler mpc;
		try {
			mpc = new MapPageCrawler(postId);
		} catch (IOException e) {
			return null;
		}
		double[] coordinate = mpc.getCoordinate();
		Point point = PointBuilder.pointBuilder().latitude(coordinate[0]).longitude(coordinate[1]).build();
		return new House(postId, area, type, price, owner, address, point);

	}

}
