package class12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CrossbrowserTesting {
	
	
	
	@Test
	
	public void testingCross(String  browser) 
		
	{
		WebDriver driver= null;
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\SOFTWAARES-05082019\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
			
			
		}
		
		else if (browser.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver", "D:\\SOFTWAARES-05082019\\IE64bit\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
			
		}
		
		else {
			
			System.out.println("Sorry wo dont support this browser , Please select Chrome, Firefox, IE to run your test");
		}
		
		
	}
	
	
	

}
