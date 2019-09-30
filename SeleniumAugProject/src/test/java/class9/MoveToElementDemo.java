package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MoveToElementDemo {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		
				Actions act = new Actions(driver);
				
				act.moveToElement(driver.findElement(By.xpath("//button[text()='Automation Tools']")))
				.pause(3000)
				
				.click(driver.findElement(By.xpath("//a[text()='Appium']")))
				.build()
				
				.perform();
				
		
	

		
	}

}
