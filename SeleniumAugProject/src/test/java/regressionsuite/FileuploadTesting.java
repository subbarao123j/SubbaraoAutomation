package regressionsuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FileuploadTesting {

	
	

	@Test
	//subba code
	public void addNewCustomer() throws InterruptedException, IOException {
		
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
		//driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\SOFTWAARES-05082019\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		driver   = new FirefoxDriver();
		
	driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:\\Users\\kul_subbarao\\Desktop\\fileupload.html");
		
		
		driver.findElement(By.name("testingupload")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\kul_subbarao\\Desktop\\AutoIT\\Fileupload.exe");
		
}
} 