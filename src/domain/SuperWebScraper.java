package domain;

public abstract class SuperWebScraper {
	
	String url;
	
	public SuperWebScraper(String url) {
		this.url = url;
	}
	
	public abstract String getData();

}
