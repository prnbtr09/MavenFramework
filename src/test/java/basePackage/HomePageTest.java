package basePackage;

import org.testng.annotations.Test;

import pageEvents.HomePageEvents;

public class HomePageTest extends BaseTest{

	@Test
	public void landingOnHomePage() {
		HomePageEvents homePage=new HomePageEvents();
		homePage.clickHomePageOption();
	}
	
	
}
