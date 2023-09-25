package com.Test2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TNG_7 {
	
	
	@Test
	public void m1() {
		System.out.println("Test m1");
		Assert.assertTrue(false); // code -- fail 
	}
	
	@Test(dependsOnMethods="m1")
	public void m2() {
		System.out.println("Test m2");
	}
	
	@Test(invocationCount=2)
	public void m3() {
		System.out.println("Test m3");
	}
	
	@Test(enabled=false)
	public void m4() {
		System.out.println("Test m4");
	}

}
