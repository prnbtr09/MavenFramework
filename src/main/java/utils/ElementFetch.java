package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basePackage.BaseTest;

public class ElementFetch {
	
	public WebElement getWebElement(String identifierType,String identiferValue ) {
		
		switch(identifierType.toLowerCase()) {
		
		case "id":
			return BaseTest.driver.findElement(By.id(identiferValue));
			
		case "xpath":
			return BaseTest.driver.findElement(By.xpath(identiferValue));
		default:
			return null;
		}
		
	}
	
public List<WebElement> getWebElements(String identifierType,String identiferValue ) {
		
		switch(identifierType.toLowerCase()) {
		
		case "id":
			return BaseTest.driver.findElements(By.id(identiferValue));
			
		case "xpath":
			return BaseTest.driver.findElements(By.xpath(identiferValue));
		default:
			return null;
		}
		
	}

}
