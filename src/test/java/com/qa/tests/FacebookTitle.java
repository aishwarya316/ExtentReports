package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTitle {
	static WebDriver driver ;
	
     @BeforeMethod
		public static void Setup()
		{
			driver = new ChromeDriver();
			driver.get("https://m.facebook.com/login/?locale2=en_GB");
		 }
     @Test(priority=2)
 	public static void getTitle2()
 	{
    	
 		Assert.assertEquals(driver.getTitle(),"LogFacebook");
 	}
     
	   @AfterMethod
	   public static void tearDown()
	    {
		driver.close();
	      }

}
