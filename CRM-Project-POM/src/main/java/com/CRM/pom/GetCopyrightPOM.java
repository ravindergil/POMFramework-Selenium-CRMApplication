/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Object Repository for Get Copyright test case
 * 
 */


package com.CRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetCopyrightPOM {
	
	WebDriver driver;
	
	public GetCopyrightPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="admin_options")
	public WebElement copyright;
	
	public String getCopyrightText() {
		String CopyRightText=copyright.getText();
		return CopyRightText;
	}

}
