package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupsHandling {
	
	WebDriver driver = new ChromeDriver();
	
		@Test
		
		public void exampleForAlert() throws InterruptedException {
			
			
			driver.manage().window().maximize();
			
			driver.get("C:\\Users\\kul_subbarao\\Desktop");
			
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
			
			Alert alert = driver.switchTo().alert();
			
			System.out.println(alert.getText());
			
			alert.accept();
			
		}
	

}
