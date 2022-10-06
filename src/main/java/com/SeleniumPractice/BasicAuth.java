package com.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuth {

	
		
@Test
public void BasicAuth() {
		WebDriverManager.chromedriver().setup();   ////not authentification in page.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		//driver.get("https://the-internet.herokuapp.com/basic_auth");//not working,
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//search this url with npoint then check ii----the-internet.herokuapp.com, then /npoint(basicauth)
		//take id and password,we can handle this problem like this technique below:
		//https://username:password@url, then it bypass and run
		boolean b= driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
		driver.quit();
	}

}
