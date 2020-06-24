package regressionsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddCustomer {

	
	

	@Test
	//subba code
	public void addNewCustomer() throws InterruptedException {
		
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
		
	//Adding Customer
		 
		 Thread.sleep(2000);
		 
			driver.findElement(By.xpath("//a[contains(@href,'customers')]")).click();
				
			driver.findElement(By.xpath("//button[@id='add-role']")).click();
			
			
			//C Form
			driver.findElement(By.xpath("//*[contains(text(),'Name')]//following::input[1]")).sendKeys("TELECOMSubba1");
			
			driver.findElement(By.xpath("//*[contains(text(),'Name')]//following::input[2]")).sendKeys("TELECOMSubbaCcode1");
			
			driver.findElement(By.xpath("//*[contains(text(),'Name')]//following::input[3]")).sendKeys("TELECOMSubbaPCode3");
			
			//status
			
			
			WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
			
			Select sel = new Select(dropdown);
			
			sel.selectByVisibleText("Active");
			
			
			
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
			
			Thread.sleep(1000);
			System.out.println("Customer has been added successfully under Customer Management");
			
			Thread.sleep(1000);
		
		
		
		
		
}
}