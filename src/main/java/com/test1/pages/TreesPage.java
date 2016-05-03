package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.test1.ActionsLogs.ActionsLogs;
import com.test1.pageconstants.ConstantsHome;
import com.test1.pageconstants.ConstantsTree;

public class TreesPage implements ConstantsTree,ConstantsHome{
	static WebDriver driver;
	 
	 public static void actionsOnATree(WebDriver driver)
	 {
		 ActionsLogs.click(driver, By.xpath(TREES_X));
		 ActionsLogs.click(driver, By.xpath(Tree1_X));
		 ActionsLogs.click(driver, By.xpath(PedigreeView_X));
		 
	 }
}
