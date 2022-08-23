package com.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class SeleniumClass2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
	
	    
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);//dynamic wait
		Thread.sleep(3000);
		//driver.get("https://expire.badssl.com/");
		driver.get("https://www.google.com");
		//FirefoxOptions  cop = new FirefoxOptions();
		//cop.setAcceptInsecureCerts(true);
		driver.manage().deleteAllCookies();
		
		
		
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);		
		driver.get("https://expire.badssl.com/");*/

	}

}
