package com.tka.feb25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidProduct 
{
	public void InvProduct()
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://javabykiran.in/other/CC/");
		WebElement search = driver.findElement(By.name("search[keywords]"));
		search.sendKeys("Invalid Product");
		
		WebElement sumbit = driver.findElement(By.xpath("//*[@id=\"top_header\"]/div[2]/div[2]/div/div/form/div/div[2]/button"));
		sumbit.click();
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"ccScroll\"]/ul/li"));
		
		//String text = "No products found.";
		String AtualText = text.getText();
		String ExpectedText = "No products found.";
		
		if(AtualText.equals(ExpectedText))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		driver.close();
		
	}
}
