package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class DomsLogin {

		// Using By Class
		// Direct using driver.findElement
		// @FindBy annotation
		// Using How
	
	WebDriver driver;
	
	public DomsLogin(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	
	//DOMS Login Locators
		
	@FindBy(xpath="//a[text()='NORTHERN / EASTERN RCC']") WebElement region;
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(xpath="//button[text()='Log in']") WebElement loginButon;
	
	
	
	public void validateHomePage()
	{
		Assert.assertTrue(driver.getTitle().contains("DISTRIBUTION"), "Home Page does not appear");
	}
	
	
	public void region()
	{
		System.out.println("LOG:INFO Username Entered");
		region.click();
	}
	
	public void enterUserName(String unamee)
	{
		System.out.println("LOG:INFO Username Entered");
		username.sendKeys(unamee);
	}
	
	public void enterPassword(String upasss)
	{
		System.out.println("LOG:INFO Password Entered");
		password.sendKeys(upasss);
	}
	
	
	//From xl
	
	public void enterUserName()
	{
		System.out.println("LOG:INFO Username Entered");
		username.sendKeys("kul_Subbarao");
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
