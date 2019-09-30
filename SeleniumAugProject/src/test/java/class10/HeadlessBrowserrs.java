package class10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserrs {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
			ChromeOptions opt = new ChromeOptions();
			
			//FirefoxOptions fire = new FirefoxOptions(source)
			
			// for IE not availabile
			
			opt.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(opt);
		
		//driver.manage().window().fullscreen();
		driver.get("https://www.google.com/");
		
	System.out.println("Current title is " + driver.getTitle());
	
	driver.get("https://www.gmail.com/");
	
	System.out.println("Current title is " + driver.getTitle());
	
	driver.get("https://www.yahoo.com/");
	
	System.out.println("Current title is " + driver.getTitle());
	
	driver.quit();
		
	}

		
	}


