/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Object Repository for Print data from table test case
 */


package com.CRM.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.waits.WaitTypes;

public class PrintTablePOM {
	
	public WebDriver driver;
	public WaitTypes wait;

	public PrintTablePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="grouptab_0")
	public WebElement salesBtn;
	
	@FindBy(xpath="//a[@id='grouptab_0']//following-sibling::ul/li[3]/a")
	public WebElement accountsBtn;
	
	@FindBy(xpath="//table[@class='list view table-responsive']/tbody/tr/td[3]")
	public List<WebElement> tableData;
	
	public void openSalesMenu() {
		wait = new WaitTypes(driver);
		Actions action = new Actions(driver);
		wait.visibilityOf(salesBtn, 10);
		action.moveToElement(salesBtn).build().perform();
		accountsBtn.click();
	}
	
	
	public void getTableData() {
		wait.visibilityOfElementsList(tableData, 10);
		for(int i=1; i<=tableData.size(); i++) {
			if (i%2!=0) {
				System.out.println(i + " - " + tableData.get(i).getText());
			}
		}
	}
	
	
	
	
}
