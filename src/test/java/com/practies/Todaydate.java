package com.practies;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Todaydate {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		
		

		driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("BOM");
		driver.findElement(By.xpath("//span[text()='To']")).click();
		//driver.findElement(By.xpath("//div[text()='DEL']")).click();

		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("DEL");
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		driver.findElement(By.xpath("//div[@aria-label=\"Fri Feb 25 2022\"]")).click();
		driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label=\"Thu Apr 14 2022\"]")).click();

		

		

	}}
