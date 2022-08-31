package com.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6l, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(3l, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");//auto suggestive drop down/dynamic drop down/fixed-static
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		List<WebElement > totalList = driver.findElements(By.xpath("//div[contains(@class,'lrtEPN _17d0yO')]"));
		                                                                       //return list of webelement;
		
		for (int i=0;i<totalList.size();i++) {
			//totallist.get(i).getText();
		      System.out.println(totalList.get(i).getText());    
		     if (totalList.get(i).getText().equalsIgnoreCase("iphone 13 pro")){
		    	  totalList.get(i).click();
		      }      
				}
		Thread.sleep(3000);
		driver.quit();
		//if we can inspect any pop-up /alert, we can close it by selenium;
		                    //no need to use switch to/move to method;
		
		
		//for inpect in dynamic dropdown, we go to css selector page, go to event listener then click,
		//scroll down and click on blur, then remove all element from blur. we can inspect any keys from drop down
		
	}

}
