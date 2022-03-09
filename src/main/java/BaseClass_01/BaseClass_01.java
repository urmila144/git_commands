package BaseClass_01;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass_01 {
	
	public  WebDriver driver;
	public  FileLib fil=new FileLib();
	//public WebDriverUtility webutil=new WebDriverUtility();
	
	
	
	@BeforeSuite
	
	public void bf()
	{
		
	}
	
	

}
