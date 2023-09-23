package com.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_TNG_4 {

	ChromeDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		
		System.out.println("Before Method -Browser Open");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void VerifyTestxyz() {
		
		System.out.println("Test Xyz ");
		// Element identify -- Actions 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");
	}
	
	@Test
	public void VerifyTestpqr() {
		
		System.out.println("Test PQR ");
		// Element identify -- Actions 
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test");
	}
	
	@AfterMethod
	public void teadDown() {
		System.out.println("After Method -Browser Close");
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}
