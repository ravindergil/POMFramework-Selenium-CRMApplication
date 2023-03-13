package com.CRM.regression.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.pom.LogInPOM;
import com.CRM.pom.NaviColorPOM;
import com.CRM.utility.BaseClass;

public class NaviColorTest extends BaseClass {

	WebDriver driver;
	public NaviColorPOM NC;
	public LogInPOM LI;

	
	@Test
	public void getNaviColor() {
		
		
		Reporter.log("Test Case : Get the color of the navigation menu - Started", true);
		LI=new LogInPOM(super.driver);
		
		NC=new NaviColorPOM(super.driver);
		
		LI.logIntoCRM(super.UserName, super.PassWord);
		
		Reporter.log("Logged into Application Successful", true);
		
		String expected = "rgb(83, 77, 100)";
		String actual = NC.naviColor();
		System.out.println(actual);
		assertEquals(actual, expected);
		Reporter.log("The navigation menu color is : " + actual, true);
		Reporter.log("Test Case : Get the color of the navigation menu - Pass", true);
		
	}
	
}
