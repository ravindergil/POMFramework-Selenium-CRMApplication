package com.CRM.regression.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.pom.LogInPOM;
import com.CRM.pom.MenuCheckPOM;
import com.CRM.utility.BaseClass;

public class MenuCheckTest extends BaseClass {
	
	
	WebDriver driver;
	
	public MenuCheckPOM MC;
	public LogInPOM LI;
	
	@Test
	public void checkMenuOptions() {
	
		Reporter.log("Test Case : Verify Login Menu Option is enabled - Started", true);
		LI = new LogInPOM(super.driver);
		LI.logIntoCRM(super.UserName, super.PassWord);
		Reporter.log("Logged into Application Successful", true);
		
		MC = new MenuCheckPOM(super.driver);
		Boolean btnStatus = MC.hoverActivity();
		
		
		assertTrue(btnStatus);
		Reporter.log("Test Case : Verify Login Menu Option is enabled - Pass", true);

		
	}
	
}

