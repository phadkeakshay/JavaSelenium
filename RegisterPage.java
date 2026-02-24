package com.tka.feb24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage 
{
	public void RegPage()
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://javabykiran.in/other/CC/");
		WebElement reglink = driver.findElement(By.xpath("//*[@id=\"box-session\"]/a[2]"));
		reglink.click();
		
		WebElement partlink = driver.findElement(By.partialLinkText("Login here"));
		partlink.click();
		
		WebElement btn = driver.findElement(By.name("submit"));
		String loginAtt = btn.getDomAttribute("class");
		
		if(loginAtt.equals("button"))
		{
			System.out.println("Test Case passed");
		}
		else
		{
			System.out.println("Test Case failed");

		}
		
		driver.close();
		
	}

}
