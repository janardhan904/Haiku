package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDrivers {
	
static WebDriver driver;
	
	
	public static WebDriver DriverD(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace1\\Haiku\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile fp=p.getProfile("Sel_Pro");
			driver = new FirefoxDriver(fp);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			return driver;
		}
		else if (browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\workspace1\\Haiku\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		else throw new Exception("Browser is not correct");
		
		
	}
	public static void closeDriver(WebDriver driver) {
        driver.quit();
	}
}
