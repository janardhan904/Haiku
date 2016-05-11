package com.test1.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_data {
	static InputStream is ;
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	
	
	
	
	public  static String test () throws Exception
	{
		File src =new File(".\\TestData\\TestDataWB.xlsx");
		FileInputStream fis=new FileInputStream(src);
		 workbook=new XSSFWorkbook(fis);
		 sheet= workbook.getSheetAt(0);
		 Cell=sheet.getRow(0).getCell(0);
		 String CellData=Cell.getStringCellValue();
		 System.out.println(sheet.getRow(0).getCell(0)); //reading the excel data
		 return CellData;
		 
	}
	//@Test(dependsOnMethods={"btest"})
	public String[][] test1()
	{
		 int rowNum = sheet.getLastRowNum() + 1;
		  int colNum = sheet.getRow(0).getLastCellNum();
		  String[][] data = new String[(rowNum - 1)][colNum];

		   int k = 0;
		  for (int i = 1; i < rowNum; i++) {
		   Row = sheet.getRow(i);
		   for (int j = 0; j < colNum; j++) {
		    Cell = Row.getCell(j);
		    String value = Cell.getStringCellValue();
		    data[k][j] = value;
		    System.out.println("the value is: " + value);
		   }
		   k++;
		  }

		 return data;
		
	}
	
	
}
