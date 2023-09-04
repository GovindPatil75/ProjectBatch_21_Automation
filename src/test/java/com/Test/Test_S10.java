package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S10 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// Actions --Object 
		Actions act=new Actions(driver);
		
		WebElement BankProject=driver.findElement(By.xpath("//a[text()='Selenium']"));
		
		//Moveto Element + Click
		act.moveToElement(BankProject).click().build().perform();

	}

}
