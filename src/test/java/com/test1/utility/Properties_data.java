package com.test1.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Properties_data {
	
	static Properties p=new Properties();
	
	public static String properties(String keyword) throws Exception
	{
	
	InputStream objfile = new FileInputStream("C:\\Users\\Admin\\workspace1\\Haiku\\TestConfig.properties"); 
	p.load(objfile);
	
		if(keyword.equalsIgnoreCase("baseURL"))
			return p.getProperty("baseURL");
		else if(keyword.equalsIgnoreCase("browser"))
			return p.getProperty("Browser");
		else if(keyword.equalsIgnoreCase("Excelfolderpath"))
			return p.getProperty("excelFolderPath");
		else if(keyword.equalsIgnoreCase("excelfile1name"))
			return p.getProperty("excelFile1Name");
		else
			throw new Exception("Browser is not correct");
	}
	
	

}
