package com.PracticeNewSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3l, TimeUnit.SECONDS);
		driver.get("https://qavbox.github.io/demo/webtable/");
		List<WebElement> allHeaders=driver.findElements(By.xpath("//table[contains(@id,'table01')]//th"));
		System.out.println(allHeaders.size());
		//Assert.assertEquals(allHeaders.size(), 4,"column not match");
		
		
		for(WebElement e : allHeaders) {
			String value=e.getText();
			System.out.println(e.getText());
			
			}
			
		
		
driver.quit();
	}

}
