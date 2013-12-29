package com.kxz.test.htmlparser;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Dangdang_1 {
	public void start(String url) throws IOException{
		String[] arrurl = new String[50];
		Document doc = Jsoup.connect(url).get();
		Elements inner = doc.getElementsByClass("inner");
		int count = 0;
		for(int i=0;i<inner.size();i++){
			Element line = inner.get(i);
			Element a = line.select("a").first();
			String lineurl = a.attr("href");
			arrurl[count++]=lineurl;
		}
		Dangdang_2 content = new Dangdang_2();
		for(int i=0;i<count;i++){
			content.start(arrurl[i]);
			System.out.println("==================="+i);
		}
	}
	public static void main(String[] args) {
		String url = "http://search.dangdang.com/?key=%D0%A1%CB%B5";
		try {
			new Dangdang_1().start(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
