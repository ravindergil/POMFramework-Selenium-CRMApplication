/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Object Repository for Check Navigation Color test case
 */


package com.CRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaviColorPOM {
	
	WebDriver driver;
	
	public NaviColorPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="toolbar")
	public WebElement naviBar;
	
	public String naviColor() {
		String color=naviBar.getCssValue("color");
		return color;
	}

}
