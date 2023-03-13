/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Object Repository for Read Title test case
 */

package com.CRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ReadTitlePOM {
	
	public WebDriver driver;
	
	public ReadTitlePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String getPageTitle() {
		String Title = driver.getTitle();
		return Title;
	}

	
}
