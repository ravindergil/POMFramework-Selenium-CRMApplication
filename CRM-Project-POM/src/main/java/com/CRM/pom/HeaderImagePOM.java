/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Object Repository for Header Image test case
 */


package com.CRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderImagePOM {
	
	WebDriver driver;
	
	
	public HeaderImagePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='companylogo']/img")
	private WebElement logo;
	
	public String getHeaderImageURL() {
		String HeaderURL= logo.getAttribute("src");
		return HeaderURL;
	}

}
