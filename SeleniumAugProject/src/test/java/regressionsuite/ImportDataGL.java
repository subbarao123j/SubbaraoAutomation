package regressionsuite;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ImportDataGL {

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
		
	

		
		
		Actions act = new Actions(driver);
		
		
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id='root']//div//div//nav//ul//li[6]//a")))

			.pause(1000)
								
		.click(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/ul/li[6]/ul/li[5]/a")))
		.build()
		.perform();
		
		
		
		
		//GL
		
		driver.findElement(By.id("generalledger")).click();
		

		//Year
		
						
		WebElement eh = driver.findElement(By.id("yearSelect"));
		
		Select eHour = new Select(eh);
		
		eHour.selectByVisibleText("2019");
		
		
		//Month

		WebElement month = driver.findElement(By.id("monthSelect"));
		
		Select monthselect = new Select(month);
		
		monthselect.selectByVisibleText("November");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@class='custom-file-input']")).sendKeys("C:\\Users\\kul_subbarao\\Desktop\\Testing\\GL_2019.xls");
		
		Thread.sleep(3000);
		driver.findElement(By.id("showdata")).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.id("submit1")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(120000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
}
