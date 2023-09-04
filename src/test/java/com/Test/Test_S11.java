package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S11 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//Element click -Identify
		
		WebElement DoubleElement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		//Actions Object
		Actions act=new Actions(driver);
		
	  //act.doubleClick(DoubleElement).build().perform();
		
		// Element -Right click 
		
		WebElement RightClickElement=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement Edit=driver.findElement(By.xpath("//span[text()='Edit']"));
		
		act.contextClick(RightClickElement).click(Edit).build().perform();
		
	}
	
	public static void rightClick_onElement(ChromeDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).build().perform();
	}
	
	public static void DoubleClick_onElement(ChromeDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).build().perform();
	}

	public static void moveToElement_Click(ChromeDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}

}
