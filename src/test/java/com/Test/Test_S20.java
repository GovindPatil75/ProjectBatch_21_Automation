package com.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S20 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify The Element --Locator -Id
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys(Library.excelData_String("LoginTest", 0, 0));
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys(Library.excelData_String("LoginTest", 0, 1));

	}

}
