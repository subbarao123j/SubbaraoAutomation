package essProjectAutomation;


import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		
		driver.get("http://10.9.80.185:8080/login");
		
		driver.findElement(By.id("username")).sendKeys("kul_Subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.id("clicklogin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'CREATE LEAVE')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='-- SELECT --']")).click();
		
		
	
		List<WebElement> leavetype=driver.findElements(By.xpath("//ul[@id='leaveType_listbox']//li"));
				
		
	       for (WebElement webElement : leavetype) {
			
			
			String innerhtml =webElement.getAttribute("innerHTML");
			
			if (innerhtml.contentEquals("Annual Leave")) {
				
				webElement.click();
				System.out.println("Start date is : " +innerhtml);
				
				break;
						
				
			}
					
	}
	       
	       
	       boolean apptype=driver.findElement(By.id("full")).isSelected();
	       
	       
	       
	}
	

}


