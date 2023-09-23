package com.Test2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	// Browser Open - close
	
	@BeforeMethod
	public void setUp() {
		
		System.out.println("Browser Open");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Browser Close");
	}

}
