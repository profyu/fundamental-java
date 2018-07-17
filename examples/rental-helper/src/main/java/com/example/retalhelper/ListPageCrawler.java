package com.example.retalhelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ListPageCrawler {
	private int regionId;
	private int sectionId;
	private Document doc;

	public ListPageCrawler(int regionId, int sectionId) throws IOException {
		this.regionId = regionId;
		this.sectionId = sectionId;
		String url = "https://rent.591.com.tw/?kind=0&region=" + regionId + "&section=" + sectionId;
		this.doc = Jsoup.connect(url).get();
	}

	public List<String> getDetailUrls() {
		
		List<String> result = new ArrayList<>();
		
		// 找尋 有著 infoContent class 的 li 元素，並在其下找尋 h3 元素，並且在其下找尋 a 元素
		List<Element> aElements = doc.select("li.infoContent h3 a");
		
		// 走訪每個找到的標題 a 元素
		for(Element aElement : aElements){
			String url = aElement.absUrl("href");
			result.add(url);
		}
		return result;
	}
}
