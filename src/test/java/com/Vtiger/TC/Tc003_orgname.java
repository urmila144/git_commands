package com.Vtiger.TC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc003_orgname {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys("d1");
		
		WebElement FiRstDD = driver.findElement(By.xpath("//select[@name=\"industry\"]"));
		Select sal=new Select(FiRstDD);
		sal.selectByVisibleText("Banking");
		
		Thread.sleep(3000);
		WebElement secondDD = driver.findElement(By.xpath("//select[@name=\"accounttype\"]"));
		Select sal1=new Select(secondDD);
		sal.selectByValue("4");
		Thread.sleep(3000);
		WebElement ThreedDD = driver.findElement(By.xpath("//select[@name=\"rating\"]"));
		Select sal2=new Select(ThreedDD);
		sal2.selectByVisibleText("Market Failed");
		
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		
				
			
//		driver.findElement(By.xpath("//select[@name=\"industry\"]")).sendKeys("Apparel");
//		driver.findElement(By.xpath("//select[@name=\"accounttype\"]")).sendKeys("Integrator");
//		driver.findElement(By.xpath("//select[@name=\"rating\"]")).sendKeys("Active");
//		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
//		//driver.findElement(By.xpath("//a[@href=\"index.php?module=Contacts&action=index\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();
//		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
//		driver.findElement(By.xpath("//select[@name=\"salutationtype\"]")).sendKeys("Ms.");
//		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("pedasingu");
//		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("siri");
//		driver.findElement(By.xpath("//select[@name=\"leadsource\"]")).sendKeys("Self Generated");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
//		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
//		
		
		
		
		}

}
