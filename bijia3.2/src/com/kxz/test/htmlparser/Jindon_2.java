package com.kxz.test.htmlparser;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Jindon_2 {
	public static void main(String[] args) throws IOException {
		String url = "http://search.jd.com/Search?keyword=%E5%B0%8F%E8%AF%B4&enc=utf-8&book=y";
		Document doc = (Document)Jsoup.connect(url).get();
		Elements elements = doc.getElementsByClass("p-name");
		Elements img = doc.getElementsByClass("p-img");
		System.out.println(img.html());
		Jindon_1 main = new Jindon_1();
		String[] arrurl = new String[50];
		String[] imgurl = new String[50];
		int count=0;
		int counti = 0;
		//System.out.println(img.html());
		for(int i=0;i<elements.size();i++){
			Elements element = elements.get(i).select("a");
			Elements z = element.first().getElementsByAttribute("href");
			if(z.first().attr("href").startsWith("http")){
			//	System.out.println(z.first().attr("href"));
				arrurl[count++] = z.first().attr("href");
			}
		}
		
		for(int i=0;i<count;i++){
			main.x(arrurl[i]);
			System.out.println(i+"=========================");
		}
	}

}
