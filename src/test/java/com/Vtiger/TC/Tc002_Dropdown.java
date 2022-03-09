package com.Vtiger.TC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Tc002_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		//String orgname=("h");
		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys("c1");
		Thread.sleep(3000);
		Select sal=new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		sal.selectByVisibleText("Biotechnology");
		Select sal1 =new Select(driver.findElement(By.xpath("//select[@name=\"accounttype\"]")));
		sal1.selectByVisibleText("Customer");
		Select sal2=new Select(driver.findElement(By.xpath("//select[@name=\"rating\"]")));
		sal2.selectByVisibleText("Acquired");
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"txtBox\"]")).sendKeys("c1");
		Select sal3=new Select(driver.findElement(By.xpath("//select[@id=\"bas_searchfield\"]")));
		sal3.selectByVisibleText("Organization Name");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		
	
		
	}
	
	

}
