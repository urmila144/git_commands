package com.Vtiger.TC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc001_CreatetheOrganization {

	public static void main(String[] args) throws InterruptedException {



		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	
		driver.manage().window().maximize();
		//driver.findElement(By.className("txtBox")).click();
		
		String orgname=("a1ooaa");
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
		Thread.sleep(2000);
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		sel.selectByValue(" Hospitality");


		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		//driver.findElement(By.xpath("//img[@border='0']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		//driver.findElement(By.xpath("//input[@class='searchBox']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//input[@class='txtBox']")).click();
		
		
		
		
		
		//Select sel=new Select("//select[@name=\"industry\"]");

		//String str="we";
		//Select sel = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		
		//sel.selectByVisibleText("//option[@value=\"Environmental\"]")
		//sel.selectByValue("Apparel");
		//driver.findElement(By.xpath("//select[@name=\"industry\"]")).click();
		
	}

}

