package com.Testng_practies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
@Test

	public void A() {

		System.out.println("Launch Browser");
		System.out.println("Get URL");
		System.out.println("Login ");


		Assert.assertEquals(true, true);

		System.out.println("Test Step 1");
		System.out.println(" Test Step 2");
		System.out.println("Test Step 3 ");
		System.out.println("Test Step 4 ");
		System.out.println(" Test Step 5");
		System.out.println(" Logout");
		System.out.println("Close Browser ");
		//assert1.assertAll();


	}


}
