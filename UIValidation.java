package com.tka.mar10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UIValidation 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority = 1)
	public void Validcred()
	{
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		String actual = driver.getTitle();
		String Expected = "Logged In Successfully | Practice Test Automation";		
		
		Assert.assertEquals(actual, Expected);
		
		driver.findElement(By.xpath("//a[@class = \"wp-block-button__link has-text-color has-background has-very-dark-gray-background-color\"]"));
	}
	
	@Test(priority = 2)
	public void Invalidcred()
	{
		driver.findElement(By.id("username")).sendKeys("student1234");
		driver.findElement(By.name("password")).sendKeys("Password");
		driver.findElement(By.id("submit")).click();
		
		 String pagesource = driver.getPageSource();
		 
		 boolean actual = pagesource.contains("Your username is invalid!");
		
		 //String Expected = "Your username is invalid!";
		 
		 Assert.assertEquals(actual, true);
	}

}
