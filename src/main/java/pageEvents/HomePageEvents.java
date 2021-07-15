package pageEvents;

import basePackage.BaseTest;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	
	public void clickHomePageOption() {
		ElementFetch fetch=new ElementFetch();
		fetch.getWebElement("xpath", HomePageElements.HOMEPAGEICON).click();
	}
	
	
	

}
