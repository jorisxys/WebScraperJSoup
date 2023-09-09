package domain;


/*
 * class that uses jsoup to webscrape the latest finviz stock data: Ticker and lastPrice
 * later upgrade this into an abstract super class and let WuxiaWorldWebScraper, StockDataWebScraper inherit from this.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class StockWebScraper {

	public static void main(String[] args) {
		new StockWebScraper().getData();
		
	}
	
	public void getData() {
		final String url = "https://finviz.com";

		try {
			final Document document = Jsoup.connect(url).get();
			
			for(Element row : document.select(
					"table.t-home-table.table-empty-rounded-separate tr")) {
				if(row.select("td:nth-of-type(1)").text().equals("")) {
					continue;
				}
				else {
					final String ticker = row.select("td:nth-of-type(1)").text();
					final String price = row.select("td:nth-of-type(2)").text();
					System.out.printf("%s %s %n",ticker, price);
							
				}
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
