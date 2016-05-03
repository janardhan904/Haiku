package com.test1.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	static WebDriver driver;
	 
	 public static void isHomePage(WebDriver driver)
	 {
		 String s=driver.getCurrentUrl();
		 if(s.contains("home")){
			 System.out.println("At Home Page.....");}
	 }
}
