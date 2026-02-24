package com.tka.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public void LoginPage()
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("student");
		UserName.click();
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Password123");
		pwd.click();
		
		WebElement submit = driver.findElement(By.className("btn"));
		submit.click();
	}
	
	public void Text()
	
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("student");
		UserName.click();
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Password123");
		pwd.click();
		
		WebElement submit = driver.findElement(By.className("btn"));
		submit.click();
		
		WebElement heading = driver.findElement(By.className("post-title"));
		
		String ActualHeading = heading.getText();
		String ExpHeading = "Logged In Successfully";
		
		if(ActualHeading.equals(ExpHeading))
		{
			System.out.println("Test Case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
	}
	
public void Title()
	
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("student");
		UserName.click();
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Password123");
		pwd.click();
		
		WebElement submit = driver.findElement(By.className("btn"));
		submit.click();
		
		String TitleName = driver.getTitle();
		
		String ExpTitle = "Dashboard";
		
		if(TitleName.equals(ExpTitle))
		{
			System.out.println("Title Test Case is passed");
		}
		else
		{
			System.out.println("Title Test case is failed");
		}
	}
	
	
}
