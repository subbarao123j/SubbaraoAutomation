package testCasesDependencies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyApplication2 {
	
	
	WebDriver driver;
	
	
	@BeforeClass
	
	public void startbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("Browser started");
		
		
	}
	
	
	
	@Test
	
	public void startApp() 
	{
		
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/symfony/web/index.php/auth/login");
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String currentURL = driver.getCurrentUrl();
		
		Assert.assertTrue(currentURL.contains("auth/login"));
		
		
	System.out.println("Starting app");
	}
	
    @Test(dependsOnMethods="startApp")
	
	public void loginApp() 
	{
    	driver.findElement(By.id("txtUsername")).clear();
    	driver.findElement(By.id("txtUsername")).sendKeys("subba");
    	driver.findElement(By.id("txtPassword")).clear();
    	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    	driver.findElement(By.id("btnLogin")).click();
    	
    	boolean status= driver.findElement(By.xpath("//span[text()='Admin']")).isDisplayed();
    	Assert.assertTrue(status);
    	
    	
    	
	System.out.println("Login app");
	}
        
   @Test (dependsOnMethods="loginApp")

   public void logoutApp()  
  {
	   
	   driver.findElement(By.xpath("//*[text()='keyboard_arrow_down']")).click();
	   driver.findElement(By.xpath("//*[text()='Logout']")).click();
	   
	   Assert.assertTrue(driver.findElement(By.xpath("//*[@id='txtUsername']")).isDisplayed());
	 
	   
  }
   
   @AfterClass
   public void closeApp() {
	   
	   driver.quit();
   }
	

}
