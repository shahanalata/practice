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

public class ActionExtra1 {
	@Test
 public  void TestOne() throws InterruptedException {
	

	
	 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);//dynamic wait
		driver.get("https://www.amazon.com/");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		action.keyDown(element,Keys.SHIFT).sendKeys("toys").perform();
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		Thread.sleep(3000);
		driver.quit();
		
}
}