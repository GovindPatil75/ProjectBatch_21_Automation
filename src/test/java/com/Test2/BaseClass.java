package com.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	// Browser Open - close
	
	WebDriver driver;
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setUp(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		
		driver.get("https://www.facebook.com/index.php");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}

}
