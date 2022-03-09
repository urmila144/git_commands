package github;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_1 {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://github.com/join");
		driver.findElement(By.xpath("https://github.com/join")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("urmila4");
		//Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@name='user[email]']")).sendKeys("urmiladevip14@gmail.com");
	driver.findElement(By.xpath("//input[@name='user[password]']")).sendKeys("12b01a05d1");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
