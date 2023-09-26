package com.Test2;

import org.testng.annotations.Test;

public class Test_TNG_9 {
	
	
	@Test(groups= {"Regression"})
	public void t1() {
		System.out.println("Test T1");
	}
	
	@Test(groups= {"Critical Regression"})
	public void t2() {
		System.out.println("Test T2");
	}
	
	@Test(groups= {"Regression","Critical Regression"})
	public void t3() {
		System.out.println("Test T3");
	}
	
	@Test(groups= {"Regression"})
	public void t4() {
		System.out.println("Test T4");
	}

}
