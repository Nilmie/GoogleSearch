package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Selenium {
	@Test

	public void testSearch()
	{
		try {
			
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nilmie\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.lk");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
	//	driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.linkText("Selenium - Web Browser Automation"));
		driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		
		
		String webTitle = driver.getTitle();
		
		Assert.assertEquals(webTitle, "Selenium - Web Browser Automation");
		driver.close();
		driver.quit();
		}
		
		catch (NoSuchElementException e) 
	    {
	    	System.out.println("Element was not found sorry");
	    }
		catch (NoAlertPresentException e) 
	    {
	    	System.out.println("Alert was not found sorry");
	    }
		catch (NoSuchWindowException e) 
	    {
	    	System.out.println("Window was not found sorry");
	    }
		
	}

}