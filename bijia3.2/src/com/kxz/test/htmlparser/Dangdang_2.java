package com.kxz.test.htmlparser;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Dangdang_2 {
	public void start(String url){
		try {
			Document doc = Jsoup.connect(url).get();
			String webUrl = url;
			String isbnString = null;
			String authorString = null;
			String cbsString = null;
			String cbsjString = null;
			String pname = null;
			String pprice = null;
			String imgUrl = null;
			String pstart = null;
			
			String pauthor  = "作 者：";
			String pcbs = "出 版 社：";
			String pcbsj = "出版时间：";
			String pisbn = "I S B N：";
			//图书详情地址
			webUrl = url;
			System.out.println(webUrl);
			//获取图片URL
			Element img = doc.getElementById("largePic");
			if(img!=null){
				imgUrl = img.attr("wsrc");
				System.out.println(imgUrl);
			}
			
			//客户评价等级
			Element product_comm_star = doc.getElementById("product_comm_star");
			//System.out.println(product_comm_star.outerHtml());
			pstart = product_comm_star.attr("class");
			System.out.println(pstart);
			
			//图书价格
			Element d_price = doc.getElementById("d_price");
			if(d_price!=null){
				//System.out.println(d_price.text());
				pprice = d_price.text().substring(1);
				System.out.println(pprice);
			}
			
			//图书名称
			Elements h1 = doc.select("h1");
			if(h1!=null){
				pname = h1.text();
				System.out.println(pname);
			}
			
			Element c1 = doc.getElementsByClass("c1").get(1);
			if(c1!=null){
				String tmp = c1.text();
				if(tmp.startsWith(pauthor)){
					authorString = tmp.substring(pauthor.length());
					System.out.println(authorString);
					Element tc1 = doc.getElementsByClass("c1").get(2);
					if(tc1!=null){
						cbsString = tc1.text().substring(pcbs.length());
						System.out.println(cbsString);
					}
				}else{
					if(tmp.startsWith(pcbs)){
						cbsString = tmp.substring(pcbs.length());
						System.out.println(cbsString);
					}
				}
			}
			Elements cbsjc = doc.getElementsMatchingOwnText(pcbsj);
			cbsjString = cbsjc.text().substring(pcbsj.length());
			System.out.println(cbsjString);
			
			Elements isbnc = doc.getElementsMatchingOwnText(pisbn);
			Element isbnp = isbnc.parents().first();
			isbnString = isbnp.text().substring(pisbn.length());
			System.out.println(isbnString);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
