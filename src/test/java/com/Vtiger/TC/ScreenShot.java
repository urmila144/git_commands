package com.Vtiger.TC;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.File;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	@Test
	
	public void takeScreenshot1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		
		Thread.sleep(2000);
		
//		File src=TakeScreenShot
//		
//		String destfile=System.getProperty("user.dir")+"/Screenshots/"+"amazon"+".png";
//		
//		File finaldest  =new File(destfile);
//		
//		
//		FileUtils.copyFile(srcfile,finaldest);
		
		
}
	

}
