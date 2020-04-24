package com.qa.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitle  {
	static WebDriver driver ;
	
    @BeforeMethod
		public static void Setup()
		{
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		 }
    @Test(priority=1)
	public static void getTitle1()
	{
   	
		Assert.assertEquals(driver.getTitle(),"Google");
	}
    
	   @AfterMethod
	   public static void tearDown()
	    {
		driver.close();
	      }
}
