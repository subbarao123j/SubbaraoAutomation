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

public class CustomeWaitMyPracticse {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().fullscreen();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		

		
		waitForWebElement1(driver, 30, "//button[text()='Click me to start timer']").click();
		
		//waitForWebElement1(driver,30, By.xpath("//p[text()='WebDriver'])"));
		
		waitForWebElement1(driver, 20, "//p[text()='WebDriver']");
		
		
		System.out.println("Next step proceeding");
				
		
	

		
	}

	private static void waitForWebElement1(WebDriver driver , int maxTime, By byLocator) {
		boolean status = true;
		
	int counter =1;
		
		while (status && counter <=maxTime)
		
		{
		
			try 
			
			{
				WebElement ele =driver.findElement(byLocator);
				
				status= false;
				
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

				
				System.out.println("waitng for webelement");

			}
			
						
		}
	}

	
	//second
	private static WebElement  waitForWebElement1(WebDriver driver , int maxTime, String  xpath) {
		boolean status = true;
		
	int counter =1;
	
	WebElement ele = null;
		
		while (status && counter <=maxTime)
		
		{
		
			try 
			
			{
				 ele =driver.findElement(By.xpath(xpath));
				
				status= false;
				
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

				
				System.out.println("waitng for webelement");

			}
			
						
		}
		return ele;
		
	}


	
	
	
	
	


	}



