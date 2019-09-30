package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DomsLogOut;
import pages.DomsLogin;

public class DomsLoginToApplication {
	
	@Test
	public void loginToPhoenix() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//DOMS TestEnvironment URL
		driver.get("https://10.9.82.13/");
		System.out.println(driver.getTitle());
		
	
		DomsLogin login=PageFactory.initElements(driver, DomsLogin.class);
		DomsLogOut logOut=PageFactory.initElements(driver, DomsLogOut.class);
		
		login.validateHomePage();
		login.region();
		login.enterUserName();
		login.enterPassword();
		login.clickLoginButton();
		Thread.sleep(2000);
		logOut.logoutFromApplication();	
		Thread.sleep(2000);
		driver.quit();
	}

}
