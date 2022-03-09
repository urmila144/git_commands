package com.Vtiger.TC;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import groovy.time.Duration;

public class Tc0003_Contact {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

		WebElement Fist = driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select sal=new Select(Fist);
		sal.selectByVisibleText("Ms.");

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rupa");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rhitha");
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();

		//driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys("abc");
		Set<String> win = driver.getWindowHandles();	
		Iterator<String> itr = win.iterator();
		String parent = itr.next();
		String child = itr.next();
	

		driver.switchTo().window(child);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys("urmila");
		driver.findElement(By.xpath("//input[@name='search']")).click();
		
		WebElement Second = driver.findElement(By.xpath("//select[@name='search_field']"));
		Select sal2=new Select(Second);
		sal2.selectByVisibleText("Organization Name");
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		
	}
}
