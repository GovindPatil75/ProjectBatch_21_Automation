package com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S16 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String ParentID=driver.getWindowHandle(); // parent window id -- string 
		
		System.out.println("Parent window ID=="+ParentID);
		
		// click here -click
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllID=driver.getWindowHandles(); // Parent +child Window ID
		
		System.out.println("All Window ID =="+AllID);
		
		List<String> list=new ArrayList<String>(AllID);
		
		System.out.println(list.get(0)); // parent window id 
		System.out.println(list.get(1)); // child window id 
		
		
		driver.switchTo().window(list.get(1)); // Switch to Child window 
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
		
		driver.switchTo().window(ParentID); // switch to Parent window 
		
		//driver.close(); // current window close 
		
		driver.quit(); // current + all open window 

	}

}
