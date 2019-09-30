package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login2 {

		// Using By Class
		// Direct using driver.findElement
		// @FindBy annotation
		// Using How
	
	WebDriver driver;
	
	public Login2(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	
	//Phoenix Login Locators
		

	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(xpath="//button[text()='Login']") WebElement loginButon;
	
	
	
	public void validateHomePage()
	{
		Assert.assertTrue(driver.getTitle().contains("Login"), "Home Page does not appear");
	}
	
	
	
	public void enterUserName()
	{
		System.out.println("LOG:INFO Username Entered");
		username.sendKeys("kul_subbarao");
	}
	
	public void enterPassword()
	{
		System.out.println("LOG:INFO Password Entered");
		password.sendKeys("Subbarao1516");
	}
	
	public void clickLoginButton()
	{
		System.out.println("LOG:INFO Clicked on login button");
		loginButon.click();
	}
	
	
	
	public DomsLogOut loginApp()
	{
		
		
		return PageFactory.initElements(driver, DomsLogOut.class);
	}
	
	
}
