package startup;

import cui.WebScraperApplicatie;
import domain.DomeinController;

public class Main {
	
	//start the whole cycle

	//test with laptop eclipse 2
	public static void main(String[] args) {
		new WebScraperApplicatie(new DomeinController()).start();
	}

}
