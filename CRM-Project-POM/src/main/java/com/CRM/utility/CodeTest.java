/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Purpose = Practice and recreating the Framework
 * 
 * This class is to test demo code on the fly
 * 
 */


package com.CRM.utility;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CodeTest {
	
	
	public Properties prop;
	public String baseURL;
	public String browser;
	public String userName;
	public String passWord;
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeTest
	public void getURL() throws IOException {
		
		baseURL = ReadPropertiesFile.getAppUrl();
		browser = ReadPropertiesFile.getBrowser();
		userName = ReadPropertiesFile.getUserName();
		passWord = ReadPropertiesFile.getPassword();
		
		driver = DriverFactory.getDriver(browser);
		
	}
	
	@Test
	public void OpenBrowser() {
		this.driver.get(baseURL);
		this.driver.manage().window().maximize();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='companylogo']/img"));
		System.out.println(logo.getAttribute("src"));
	
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.id("user_name")).sendKeys(userName);
		driver.findElement(By.id("username_password")).sendKeys(passWord);
		driver.findElement(By.id("bigbutton")).click();
		WebElement salesBtn = driver.findElement(By.id("grouptab_0"));
		
		wait.until(ExpectedConditions.visibilityOf(salesBtn));
		
		Actions action = new Actions(driver);
		action.moveToElement(salesBtn).build().perform();
		
//		driver.findElement(By.xpath("//a[@id='grouptab_0']//following-sibling::ul/li[5]/a")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		
		WebElement infoBtn = driver.findElement(By.xpath("//tr[@class='oddListRowS1'][1]/td[10]/span"));
		infoBtn.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement phone = driver.findElement(By.xpath("//div[@id='ui-id-21']/span | //span[@class='phone']"));
		System.out.println(phone.isDisplayed());
		System.out.println(phone.getText());
		
		//span[@class='phone']
*/		
		
		driver.findElement(By.xpath("//a[@id='grouptab_0']//following-sibling::ul/li[3]/a")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List <WebElement> tableData = driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody/tr/td[3]"));
		System.out.println("here");
		
		for(int i=1; i<=tableData.size(); i++) {
			if (i%2!=0) {
				System.out.println(i + " - " + tableData.get(i).getText());
			}
		}
		
	}

	@AfterTest
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
}
