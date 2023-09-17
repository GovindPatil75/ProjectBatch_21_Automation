package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Library {
	
	public static String excelData_String(String SheetName,int row,int cell) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		
	}

   public static String excelData_Numeric(String SheetName,int row,int cell) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		double data= wb.getSheet(SheetName).getRow(row).getCell(cell).getNumericCellValue();
		
		return String.valueOf(data).replace(".0", "");
	}

}
