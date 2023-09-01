package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S8 {

	public static void main(String[] args) {
		
		//Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//Identify DropDown Element
		WebElement DrpCountry=driver.findElement(By.xpath("//select[@name='country']"));
		
		/*
		//Object created for Select Class
		Select select=new Select(DrpCountry);
		
		String DeafultOptionSelected=select.getFirstSelectedOption().getText();
		
		System.out.println(DeafultOptionSelected);
		
		//selectByIndex -int index
		select.selectByIndex(15);
		
		//selectByValue
		select.selectByValue("AMERICAN SAMOA");
		
		select.selectByVisibleText("ANTARCTICA");
		*/
		
		handleDropDown_VisibleText(DrpCountry,"ANTARCTICA");
		
		handleDropDown_Value(DrpCountry,"AMERICAN SAMOA");
		
		handleDropDown_Index(DrpCountry,10);
		
			
	}
	
	public static void handleDropDown_VisibleText(WebElement element,String text) {
		
		Select select=new Select(element);
		select.selectByVisibleText(text);
	
	}
	
    public static void handleDropDown_Value(WebElement element,String value) {
		
		Select select=new Select(element);
		select.selectByValue(value);
	
	}
    
   public static void handleDropDown_Index(WebElement element,int index) {
		
		Select select=new Select(element);
		select.selectByIndex(index);
	
	}

}
