package com.PracticeNewSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3l, TimeUnit.SECONDS);
		driver.get("https://qavbox.github.io/demo/webtable/");
		List<WebElement> position =driver.findElements(By.xpath("//table[contains(@id,'table02')]//tr//td[2]"));
		System.out.println(position.size());
		for(WebElement p:position) {
			String valueofposition = p.getText();
			System.out.println(valueofposition);}
	}

}
