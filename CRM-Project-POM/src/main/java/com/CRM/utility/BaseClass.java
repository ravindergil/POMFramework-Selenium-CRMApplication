/* @author = Ravinder Gill
 * Date = 2. March 2023
 * Purpose = Practice and recreating the Framework
 * 
 * 
 * This class contains some basic functions and is run before
 * every Test method to reduce the code redundency.
 * 
 */


package com.CRM.utility;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public WebDriver driver;
	public String appURL;
	public String Browser;
	public String UserName;
	public String PassWord;
	//public WaitTypes wait;
	
	@BeforeSuite
	public void setUpSuite() {
		Reporter.log("=================Test Suite Started========================", true);
		Reporter.log("Reading Test Data", true);
	}
	
	@BeforeMethod
	public void startApp() {
		
		UserName=ReadPropertiesFile.getUserName();
		PassWord=ReadPropertiesFile.getPassword();
/*		appURL=ReadPropertiesFile.getAppUrl();
		Browser=ReadPropertiesFile.getBrowser();
*/		
		driver = StartApplication.startApp(driver);
		Reporter.log("Application Started", true);
		
	}
	
	
	@AfterMethod()
	public void tearDown() {
		StartApplication.quitApp(driver);
		Reporter.log("Application Closed", true);
	}
	
	
	

}
