package com.test1.dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.test1.utility.Properties_data;

public class TestExcel {
	static InputStream is ;
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet;
	private static XSSFCell Cell;
	private static XSSFRow rows;
	@Test
	public  static void test () throws Exception
	{
		File src =new File("C:\\Users\\Admin\\workspace1\\Haiku\\TestData\\TestDataWB.xlsx");
		FileInputStream fis=new FileInputStream(src);
		 workbook=new XSSFWorkbook(fis);
		 sheet= workbook.getSheetAt(0);
		System.out.println(sheet.getRow(0).getCell(0)); //reading the excel data
		Iterator rows = sheet.rowIterator();

		while (rows.hasNext()) {
			XSSFRow row = (XSSFRow) rows.next();
			
			//Iterating all the cells of the current row
			Iterator cells = row.cellIterator();

			while (cells.hasNext()) {
				Cell = (XSSFCell) cells.next();

				if (Cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					System.out.print(Cell.getStringCellValue() + " ");
				} else if (Cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
					System.out.print(Cell.getNumericCellValue() + " ");
				} else if (Cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
					System.out.print(Cell.getBooleanCellValue() + " ");

				} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
				}
			}
			System.out.println();
			
		}
	}
	}
	

