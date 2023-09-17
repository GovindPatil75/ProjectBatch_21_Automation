package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utility.Library;

public class Test_S19 {

	public static void main(String[] args) throws IOException {
		
		
		
		String Data_0_0=Library.excelData_String("LoginTest", 0, 0); // 0, 0
		System.out.println(Data_0_0);
		
		String Data_0_1=Library.excelData_String("LoginTest", 0, 1);
		System.out.println(Data_0_1);
		
		String Data_0_2=Library.excelData_String("LoginTest", 0, 2);
		System.out.println(Data_0_2);
		
		String Data_0_3=Library.excelData_Numeric("LoginTest", 0, 3);
		
		System.out.println(Data_0_3);
	}

}
