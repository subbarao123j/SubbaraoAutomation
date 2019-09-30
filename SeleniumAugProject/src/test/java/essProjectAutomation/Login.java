package essProjectAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		
		driver.get("http://10.9.80.185:8080/login");
		
		driver.findElement(By.id("username")).sendKeys("kul_Subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.id("clicklogin")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div/button[1]")).click();
		
		driver.findElement(By.id("full")).click();
		
		
		
	}

}
