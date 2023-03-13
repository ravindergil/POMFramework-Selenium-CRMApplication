package com.CRM.regression.test;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.pom.LogInPOM;
import com.CRM.utility.BaseClass;

public class LogInTest extends BaseClass{
	
	public WebDriver driver;
	public LogInPOM logIn; 
	
	
	@Test
	public void LogIn() {
		Reporter.log("---Test Case : Log into Application Started---", true);
		
		logIn = new LogInPOM(super.driver); 
		logIn.logIntoCRM(UserName, PassWord);
		Reporter.log("Logged into Application Successful", true);
		
		String actual = super.driver.getTitle();
		System.out.println(actual);
		AssertJUnit.assertEquals(actual, "SuiteCRM");
		Reporter.log("---TestCase : : Log into Application Started - Pass---", true);
		
		
	}

}
