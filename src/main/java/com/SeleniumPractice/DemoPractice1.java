package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//h1[@class='title']"));
		//String actual = driver.findElement(By.xpath("//h1[@class='title']")).getText();
        //String expected = "Signing up is easy";
        //Assert.assertEquals(false, false);
        
    	
		//assertion
		String actual1 =driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println("actual11");
		String expected1 = "Signing up is easy!";
		System.out.println(expected1);
		Assert.assertEquals(actual1, expected1);
        
		
		
	
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Shahana");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Ahmed");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Avon Drive");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("windsor");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("New Jersey");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("08880");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("shahanalata");
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("shaH123!");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("shaH123!");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		

		
		Thread.sleep(3000);
		driver.quit();


	}

}
