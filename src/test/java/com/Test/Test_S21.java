package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S21 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// IFrame 
		
		driver.switchTo().frame(0); // Iframe 1
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test");
		
        driver.switchTo().defaultContent(); // Switch MainPage 
        
        WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2); // Iframe2
        
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test1");
        
        driver.switchTo().defaultContent(); // Mianpage 
        
        
        // -------------------------------------
        //Mainpage --->OutterFrame--InnerFrame
        
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3); // Frame 3 
        
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test3");
        
        WebElement innerframe=driver.findElement(By.xpath("(//iframe)[1]"));
        
        driver.switchTo().frame(innerframe); // InnerFrame
        
        driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
        
        
        // 
        driver.switchTo().parentFrame(); // innerframe---Frame3
        driver.switchTo().defaultContent(); //frame3---mainpage 
        
        
        
        
        
        
        
        
	}

}
