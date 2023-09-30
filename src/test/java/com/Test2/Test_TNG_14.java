package com.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_TNG_14 {
	
	@Test
	public void verifyLoginTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Login Test
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.getTxt_email().sendKeys("Test@gmail.com");
		login.getTxt_password().sendKeys("12345678");
		login.getLoginButton().click();
		
		
	}

}
