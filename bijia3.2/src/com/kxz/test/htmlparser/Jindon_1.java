package com.kxz.test.htmlparser;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.kxz.model.BookManagerImpl;
import com.kxz.vo.Book;
public class Jindon_1 {
	public void x(String url) throws IOException {
		String threadUrl = url;
		System.out.println(url);
		Document doc=(Document)Jsoup.connect(threadUrl).get();
		Elements elements = doc.getElementsByClass("detail-list");
		Elements elements2 = elements.select("li");
		String ppnoString = "商品编码：";
		String pauthorString ="作者：";
		String pcbsString = "出版社：";
		String pcbsjString = "印刷时间：";
		String webUrl = url;
		String pnoString = null;
		String authorString = null;
		String cbsString = null;
		String cbsjString = null;
		String pname = null;
		String pprice = null;
		String imgUrl = null;
		int i=0;
		for(;i<elements2.size();i++){
			Element element = elements2.get(i);
			String tmp = element.text();
			if(tmp.startsWith(ppnoString)){
				pnoString = tmp.substring(ppnoString.length()).trim();
				System.out.println(pnoString);
				continue;
			}
			if(tmp.startsWith(pauthorString)){
				authorString = tmp.substring(pauthorString.length()).trim();
				System.out.println(authorString);
				continue;
			}
			if(tmp.startsWith(pcbsString)){
				cbsString = tmp.substring(pcbsString.length()).trim();
				System.out.println(cbsString);
				continue;
			}
			if(tmp.startsWith(pcbsjString)){
				cbsjString = tmp.substring(pcbsjString.length()).trim();
				System.out.println(cbsjString);
				continue;
			}
			//System.out.println(tmp);
		}
		//System.out.println();
		if(pnoString!=null){
			Element name = doc.getElementById("name");
			pname = name.select("h1").text().trim();
			System.out.println(pname);
			Element content = doc.getElementById("summary");
			Elements strong = content.select("strong");
			pprice = strong.first().ownText().substring(1);
			System.out.println(pprice);
			Element img = doc.getElementById("spec-n1");
			imgUrl = img.select("img").first().attr("src").trim();
			System.out.println(imgUrl);
			Book book=new Book();
			book.setBookname(pname);
			book.setBookprice(Double.parseDouble(pprice));
			book.setBookweb(webUrl);
			book.setBookauthor(authorString);
			book.setBookpicture(imgUrl);
			book.setBookisbn(pnoString);
			book.setBookpubtime(cbsjString);
			book.setBookcbs(cbsString);
			book.setBookweb(url);
			int result=new BookManagerImpl().add(book);
			if(result<0){
				i=elements2.size();
			}
			//String sql = "INSERT INTO bj_book VALUES(NULL,'"+pname+"','"+pprice+"','"+webUrl+"','"+authorString+"','"+imgUrl+"','"+pnoString+"','"+cbsjString+"','"+cbsString+"')";
//			PrintWriter pw = new PrintWriter(new FileWriter("bj_book.sql",true));
//			//pw.println(sql);
//			pw.flush();
//			pw.close();
		}
	}
}
