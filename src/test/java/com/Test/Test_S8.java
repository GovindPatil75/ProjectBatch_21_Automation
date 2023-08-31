package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S8 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement DrpCountry=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select select=new Select(DrpCountry);
		
		String DeafultOptionSelected=select.getFirstSelectedOption().getText();
		
		System.out.println(DeafultOptionSelected);
		
		//selectByIndex -int index
		select.selectByIndex(15);
		
	}

}
