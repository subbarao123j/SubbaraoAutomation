package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class E2ETest1 {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		System.out.println("==========Runnin before class===============");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		  driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		System.out.println("Browser and Application up and running");
	}
	
	
	@AfterClass
		
	public void tearDown() {
		
		System.out.println("===Runnin after class");
		
		driver.quit();
		
		System.out.println("=========Closed all instances");
	}
		
		
	
	
	
	@Test (description="This to CRM Login with admin")
	
	public void loginApp() {
		
	
		
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"), "Pae Title is not verified");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Loin Failed");
	}
	
@Test (description="This to CRM Logout with admin", dependsOnMethods="loginApp")
	
	public void logoutApp() throws InterruptedException {
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Loin Failed");
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"), "Pae title is verifed after logout");
		
	}

}
 