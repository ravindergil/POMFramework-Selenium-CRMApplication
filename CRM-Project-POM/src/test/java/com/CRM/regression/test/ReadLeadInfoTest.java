package com.CRM.regression.test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.pom.LogInPOM;
import com.CRM.pom.ReadLeadInfoPOM;
import com.CRM.utility.BaseClass;

public class ReadLeadInfoTest extends BaseClass{

	public WebDriver driver;
	public LogInPOM LI;
	public ReadLeadInfoPOM RL;
	
	@Test
	public void getLeadInfo() {
		
		Reporter.log("Test Case : Reading contains additional information about the account/lead - Started", true);
		LI= new LogInPOM(super.driver);
		LI.logIntoCRM(super.UserName, super.PassWord);
		Reporter.log("Logged into Application Successful", true);
		
		RL = new ReadLeadInfoPOM(super.driver);
		RL.openSalesMenu();
		Reporter.log("Sales Menu Opened", true);

		RL.clickInfoBtn();
		Reporter.log("Button Clicked", true);
		
		RL.getMobileInfo();
		Reporter.log("Test Case : Reading contains additional information about the account/lead - Pass", true);
		
		
		
	}
	
}
