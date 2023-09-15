package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_S19 {

	public static void main(String[] args) throws IOException {
		
		String Path="C:\\Users\\Dell\\eclipse-workspace\\ProjectBatch_21_Automation\\TestData\\Data.xlsx";

		FileInputStream file =new FileInputStream(Path);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		String Data_1=wb.getSheet("LoginTest").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(Data_1);
		
		String Data_2=wb.getSheet("LoginTest").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(Data_2);
		
	}

}
