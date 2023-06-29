package com.lamdatest.baselayer;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.lamdatest.util.ReadConfigFile;

public class BrowserDriver {
	private static WebDriver driver;
	
	public static void lunchDriver() {
		
		Properties properties = ReadConfigFile.getProperty("config");
		String browserName = properties.getProperty("browserName").toString();
		String browserURL = properties.getProperty("browserURL").toString();
		
		switch(browserName) {
		case "chrome":
		driver = lunchChrome();
		break;
		case "fireFox":
			driver =lunchFireFox();
			break;
		}
		driver.get(browserURL);
		driver.manage().deleteAllCookies();
	}
	
	//  to start browser
	public static void start() {
		if (driver== null) {
			lunchDriver();
		}
	}
	//to close browser
	public static void close() {
		if (driver!= null) {
			driver.quit();
			driver = null;
		}
	}
	

	private static WebDriver lunchChrome() {
		//chromedriver.exe path=  C:\SeleniumMaven\AltaqorSeleniumFrameworkAssignments\src\test\resources\driver\chromedriver.exe
		String basePath = System.getProperty("user.dir");
		String chromeDriverPath = basePath + "\\src\\test\\resources\\driver\\chromedriver.exe";
		System.setProperty("WebDriver.chrome.driver", chromeDriverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		return new ChromeDriver(options);
		
	}
	private static WebDriver lunchFireFox() {
		// TODO Auto-generated method stub
		return null;
	}

	public static WebDriver getWebDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
	
	/* cross checking code
	public static void main(String[] args) {
		BrowserDriver browserDriver  = new BrowserDriver();
		browserDriver.lunchDriver();
		
	}*/



	
}
