/* @author = Ravinder Gill
 * Date = 1st March 2023
 * Purpose = Practice and recreating the Framework
 * This class defines the logic to call the WebDriver.
 * It Could be Chrome, Firefor, Safari, Edge.
 * This methode will be used in Set Up class or in Annotation starting the Framework
 * 
 */

package com.CRM.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver(String driverName) {
		
		if (driverName.equalsIgnoreCase(DriverNames.Chrome)) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(); 
			
		} else if (driverName.equalsIgnoreCase(DriverNames.Firefox)) {
			driver = new FirefoxDriver();
		} else if (driverName.equalsIgnoreCase(DriverNames.Edge)) {
			driver = new EdgeDriver();
		} else if (driverName.equalsIgnoreCase(DriverNames.Safari)) {
			driver = new SafariDriver();
		} else {
			System.out.println("Giver driver not available");
		}
		return driver;
	}
}
