package com.PracticeNewSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
@Test
	public static void tableverify() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3l, TimeUnit.SECONDS);
		driver.get("https://qavbox.github.io/demo/webtable/");
		
		//int rows = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr")).size();
		//System.out.println("Total rows:  "+rows);
		
		/*List<WebElement> totalrows = driver.findElements(By.xpath("//table[contains(@id,'table02')]//tr"));
		System.out.println(totalrows);

		for(WebElement r:totalrows) {
			String valueofrow = r.getText();
			System.out.println(valueofrow);
		}
			

		List<WebElement> column = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th"));
		System.out.println("Total column:  "+ column);
		for(WebElement r:column) {
			String valueofcolumn = r.getText();
			System.out.println(valueofcolumn);
		}
		*/
		
	List<WebElement> position =driver.findElements(By.xpath("//table[contains(@id,'table02')]//tr//td[2]"));
		System.out.println(position.size());
		Assert.assertEquals(position.size(),55,"positionoftable2");
		boolean status=false;
		for(WebElement p:position) {
			String valueofposition = p.getText();
			System.out.println(valueofposition);
			
			if(valueofposition.contains("position")) {
			status=true;
			System.out.println(position);
				
		}
		}
		
		
		/*int totalposition = driver.findElements(By.xpath("//table[@id='table02']//tbody//tr/td[2]")).size();
		System.out.println(totalposition);
		
		for(WebElement r:totalrows) {
			String valueofrow = r.getText();
			System.out.println(valueofrow);
		}*/
			
			
		
		Thread.sleep(3000);
		driver.quit();

	}

}
