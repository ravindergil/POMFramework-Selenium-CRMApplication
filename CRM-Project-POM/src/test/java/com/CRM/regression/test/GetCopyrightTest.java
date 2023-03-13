package com.CRM.regression.test;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.pom.GetCopyrightPOM;
import com.CRM.utility.BaseClass;

public class GetCopyrightTest extends BaseClass {
	
	WebDriver driver;
	public GetCopyrightPOM CR;
	String expected = "© Supercharged by SuiteCRM";
	
	
	@Test
	public void getCopyRightTest() {
		
		Reporter.log("Test Case : Print the first copyright text in the footer to the console - Started", true);
		CR = new GetCopyrightPOM(super.driver);
		CR.getCopyrightText();
		String actual=CR.getCopyrightText();
		AssertJUnit.assertEquals(actual, expected);
		Reporter.log("CopyRight Text is : " + actual, true);
		Reporter.log("Test Case : Print the first copyright text in the footer to the console - Pass", true);
		
	}
}
