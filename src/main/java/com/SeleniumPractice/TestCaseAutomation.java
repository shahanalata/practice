package com.SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);//dynamic wait
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//drop-down example
		WebElement ss = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select = new Select(ss);
		Thread.sleep(3000l);
		select.selectByVisibleText("Option2");
		//open tab example
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Set<String>window=driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent = it.next();            //In Iterator class has 2 method-next(),Has next(use loop);
		 String child = it.next();
		 driver.switchTo().window(child);
		 String childtitle = driver.getTitle();
		 System.out.println(childtitle);
		 Assert.assertEquals(childtitle,"Rahul Shetty Academy");
		 Thread.sleep(3000);
		 driver.quit();
		
	}

}
