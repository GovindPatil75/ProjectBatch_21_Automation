package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S15 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//

		WebElement customerId=driver.findElement(By.xpath("//input[@name='cusid']"));
		customerId.sendKeys("12345678");
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		String text=handleAlert(driver).getText();
		System.out.println(text);
		handleAlert(driver).accept();
		
		String text1=handleAlert(driver).getText();
		System.out.println(text1);
		handleAlert(driver).accept();
		
	}
	
	
	public static Alert handleAlert(ChromeDriver driver) {
		
		return driver.switchTo().alert();
	}

}
