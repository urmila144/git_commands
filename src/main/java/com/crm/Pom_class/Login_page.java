package com.crm.Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_page {
		WebDriver driver;
		
		@FindBy(xpath = "//input[@name='user_name']") 
		private WebElement UN_name;
		
		@FindBy(xpath= "//input[@name='user_password']")
		private WebElement  USER_PSWD;
		
		@FindBy(xpath="//input[@id='submitButton']")
		private WebElement LOGINBTN;
		
		
		
		

		public WebElement getUN_name() {
			return UN_name;
		}

		public WebElement getUSER_PSWD() {
			return USER_PSWD;
		}

		public WebElement getLOGINBTN() {
			return LOGINBTN;
		}
		
	public Login_page (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
}
