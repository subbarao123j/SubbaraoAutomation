package phoenixAuto;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PhCurrencyExchange {

	public static void main(String[] args) throws InterruptedException {

//System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");

//System.setProperty("webdriver.gecko.driver", "D:\\SOFTWAARES-05082019\\geckodriver-v0.24.0-win64\\geckodriver.exe");



//WebDriver  driver = new FirefoxDriver();

/*ChromeOptions opt = new ChromeOptions();

opt.setHeadless(true);*/

WebDriver  driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
			
		driver.get("http://10.9.80.189:9001/login");
		
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("kul_subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.className("btn")).click();
		
	
		 
		
		
		//Administrative tools
		
		
		
		
		Actions act = new Actions(driver);
		
	
			
			act.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'nav-icon cui-cog')]")))

				.pause(1000)
			
					
			.click(driver.findElement(By.xpath("//li[@name='Currency Exchange']")))
			.build()
			
			.perform();
			 
			
		driver.findElement(By.xpath("//a[@id='forecast-tab']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-node")).click();
		
		
	}
}
