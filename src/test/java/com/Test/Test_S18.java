package com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S18 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		// Screenshot -Webelement 
		
		WebElement logoElement=driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));
		
		File src=logoElement.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir"); 
		File destn=new File(path+"\\Screenshot\\logo.png");
		
		FileUtils.copyFile(src, destn);
		
		
		elementScreenshot(logoElement,"LogoElement");
		
		
		
	}
	
	public static void elementScreenshot(WebElement element,String ElementName) throws IOException {
		
		File src=element.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir");
		File destn=new File(path+"\\Screenshot\\"+ElementName+".png");
		FileUtils.copyFile(src, destn);
		
	}

}
