package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	public static void main(String[] args) {
		
		//Setup Executable --Browser --BrowserDriver class 
		WebDriverManager.chromedriver().setup();
		
		//Browser execution Browser Driver class -Object
		ChromeDriver driver=new ChromeDriver();
		
		//
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver2=new EdgeDriver();
		driver2.get("https://www.facebook.com/");
		driver2.manage().window().maximize();
		
		

	}

}
