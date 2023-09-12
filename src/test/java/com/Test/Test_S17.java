package com.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S17 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String ParentID=driver.getWindowHandle(); // parent window id -- string 

		// click here -click
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String> AllID=driver.getWindowHandles(); // Parent +child Window ID
		
		//Iterator --->
		
		Iterator<String> IT=AllID.iterator();
		
		while(IT.hasNext()) {
			
			String CHildWindowID=IT.next();
			
			if(!ParentID.equals(CHildWindowID)) {
				
				driver.switchTo().window(CHildWindowID);
				
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
			}
		}
		
		Test_S16.CaptureFullPageScreenshot(driver);

	}

}
