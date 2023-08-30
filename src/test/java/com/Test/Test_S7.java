package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S7 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Xpath By Text() 
		//tagname[text()='Text Value']
		
		//WebElement ForgottenPwd=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//ForgottenPwd.click();
		
		
		//Xpath By Contains()
		//tagname[contains(@Attributename='Static Value')]
		
		WebElement CreateNewAccount=driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		CreateNewAccount.click();
		
		
		//Xpath By Index
		//  (XPath Expression)[index]
		
		Thread.sleep(3000);

		WebElement FirstName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		FirstName.sendKeys("Test");
		
		
	}

}
