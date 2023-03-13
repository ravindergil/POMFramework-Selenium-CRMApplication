/* @Author: Ravinder Gill,
 * Date: 2. March 2023
 * 
 * Purpose = Practice and Recreating a Sample Framework
 * This class contains code to Open the browser
 * with CRM app URL. It reads URL and Browser data from url.properties file.
 */

package com.CRM.utility;

import org.openqa.selenium.WebDriver;

public class StartApplication {
	
	
	public static WebDriver startApp(WebDriver driver) {
		
		String URL = ReadPropertiesFile.getAppUrl();
		String Browser = ReadPropertiesFile.getBrowser();
		
		driver = DriverFactory.getDriver(Browser);
		driver.get(URL);
		driver.manage().window().maximize();
		//System.out.println("Application Started");
		return driver;
	}

	
	public static void quitApp(WebDriver driver) {
		driver.close();
	}

}
