package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddigCustomer2;
import pages.DomsLogOut;
import pages.LogOut2;
import pages.DomsLogin;
import pages.Login2;

public class LoginToApplication3 {
	
	@Test
	public void loginToPhoenix() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//Phoenix TestEnvironment URL
		driver.get("http://10.9.80.189:9001/login");
		System.out.println(driver.getTitle());
		
	
		Login2 login2=PageFactory.initElements(driver, Login2.class);
		
		AddigCustomer2 addCust=PageFactory.initElements(driver, AddigCustomer2.class);
		
		LogOut2 logOut2=PageFactory.initElements(driver, LogOut2.class);
		
		
		Thread.sleep(2000);
		login2.validateHomePage();
		//Thread.sleep(2000);
		login2.enterUserName();

		login2.enterPassword();
		login2.clickLoginButton();
		Thread.sleep(2000);
		
		addCust.clickCustomernewButton();
		addCust.newCompay2();
		
		addCust.newCompay();
		addCust.cName();
		addCust.cPCode();
	
		addCust.clickCustomerButton();
		
		
		logOut2.logoutFromApplication();	
		Thread.sleep(2000);
		driver.quit();
	}

}
