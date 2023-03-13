package com.CRM.regression.test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.pom.HeaderImagePOM;
import com.CRM.utility.BaseClass;

public class HeaderImageTest extends BaseClass {
	
	
	public WebDriver driver;
	public HeaderImagePOM HI;
	
	
	@Test
	public void HeaderTest() {
		
		Reporter.log("Test Case : Print the url of the header image to the console - Started", true);
		HI = new HeaderImagePOM(super.driver);
		String HeaderURL = HI.getHeaderImageURL();
		Reporter.log("The Url is : " + HeaderURL, true);
		Reporter.log("Test Case : Print the url of the header image to the console - Pass", true);
	}
}
