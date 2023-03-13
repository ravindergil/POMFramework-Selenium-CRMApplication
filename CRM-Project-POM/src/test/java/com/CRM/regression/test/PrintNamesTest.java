package com.CRM.regression.test;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.pom.LogInPOM;
import com.CRM.pom.PrintNamesPOM;
import com.CRM.utility.BaseClass;

public class PrintNamesTest extends BaseClass{
	
	public WebDriver driver;
	public PrintNamesPOM PN;
	public LogInPOM LI;
	
	
	@Test
	public void printNameData() {
		
		Reporter.log("Test Case : Get Names from the List - Started", true);
		LI = new LogInPOM(super.driver);
		PN = new PrintNamesPOM(super.driver);
		
		LI.logIntoCRM(super.UserName, super.PassWord);
		Reporter.log("Logged into Application Successful", true);
		PN.openSalesMenu();
		
		
		HashMap<Object,Object>  map = PN.getNameData();
		System.out.println(map);
		Reporter.log("The names are : " + map, true);
		Reporter.log("Test Case : Get Names from the List - Pass", true);
		
	}
}
