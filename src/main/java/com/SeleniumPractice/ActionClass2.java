package com.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass2 {
	
	
	@Test
	public void CopyPaste() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		    driver.get("https://parabank.parasoft.com/parabank/index.htm");
		    driver.findElement(By.xpath("//a[text()='Register']")).click();
		    Actions action = new Actions(driver);
		    
		  WebElement source = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
		  Thread.sleep(3000);
		  source.sendKeys("Shahana Ahmed");
		    action.keyDown(source,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		    action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			WebElement target = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
			action.keyDown(target,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(3000);
			driver.quit();
	}

}
