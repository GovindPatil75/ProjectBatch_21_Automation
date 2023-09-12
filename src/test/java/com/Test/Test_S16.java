package com.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_S16 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String ParentID=driver.getWindowHandle(); // parent window id -- string 
		
		System.out.println("Parent window ID=="+ParentID);
		
		// click here -click
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllID=driver.getWindowHandles(); // Parent +child Window ID
		
		System.out.println("All Window ID =="+AllID);
		
		List<String> list=new ArrayList<String>(AllID);
		
		System.out.println(list.get(0)); // parent window id 
		System.out.println(list.get(1)); // child window id 
		
		
		driver.switchTo().window(list.get(1)); // Switch to Child window 
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
		
		driver.switchTo().window(ParentID); // switch to Parent window 
		
		// full Page ---
		TakesScreenshot ts= driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		String RM=RandomString.make(3);
		
		Date D=new Date();
		int Date =D.getDate();
		
		String currentdate=String.valueOf(Date);
		File Destn=new File("C:\\Users\\Dell\\eclipse-workspace\\ProjectBatch_21_Automation\\"+currentdate+".png");
		
		FileUtils.copyFile(src, Destn);
		
		
		
		
		
		//driver.close(); // current window close 
		
		driver.quit(); // current + all open window 

	}
	
	public static void CaptureFullPageScreenshot(ChromeDriver driver) throws IOException {
		
        TakesScreenshot ts= driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String ProjectPath=System.getProperty("user.dir");
		String RM=RandomString.make(5);
		File Destn=new File(ProjectPath+"\\"+RM+".png");
		FileUtils.copyFile(src, Destn);
	}

}
