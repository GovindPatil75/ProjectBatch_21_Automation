package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Element -XPath Attribute -Relative XPath 
		// Tagname[@Attribute name='Attribute Value']
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("Test@gmail.com");
		
		WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("12345678");
		
		WebElement BtnLogin=driver.findElement(By.xpath("//button[@type='submit']"));
		BtnLogin.click();
		
		
		
	}

}
