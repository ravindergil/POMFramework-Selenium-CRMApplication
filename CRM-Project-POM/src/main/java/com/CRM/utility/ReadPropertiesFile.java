/* @Author: Ravinder Gill,
 * Date: 2. March 2023
 * 
 * Purpose = Practice and Recreating a Sample Framework
 * This method reads the data from file in resources folder
 * and provide data in the form of methods.
 */

package com.CRM.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	static Properties prop = new Properties();
	static FileInputStream inStream;
	static String filePath = "./resources/url.properties";

	public static String getUserName() {

		try {
			inStream = new FileInputStream(filePath);
			prop.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// prop.get("input");
		return prop.getProperty("UserName");

	}

	public static String getPassword() {

		try {
			inStream = new FileInputStream(filePath);
			prop.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// prop.get("input");
		return prop.getProperty("PassWord");

	}

	public static String getBrowser() {

		try {
			inStream = new FileInputStream(filePath);
			prop.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// prop.get("input");
		return prop.getProperty("Browser");

	}

	public static String getAppUrl() {

		try {
			inStream = new FileInputStream(filePath);
			prop.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// prop.get("input");
		return prop.getProperty("CRM_URL");

	}
	
/*
	public static void main(String[] args) {
		System.out.println(getUserName());
		System.out.println(getPassword());
		System.out.println(getBrowser());
		System.out.println(getAppUrl());
	}
*/
	
}
