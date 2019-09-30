package class10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOptions {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
			//ChromeOptions options = new ChromeOptions();
			
			
	
		
		WebDriver driver = new ChromeDriver();
		
			
		
		driver.get("https://www.google.com/");
		
	System.out.println("Current title is " + driver.getTitle());
	
	driver.get("https://www.gmail.com/");
	
	System.out.println("Current title is " + driver.getTitle());
	
	driver.get("https://www.yahoo.com/");
	
	System.out.println("Current title is " + driver.getTitle());
	
	driver.quit();
		
	}

		
	}


