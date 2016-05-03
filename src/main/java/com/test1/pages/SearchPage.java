package com.test1.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test1.ActionsLogs.ActionsLogs;
import com.test1.pageconstants.ConstantsHome;
import com.test1.pageconstants.ConstantsSearch;

public class SearchPage implements ConstantsHome,ConstantsSearch{
 WebDriver driver;
 
 	public  SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public  void navigateToSearchPage()
	{
		ActionsLogs.click(driver, By.xpath(Search_X));
		ActionsLogs.click(driver, By.xpath(Search_allCollections_X));	
	}
	
	
	public  void searchName(String testdata) throws FileNotFoundException, Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath(FirstName_X)).sendKeys(testdata);
		driver.findElement(By.xpath(Submit_X)).click();
		
	}


}
