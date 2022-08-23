package com.SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeClass3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\VYEASMA\\Downloads\\file for selunium need\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		
		//getWindowHandle()
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String windowParent = driver.getWindowHandle();//return ID of the single browser window
		System.out.println(windowParent);//CDwindow-numbers
		
		Thread.sleep(5000);
		//getWindowHandles()
       driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();//Open another browser window -child window
       Set<String>windowChild = driver.getWindowHandles();
       
       //First method- iterator()
       Iterator<String> it =windowChild.iterator();
       
       String parentWindow=it.next();
       String childWindow=it.next();
       
       System.out.println("parentWindow :" +parentWindow);
       System.out.println("childWindow  :" +childWindow);
       
       
       //How to use Switching multiple window's
       driver.switchTo().window(parentWindow);
       System.out.println("parentWindow title:"  + driver.getTitle());
       String actual=driver.getTitle();
       String expected= "OrangeHRM";
       Assert.assertEquals(actual, expected);
       
      
       driver.switchTo().window(childWindow);
       System.out.println("childWindow title:"  + driver.getTitle());
}

	}


