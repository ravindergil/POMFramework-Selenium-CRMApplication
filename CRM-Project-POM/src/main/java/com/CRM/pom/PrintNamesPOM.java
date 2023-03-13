package com.CRM.pom;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.waits.WaitTypes;

public class PrintNamesPOM {
	
	WebDriver driver;
	public HashMap<Object,Object> map;
	public WaitTypes wait;
	
	public PrintNamesPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="grouptab_0")
	public WebElement salesBtn;
	
	@FindBy(xpath="//a[@id='grouptab_0']//following-sibling::ul/li[5]/a")
	public WebElement leadBtn;
	
	@FindBy(xpath="//table[@class='list view table-responsive']/tbody/tr/td[3]")
	public List<WebElement> NameData;
	
	@FindBy(xpath="//table[@class='list view table-responsive']/tbody/tr/td[8]")
	public List<WebElement> UserData;
	
	
	public void openSalesMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(salesBtn).build().perform();
		leadBtn.click();
	}
	
	public HashMap<Object, Object> getNameData() {
		
		wait = new WaitTypes(driver);
		wait.visibilityOfElementsList(NameData, 10);
		
		map = new LinkedHashMap<Object,Object>();
		for(int i=0; i<NameData.size(); i++) {
			map.put(NameData.get(i), UserData.get(i));
		}
		return map;
	}
	
}
