package regressionsuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiveProjects {
	
	
	@Test
	//subba code
	public void creatingProject() throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
	driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://10.9.80.189:9001/login");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("kul_subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.className("btn")).click();
		
		Thread.sleep(1000);
		 
		driver.findElement(By.xpath("//*[contains(@class,'cui-briefcase')]")).click();
		Thread.sleep(1000);
   
   
		driver.findElement(By.id("active-tab")).click();
		
		 driver.findElement(By.xpath("//*[@class='k-selectable']//tr//td[4]")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("edit-project")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//*[contains(text(),'Cost Table')]")).click();
		 
		 Thread.sleep(5000);
		 
		 
		 
		 
	}

}
