package com.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		

		WebElement frame = driver.findElement(By.tagName("iframe"));
	    List <WebElement>	totalFrame = driver.findElements(By.tagName("iframe"));
	    totalFrame.size();
	    System.out.println("total frame "+totalFrame.size());
	    driver.switchTo().frame(frame);
		
		WebElement Source  = driver.findElement(By.xpath("//*[@id='draggable']"));//which we drag
		WebElement target = driver.findElement(By.id("droppable"));//where we drop
        Actions ac = new Actions(driver);
        ac.dragAndDrop(Source, target).build().perform();
        driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[text()='Draggable']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
