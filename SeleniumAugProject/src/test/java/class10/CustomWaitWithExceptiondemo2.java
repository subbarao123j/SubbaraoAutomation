package class10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWaitWithExceptiondemo2 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().fullscreen();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
	
			driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
				
				
			waitForWebEleemnt(driver, 30,By.xpath("//[text()='WebDriver'"));
			
			
		
	}

	public static void waitForWebEleemnt(WebDriver driver, int maxTime, By byLocator) {
		
		
		boolean status = true;
		
		int counter=1;
		
		while(status && counter <=maxTime)
		{
		
			try 
		{
				WebElement ele =driver.findElement( byLocator);
				
				status =false;
				
				System.out.println("Element found");
				
				System.out.println(ele.getText());
				
				
				
			} 
		catch (Exception e)
		 
		{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
				
				}
				counter++;
				
			System.out.println("Eleemnt not Present--waitn for element");
			
			}
}
	}

		
	}


