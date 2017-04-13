package com.mycompany.demoqt.excelreader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Reader {

	public String path;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	public Excel_Reader(String path) {
		this.path=path;
		try{
			fis = new FileInputStream(path);
		    workbook = new XSSFWorkbook(fis);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	// To get specific cell data from excel sheet with the help of column name and row number 
	public String getCellData(String sheetName,String colName,int rowNum)
	{
		try
		{
			int col_Num = 0;
			int index= workbook.getSheetIndex(sheetName);
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(0);
			for(int i=0; i<row.getLastCellNum();i++)
			{
				if(row.getCell(i).getStringCellValue().equals(colName))
				{
					col_Num = i;
				}
			}
			row = sheet.getRow(rowNum-1);
			cell = row.getCell(col_Num);
			
			if(cell.getCellType()==Cell.CELL_TYPE_STRING){
				return cell.getStringCellValue();
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				return String.valueOf(cell.getNumericCellValue());
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN)
			{
				return String.valueOf(cell.getBooleanCellValue());
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
			{
				return "";
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	// to get  data from excel sheet with the help of  column number and row number directly:     EXAMPLE OF METHOD OVERLOADING
	public String getCellData(String sheetName,int colName,int rowNum)
	{
		try
		{
			int index= workbook.getSheetIndex(sheetName);
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(0);
			
			row = sheet.getRow(rowNum-1);    // header is also call as row 1 but we don't want header
			cell = row.getCell(colName);    // column count start with 0 in excel.
			
			if(cell.getCellType()==Cell.CELL_TYPE_STRING){
				return cell.getStringCellValue();
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				return String.valueOf(cell.getNumericCellValue());
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN)
			{
				return String.valueOf(cell.getBooleanCellValue());
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
			{
				return "";
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
	// To get row count from the sheet
	public int getRowCount(String sheetName)
	{
		try{
		int index = workbook.getSheetIndex(sheetName);
		if(index== -1)
		{
			return 0;
		}
		else{
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum()+1;
			return number;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	//To get column count from the sheet
	public int getColCount(String sheetName)
	{
		try{
		int index = workbook.getSheetIndex(sheetName);
		if(index== -1)
		{
			return 0;
		}
		else{
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(0);
			return row.getLastCellNum();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
		
	}
	
	
	public static void main (String[] args){
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\exceldata\\TestData.xlsx";
		Excel_Reader obj = new Excel_Reader(path);
		System.out.println(obj.getCellData("Test", "User Role",2));
		System.out.println(obj.getRowCount("Test"));
		System.out.println(obj.getColCount("Test"));
		System.out.println(obj.getCellData("Test",2, 2));
	}

}
