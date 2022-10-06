package com.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	
	
	
@Test
	public void getCalender() throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(6l, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(3l, TimeUnit.SECONDS);
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	driver.findElement(By.id("datepicker")).click();
	//driver.findElement(By.xpath("//a[text()='24']")).click();
	String actualyear = driver.findElement(By.className("ui-datepicker-title")).getText();
	System.out.println(actualyear);
	String month = actualyear.split(" ")[0].trim();
	String year = actualyear.split(" ")[1].trim();
	
	while(!(month.equals("June")&& year.equals("2023"))) {    
	driver.findElement(By.xpath("//a[@title='Next']")).click();                      //both are matching
	 actualyear = driver.findElement(By.className("ui-datepicker-title")).getText();//|| anyone is match
	 month = actualyear.split(" ")[0].trim();
	year = actualyear.split(" ")[1].trim();
	}
	driver.findElement(By.xpath("//a[text()='25']")).click();
	
	/*Thread.sleep(3000);
	List<WebElement> dates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']"));
	for(int i=0; i<=dates.size(); i++) {
		String date = dates.get(i).getText();
		System.out.println(date);
		if (date.equalsIgnoreCase("3")) {
			dates.get(i).click();
			break;
		}*/
	//}
	
	
	Thread.sleep(3000);
	driver.quit();
	}

}
