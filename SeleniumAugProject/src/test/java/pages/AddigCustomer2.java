package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddigCustomer2 {

		// Using By Class
		// Direct using driver.findElement
		// @FindBy annotation
		// Using How
	
	WebDriver driver;
	
	public AddigCustomer2(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	
	//Phoenix New Customer Locators
		

	@FindBy(xpath="//a[contains(@href,'customers')]") WebElement customer;
	@FindBy(xpath="//button[@id='add-company']") WebElement newc;
	
	@FindBy(name="name") WebElement cname;
	@FindBy(id="code") WebElement ccode;
		
	@FindBy(id="pentaCode") WebElement pcode;
	
	@FindBy(xpath="//button[text()='Submit']") WebElement cbutton;
	
	
	
	
	
	public void validateHomePage()
	{
		Assert.assertTrue(driver.getTitle().contains("Login"), "Home Page does not appear");
	}
	
	
	
	public void clickCustomernewButton()
	{
		System.out.println("Customer Clicked i Phoeix ");
		customer.click();
	}
	
	
	public void newCompay2()
	{
		System.out.println("Customer Clicked i Phoeix ");
		newc.click();
	}
	
	public void newCompay()
	{
		System.out.println("Customer newCompay");
		cname.sendKeys("TELECOM2");
	}
//3
	public void cName()
	{
		System.out.println("Customer name ");
		ccode.sendKeys("c4555522");
	
	}
	
	

	
	public void cPCode()
	{
		System.out.println("Customer cp code ");
		pcode.sendKeys("cp333322");
	}
	
	public void clickCustomerButton()
	{
		System.out.println("Customer Clicked i Phoeix ");
		cbutton.click();
	}
	
}
