package com.test1.pages;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sun.util.logging.resources.logging;

import com.test1.ActionsLogs.ActionsLogs;
import com.test1.pageconstants.ConstantsHome;

public class HelpPage {
	static WebDriver driver;
	public HelpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public   void navigateToHelp()
	{
		
		//ActionsLogs.click(driver, By.xpath(ConstantsHome.HELP_x));
						
		ActionsLogs.doubleClick(driver, By.xpath(ConstantsHome.HELP_x));
		
		
		
	}
	

}
