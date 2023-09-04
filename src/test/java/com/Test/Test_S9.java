package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S9 {

	public static void main(String[] args) {
		
		//Browser Open
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				
				//Identify DropDown Element
				WebElement DrpCountry=driver.findElement(By.xpath("//select[@name='country']"));
				
				Test_S8.handleDropDown_Index(DrpCountry, 9);
				//Test_S8.handleDropDown_Value(DrpCountry, null);
				//Test_S8.handleDropDown_VisibleText(DrpCountry, null);
				
				Select select=new Select(DrpCountry);
				List<WebElement> list=select.getOptions();
				
				System.out.println(list.size()); // 264
				
				for(int i=0;i<list.size();i++) {
					
					String text=list.get(i).getText();
					System.out.println(text);
					
					if(text.equals("BARBADOS")) {
						list.get(i).click();
						break;
					}
				}
				
				

	}

}
