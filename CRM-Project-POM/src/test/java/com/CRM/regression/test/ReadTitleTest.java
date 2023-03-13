package com.CRM.regression.test;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.pom.ReadTitlePOM;
import com.CRM.utility.BaseClass;

public class ReadTitleTest extends BaseClass {
	
	WebDriver driver;
	public ReadTitlePOM RT;

	@Test
	public void getTitle() {
		
		Reporter.log("Test Case : Read Page Title - Started", true);
		RT = new ReadTitlePOM(super.driver);
		System.out.println(RT.getPageTitle());
		String actualTitle = RT.getPageTitle();
		String expectedTitle = "SuiteCRM";
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		Reporter.log("Test Case : Read Page Title - Pass", true);
	}
	
}
