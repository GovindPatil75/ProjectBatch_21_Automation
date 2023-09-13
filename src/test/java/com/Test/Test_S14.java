package com.Test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S14 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//

		WebElement customerId=driver.findElement(By.xpath("//input[@name='cusid']"));
		Test_S18.elementScreenshot(customerId, "CustomerID");
		customerId.sendKeys("12345678");
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		Test_S18.elementScreenshot(submit, "Submit");
		submit.click();
		
		// Alert --- we need to Switch on Alert  --- confirmation alert 
		
		Alert alt =driver.switchTo().alert();
		
		String text=alt.getText();
		System.out.println(text);
		
		//alt.dismiss(); // click on cancel button 
		
		alt.accept(); // click on Ok button
		
		//  Simple Alert --- OK 
		 
		String text2=alt.getText();
		System.out.println(text2);
		
		alt.accept(); // click on Ok button
		
	}
	
	

}
