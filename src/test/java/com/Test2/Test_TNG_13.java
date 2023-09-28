package com.Test2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_TNG_13 {
	
	
	@Test
	public void verifyLoginTest1() {
		
		System.out.println("Email -- Test@gmail.com");
		System.out.println("password -- gmail.com");
		System.out.println("Login  -- click");
		
		// Verify --SoftAssert
		SoftAssert soft=new SoftAssert();
		
		String actual="Test"; // 
		String Expected="Test123";
		
		soft.assertEquals(actual, Expected); // PASS
		
		System.out.println("Test Step 5");
		System.out.println("Test Step 6");
		
		soft.assertAll();
		
	}

}
