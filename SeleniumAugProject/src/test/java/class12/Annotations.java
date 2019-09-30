package class12;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	
	
	
	@BeforeSuite
	public void setupReport() {
		
		System.out.println("SetUpReport");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("FlushReport");
	}
	
	@BeforeMethod
	public void setupBrowser() {
		System.out.println("Startin Browser");
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Closin Browser");
		
	}
	@Test
	public void loginApp() {
		System.out.println("Login app");
		
	}
	
	@Test
	public void loginApp2() {
		System.out.println("Login 2app");
		
	}
	
	@Test
	public void loginApp3() {
		System.out.println("Login 3app");
		
	}
	
	
	
	

}
