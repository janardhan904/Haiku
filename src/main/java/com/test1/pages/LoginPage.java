package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test1.ActionsLogs.ActionsLogs;
import com.test1.pageconstants.ConstantsLogin;

public class LoginPage implements ConstantsLogin{
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void Login()
	{
		ActionsLogs.click(driver, By.xpath(SIGN_IN_X));
		driver.findElement(By.xpath(username_X)).sendKeys(uname1);
		driver.findElement(By.xpath(pwd_X)).sendKeys(pwd1);
		ActionsLogs.click(driver, By.xpath(sign_in_popup_X));
		
	}
	
	
}
