package cui;

import domain.DomeinController;

public class WebScraperApplicatie {
	
	private DomeinController dc;
	
	public WebScraperApplicatie(DomeinController dc) {
		this.dc = dc;
	}
	
	public void start() {
		System.out.println("make a list of options with switch cases");
	}
	
	
	public void downloadBoek(String urlChapter1) {
		//if you want the whole book (while there is a next chapter button in chapter nav go to the href value and download it and change current url to it
		//and download the file)
		/*
		 * 
		 * <a class="btn btn-success" href="/a-will-eternal/chapter-2-the-ovens.html" title="Chapter 2: The Ovens" id="next_chap">
		 * 		<span class="hidden-xs">Next Chapter</span>
		 * 		<span class="glyphicon glyphicon-chevron-right"></span>
		 * </a>
		 * 
		 * 
		 * 
		 */
		
		
		
		System.out.println("if you want everything");
	}
}
