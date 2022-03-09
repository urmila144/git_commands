package com.Vtiger.TC;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc0004_OrganizationName_Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://localhost:8888");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		Random random=new Random();
		int randomnum = random.nextInt();
		String orgname="abc4"+randomnum;
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//input[@name='query_string']")).sendKeys(orgname);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(orgname);
		driver.findElement(By.xpath("//select[@name='search_field']")).sendKeys("Organization Name");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='ACC49 ']")).click();
	}
	

}
