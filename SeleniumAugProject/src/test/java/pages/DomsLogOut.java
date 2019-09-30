package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DomsLogOut {

	WebDriver driver;
	
	public DomsLogOut(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	

	//Phoenix Logout Locators
	
	//@FindBy(xpath="//*[contains(text(),'Logout')]")
	@FindBy(xpath="//*[text()='Logout']")
	
	WebElement logoutButton;
	
	public void logoutFromApplication()
	{
		//welcomeText.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		logoutButton.click();
	}
	
	
}
