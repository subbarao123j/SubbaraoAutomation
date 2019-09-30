package class9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictiWait {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		//Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
				//Explicit wait
				
				WebDriverWait  wait = new WebDriverWait(driver, 30);
				 
				Alert alt= wait.until(ExpectedConditions.alertIsPresent());
				
				System.out.println(alt.getText());
				
				alt.accept();
				
				//driver.switchTo().alert().accept();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("  ")));
				
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));
				
				wait.until(ExpectedConditions.urlContains(""));
				
				wait.until(ExpectedConditions.titleContains(""));
				
				
		
				
		
	

		
	}

}
