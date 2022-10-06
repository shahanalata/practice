package com.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhpTravel {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6l, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(3l, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demouser");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
