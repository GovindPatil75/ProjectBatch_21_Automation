package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S13 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//bugspotter -elemet -Upper case -using Keyboard -Shift
		
		Actions act=new Actions(driver);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		
		act.keyDown(email, Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();
		
		// Copy paste Data -using keyboard  
		
		// ctrl+a -- data select
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		// ctrl+c  -- copy 
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		// element -click
		
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.click();
		
		// ctrl +v -- paste
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		

	}

}
