package com.Test2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_TNG_3 {

	@BeforeSuite
	public void BS() {
	   System.out.println("Before Suite");	
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method - Browser Open");
	}
	
	@Test(priority=2)
	public void testpqr() {
		System.out.println("Test pqr");
	}
	
	@Test(priority=1)
	public void testxyz() {
		System.out.println("Test xyz");
	}
	
	@Test(enabled=false)
	public void testabc() {
		System.out.println("Test abc");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("After Method - Browser Close");
	}
	
	
	
	@AfterClass
	public void AC() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("After Suite ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
