package domain;

//this class shall make the subclasses and give them orders.
	
public class DomeinController {
	
	private StockWebScraper sws;
	private BookWebScraper bws;

	public DomeinController () {
		sws = new StockWebScraper();
		bws = new BookWebScraper();
	}

	public String downloadChapter(String url) {
		return url;
	}
	
}
