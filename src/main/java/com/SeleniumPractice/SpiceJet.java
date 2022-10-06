package com.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);//dynamic wait
		driver.get("https://www.spicejet.com/");
	//radio button
		//driver.findElement(By.xpath("(//div[contains(@class,'css-76zvg2 r-homxoj r-ubezar r-1ozqkpa')])[1]")).click();
	//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']")).click();
	//where to go
	//driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys("Dhaka");
	
		
	//select passengers	
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
	  /* WebElement sd = driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
		JavascriptExecutor je = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		je.executeScript("arguments[0].scrollIntoView();", sd);
		WebElement sdd = driver.findElement(By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']"));
		WebElement dd = driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']"));
		Actions ac = new Actions(driver);
		Thread.sleep(3000);
		ac.moveToElement(sd).click().perform();
		Thread.sleep(3000);
		ac.moveToElement(sdd).click().perform();
		Thread.sleep(3000);
		ac.moveToElement(dd).click().perform();*/
		
		//currency
		//driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")).click();
		/*WebElement aa = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73'])[3]"));
		JavascriptExecutor jv = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		jv.executeScript("arguments[0].scrollIntoView();", aa);
		Actions ab= new Actions(driver);
		Thread.sleep(3000);
		ab.moveToElement(aa).click().perform();*/
	//searchflight
//driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		//System.out.println(driver.getTitle());
		
		
	//Thread.sleep(3000)	;
//driver.quit();
	}

}
