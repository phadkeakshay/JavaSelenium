package com.tka.feb25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailID 
{
	public void subs()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/");
		
		WebElement sub = driver.findElement(By.name("subscribe"));
		sub.sendKeys("testmail@gmail.com");
		
		WebElement subbtn = driver.findElement(By.id("subscribe_button"));
		subbtn.click();
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"main_content\"]/div[1]/ul/li"));
		
		
		String ActualText = text.getText();
		String ExpectedText = "Your email address has been added to our mailing list.";
		
		if(ActualText.equals(ExpectedText))
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
