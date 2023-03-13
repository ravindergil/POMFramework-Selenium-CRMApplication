/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Object Repository for Menu Check test case
 */

package com.CRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuCheckPOM {
	
WebDriver driver;
	
	public MenuCheckPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="grouptab_3")
	public WebElement activityBtn;
	
	
	public Boolean hoverActivity() {
		Actions action = new Actions(driver);
		action.moveToElement(activityBtn).build().perform();
		Boolean actBtnEn = activityBtn.isEnabled();
		return actBtnEn;
	}
	
	

}
