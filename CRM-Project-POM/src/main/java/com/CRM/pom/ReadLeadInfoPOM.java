/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Object Repository for Read Info regarding Leads test case
 */

package com.CRM.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.waits.WaitTypes;

public class ReadLeadInfoPOM {

	public WebDriver driver;
	public WaitTypes wait;
	
	public ReadLeadInfoPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="grouptab_0")
	public WebElement salesBtn;
	
	@FindBy(xpath="//a[@id='grouptab_0']//following-sibling::ul/li[5]/a")
	public WebElement leadBtn;
	
	@FindBy(xpath="//tr[@class='oddListRowS1'][1]/td[10]/span")
	public WebElement infoBtn;
	
	@FindBy(xpath="//span[@class='phone']")
	public WebElement mobileInfo;
	
	

	public void openSalesMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(salesBtn).build().perform();
		leadBtn.click();
	}
	
	public void clickInfoBtn() {
		wait = new WaitTypes(driver);
		wait.visibilityOf(infoBtn, 10);
		infoBtn.click();
	}
	
	public void getMobileInfo() {
		wait.visibilityOf(mobileInfo, 10);
		String phone = mobileInfo.getText();
		System.out.println(phone);
		String actual = "992345678";
		assertEquals(actual, phone);
		
	}
}