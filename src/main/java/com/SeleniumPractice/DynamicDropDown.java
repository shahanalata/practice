apackage com.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();			   
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);	
			driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
			driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("toys");
		List<WebElement > totlList = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		
		for (int i=0;i<totlList.size();i++) {
		
      System.out.println(totlList.get(i).getText());  
	
     if (totlList.get(i).getText().equalsIgnoreCase("toys for kids")){
    	  totlList.get(i).click();
      }      
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
