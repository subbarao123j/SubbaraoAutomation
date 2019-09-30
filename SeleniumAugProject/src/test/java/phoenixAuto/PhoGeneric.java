package phoenixAuto;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PhoGeneric {

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
		
		
		
		
		Actions act = new Actions(driver);
		
	
			
			act.moveToElement(driver.findElement(By.xpath("//*[contains(@class,'nav-icon cui-cog')]")))

				.pause(1000)
			
			//.click(driver.findElement(By.xpath("//a[contains(text(),'Generic')]")))
			
			.click(driver.findElement(By.xpath("//*[@id=\"vroot\"]/div/nav/ul/li[6]/ul/li[5]/a")))
			.build()
			
			.perform();
			 
			
		driver.findElement(By.xpath("//button[@id='add-node']")).click();
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"modal-dialog-details\"]/div/div[2]/div/span/span/span[1]")).click();
		
		List<WebElement> parent = driver.findElements(By.xpath("//ul[@id='parent_listbox']//li"));
		
		for (WebElement webElement : parent) {
			
			String str =webElement.getText();
			
	if (str.contains("Cost Title")) {
		
		webElement.click();
		break;
		
	} 
			
			
			
		}
			
		driver.findElement(By.id("nodeName")).sendKeys("AutomationCost1");
		driver.findElement(By.id("nodeValue")).sendKeys("100K MYR");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"modal-dialog-details\"]/div/div[6]/div/span/span/span[1]")).click();
		
		List<WebElement> parent1 = driver.findElements(By.xpath("//ul[@id='status_listbox']//li"));
		
		for (WebElement webElement1 : parent1) {
			
			String data2 =webElement1.getAttribute("innerHTML");
			
	if (data2.contains("ACTIVE"))
	{
		
		webElement1.click();
		
		break;
		
	} 
	
		
		
	}
        driver.findElement(By.id("description")).sendKeys("Testing123");
		
		driver.findElement(By.id("save")).click();
	}
}
