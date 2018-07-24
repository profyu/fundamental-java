package com.example.retalhelper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class MapPageCrawler {
	
	private Document doc;
	public MapPageCrawler(int postId) throws IOException{
		this.doc = Jsoup.connect("https://rent.591.com.tw/map-houseRound.html?type=1&post_id="+postId+"&detail=detail&version=1").get();
	}
	
	public double[] getCoordinate(){
		Element mapIFrame = doc.selectFirst("div.propMapBarMap iframe");
		if(mapIFrame == null){
			return null;
		}
		
		String url = mapIFrame.absUrl("src");
		
		String tmp1 = url.split("&q=")[1];
		String tmp2 = tmp1.split("&z=")[0];
		String[] rawCoordinate = tmp2.split(",");
		double lat = Double.parseDouble(rawCoordinate[0]);
		double lng = Double.parseDouble(rawCoordinate[1]);
		
		return new double[]{ lat, lng };
		
		
	}
}
