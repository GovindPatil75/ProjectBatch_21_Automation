package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S3 {

	public static void main(String[] args) {
		
		//Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//We Need to Identify WebElement - Locators -* Types -Name
		
		WebElement FirstName=driver.findElement(By.name("firstName"));
		FirstName.sendKeys("BugSpotter");
		
		WebElement LastName=driver.findElement(By.name("lastName"));
		LastName.sendKeys("Test");
		
		WebElement Phone=driver.findElement(By.name("phone"));
		Phone.sendKeys("123456789");
		
		WebElement Email=driver.findElement(By.name("userName"));
		Email.sendKeys("Test@gmail.com");
		
		WebElement Address=driver.findElement(By.name("address1"));
		Address.sendKeys("Test1");
		
		WebElement City=driver.findElement(By.name("city"));
		City.sendKeys("Pune");
		
		WebElement State=driver.findElement(By.name("state"));
		State.sendKeys("Maharastra");
		
		WebElement PostalCode=driver.findElement(By.name("postalCode"));
		PostalCode.sendKeys("1234567");
		
		WebElement Username=driver.findElement(By.name("email"));
		Username.sendKeys("TestDemo");

	    WebElement Password=driver.findElement(By.name("password"));
	    Password.sendKeys("12345678");
	    
	    WebElement ConfirmPWD=driver.findElement(By.name("confirmPassword"));
	    ConfirmPWD.sendKeys("12345678");
	    
	    WebElement Submit=driver.findElement(By.name("submit"));
	    Submit.click();
	    
	}

}
