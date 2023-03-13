/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Object Repository for Log In test case
 */

package com.CRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPOM {

	public WebDriver driver;
	
	public LogInPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="user_name")
	private WebElement UserName; 
	
	@FindBy(id="username_password")
	private WebElement UserPassword;
	
	@FindBy(id="bigbutton")
	private WebElement LogInBtn;
	
	
	public void logIntoCRM(String UName, String Pass) {
		
		UserName.clear();
		UserName.sendKeys(UName);
		UserPassword.clear();
		UserPassword.sendKeys(Pass);
		
		LogInBtn.click();
		
	}
	
}
