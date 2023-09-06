package cui;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScrape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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
