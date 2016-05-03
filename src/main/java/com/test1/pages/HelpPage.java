package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(ConstantsHome.HELP_x)));
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(ConstantsHome.HELP_x))).doubleClick().perform();
		
		
	}
	

}
