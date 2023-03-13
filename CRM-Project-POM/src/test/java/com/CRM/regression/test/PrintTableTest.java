package com.CRM.regression.test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.pom.LogInPOM;
import com.CRM.pom.PrintTablePOM;
import com.CRM.utility.BaseClass;

public class PrintTableTest extends BaseClass {

	public WebDriver driver;
	public PrintTablePOM PT;
	public LogInPOM LI;
	
	
	@Test
	public void readTableData() {

		Reporter.log("Test Case : Open the accounts page and print the contents of the table - Started", true);
		LI= new LogInPOM(super.driver);
		LI.logIntoCRM(super.UserName, super.PassWord);
		Reporter.log("Logged into Application Successful", true);
		
		PT = new PrintTablePOM(super.driver);
		PT.openSalesMenu();
		PT.getTableData();
		Reporter.log("Test Case : Open the accounts page and print the contents of the table - Pass", true);
		
	}
	
}
