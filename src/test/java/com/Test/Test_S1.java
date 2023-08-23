package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S1 {

	public static void main(String[] args) throws Exception {
		
		//Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("Current Url of WebPage="+CurrentUrl);
		
		
		System.out.println("Invalid email");
		System.out.println("Invalid password");
		System.out.println("Login Button");
		
		String Title=driver.getTitle();  //Facebook – log in or sign up
		System.out.println("Title of WebPage="+Title);
		
		String HomepageTitle="Facebook – log in or sign up";
		
		if(HomepageTitle.equals(Title)) {
			System.out.println("Test Case Fail");
		}
		else {
			System.out.println("Test Case Pass");
		}
		
        driver.navigate().to("https://mvnrepository.com/");
        Thread.sleep(5000); // 3 sec
        driver.navigate().back();
        Thread.sleep(3000); // 3 sec
        driver.navigate().forward();
        
        Thread.sleep(3000); // 3 sec
        driver.navigate().refresh();
        
        //driver.close(); // current window close 
        
        driver.quit(); // Current +Open Window Close
		
	}

}
