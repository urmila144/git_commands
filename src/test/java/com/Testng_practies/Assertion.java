package com.Testng_practies;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	@Test
	public void A() {
		
		System.out.println("Launch Browser");
		System.out.println("Get URL");
		System.out.println("Login ");
		
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals("TYSS", "HYD");
		
		//Assert.assertEquals("urmila","TYSS");
		
		System.out.println("Test Step 1");
		System.out.println(" Test Step 2");
		System.out.println("Test Step 3 ");
		System.out.println("Test Step 4 ");
		System.out.println(" Test Step 5");
		System.out.println(" Logout");
		System.out.println("Close Browser ");
		assert1.assertAll();
		
		
		
	}
	
	

}
