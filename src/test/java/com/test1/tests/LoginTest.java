package com.test1.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.SeleniumDrivers;
import com.test1.pages.HelpPage;
import com.test1.pages.HomePage;
import com.test1.pages.LoginPage;
import com.test1.pages.SearchPage;
import com.test1.pages.TreesPage;
import com.test1.utility.Excel_data;
import com.test1.utility.Properties_data;




public class LoginTest{
	WebDriver driver;
	LoginPage Loginpage;
	SearchPage searchpage;
	HelpPage helppage;
	
	@BeforeTest
	public void btest() throws Exception
	{
		
		driver=SeleniumDrivers.DriverD(Properties_data.properties("browser"));
		driver.get(Properties_data.properties("baseurl"));
		Loginpage=new LoginPage(driver);
		searchpage=new SearchPage(driver);
		helppage =new HelpPage(driver);
		
	}
	@Test//(retryAnalyzer=RetryAgain.class)
	public void Test() throws Exception
	{	    	
			 
			Loginpage.Login(); //Created constructor in the Loginpage class
			
			HomePage.isHomePage(driver); //without creating constructor in the HomePage
						
			//TreesPage.actionsOnATree(driver);
			
			//searchpage.navigateToSearchPage();
			//searchpage.searchName(Excel_data.test());
			//helppage.navigateToHelp();

	}
	@AfterTest
	public void Atest()
	{
		SeleniumDrivers.closeDriver(driver);
		
	}


}
