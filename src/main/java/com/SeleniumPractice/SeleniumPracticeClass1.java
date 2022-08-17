package com.SeleniumPractice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPracticeClass1 {

	
	public static void main(String[] args) throws InterruptedException  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	System.out.println(driver.getTitle());	
	//driver.navigate();             //this method didn't give any time for loading the URL page

	driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();//index number follow
	
	driver.findElement(By.id("autocomplete")).clear();
	//Thread.sleep(3000);
	driver.findElement(By.id("autocomplete")).sendKeys("South Korea");
	Thread.sleep(3000);
	driver.findElement(By.id("autocomplete")).clear();
	WebElement s = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	
	Select select = new Select(s);
	//Thread.sleep(3000l);
	select.selectByVisibleText("Option2");
	
	driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Alert']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	//String text = driver.switchTo().alert().getText();
	//System.out.println("I am from alert:  "+ text);
	Thread.sleep(3000);
    WebElement sd = driver.findElement(By.xpath("//*[text()='Mouse Hover']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", sd);

	Actions action = new Actions(driver);
	action.moveToElement(sd).perform();
	Thread.sleep(3000);
	WebElement sdd = driver.findElement(By.xpath("//*[contains(text(),'Reload')]"));
	action.moveToElement(sdd).click().perform();  //for more function, we use perform method
	driver.quit();

	}

}
