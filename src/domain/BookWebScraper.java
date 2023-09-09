package domain;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class BookWebScraper {

	public static void main(String[] args) {
		new BookWebScraper().getData();
		
	}
	
	public String getData() {
		
		
		/*
		 * https://novelfull.com/a-will-eternal
		 * 
		 * for loop van page 1-last 
		 * download alle tr get alle links
		 * 
		 * 
		 * 
		 * get table data with all linkt to the chapters
		 */
		
		final String url = "https://novelfull.com/a-will-eternal/chapter-1-im-bai-xiaochun.html";
		String out = "";
		
		try {
			final Document document = Jsoup.connect(url).get();
			
			Element text = document.select("div.chapter-c").first();
			out = text.text().replace(".", ". \n");
			//test works: System.out.println(out);
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return out;
	}
	
}
