package class10;




import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionWithGoogle {

	public static void main(String[] args)  {

		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.google.com/");
		
		
			try {
				driver.findElement(By.xpath("dfdfdsfffffffffff")).click();
			} catch (NoSuchElementException e) {
//System.out.println(e.getMessage());	
System.out.println("subba");

			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
