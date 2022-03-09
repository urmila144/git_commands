package com.Vtiger.TC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkort {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.findElement(By.xpath("//div[text()='Home']")).click();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//driver.findElement(By.xpath("//div[@class=\"_2MlkI1\"]")).click();
		
		driver.findElement(By.xpath("//div[text()='Home']")).click();
	}

}
