package phoenixAuto;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PhConfigLedgerMast {

	public static void main(String[] args) throws InterruptedException {

//System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");

//System.setProperty("webdriver.gecko.driver", "D:\\SOFTWAARES-05082019\\geckodriver-v0.24.0-win64\\geckodriver.exe");



//WebDriver  driver = new FirefoxDriver();

/*ChromeOptions opt = new ChromeOptions();

opt.setHeadless(true);*/

WebDriver  driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
			
		driver.get("http://10.9.80.189:9001/login");
		
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("kul_subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.className("btn")).click();
		
	
		 
		
		
		//Administrative tools
		
		
		
		//driver.findElement(By.xpath("//*[@id=\\\"vroot\\\"]/div/nav/ul/li[5]")).click();
		Actions act = new Actions(driver);
		
	
			
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"vroot\"]/div/nav/ul/li[5]")))

				.pause(1000)
									
			.click(driver.findElement(By.xpath("//*[@id=\"vroot\"]/div/nav/ul/li[4]/ul/li[1]")))
			.build()
			.perform();
			
			
		driver.findElement(By.xpath("//button[@id='add-node']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"modal-dialog-details\"]/div/div[2]/div/span/span/span[1]")).click();
		
		List<WebElement> accCa =driver.findElements(By.xpath("//ul[@id='parent_listbox']//li"));
		
	
		for (WebElement c : accCa) {
			
			String str1= c.getAttribute("innerHTML");
			
		if (str1.contentEquals("GST expenses")) {
			
			c.click();
			break;
			
			
		
			
		}
		System.out.println(str1);
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
