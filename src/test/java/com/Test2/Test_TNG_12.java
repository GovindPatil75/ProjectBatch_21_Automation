package com.Test2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TNG_12 {
	
	@Test
	public void verifyLoginTest() {
		
		System.out.println("Email ---Action ");
		System.out.println("Password ---Action");
		System.out.println("Login ---Action");
		
		// verify 
		String Actual="Test" ; // driver.gettitle();
		String Expected="Test123";
		
		Assert.assertEquals(Actual, Expected); // Fail 
		
		System.out.println("Test Step 5");
		System.out.println("Test Step 6");
	}
	
	

}
