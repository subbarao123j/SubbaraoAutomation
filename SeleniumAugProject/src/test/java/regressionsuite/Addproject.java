package regressionsuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Addproject {
	
	
	@Test
	//subba code
	public void creatingProject() throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
	driver.manage().window().maximize();
		
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		
		driver.get("http://10.9.80.189:9001/login");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("kul_subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.className("btn")).click();
		
		Thread.sleep(1000);
		 
		driver.findElement(By.xpath("//*[contains(@class,'cui-briefcase')]")).click();
		
		driver.findElement(By.id("add-project")).click();
		Thread.sleep(1000);
		
		
		
		//Project Status
		
		WebElement pStatus = driver.findElement(By.xpath("//select[@id='projectStatus']"));
		
		Select ps = new Select(pStatus);
		
		ps.selectByVisibleText("Order");
		
		
				
		//Project Type
	

	WebElement pType = driver.findElement(By.xpath("//select[@id='projectType']"));
	
	Select pt = new Select(pType);
	
	pt.selectByVisibleText("Project");
	
		

 //Businessdivision
	

	WebElement bUnit = driver.findElement(By.id("businessUnit"));
	
	Select buni = new Select(bUnit);
	
	buni.selectByVisibleText("BU3");
	
	
	//Oerative Unit
	
WebElement oUnit = driver.findElement(By.id("operativeUnit"));
	
	Select oUni = new Select(oUnit);
	
	oUni.selectByVisibleText("Kuala Lumpur");
	
			
	//Expected OrderInTake
	
driver.findElement(By.xpath("//input[@id='expectedOrderIntake']")).sendKeys("3 April 2017");


//Mandatory & Unique Inputs

		
   driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys("SSE_132_11_33kVApas_CRP7");
	
	
   driver.findElement(By.xpath("//input[@id='projectCode']")).sendKeys("MY17_03_P01727");			

   driver.findElement(By.xpath("//input[@id='sageCode']")).sendKeys("M173P1772");   
   
   
   
   //Customer
   
   WebElement cust = driver.findElement(By.id("customer"));
	
	Select customer = new Select(cust);
	
	customer.selectByVisibleText("GE");

   
   
   
   //EndCustoemr

WebElement eCust = driver.findElement(By.id("endCustomer"));
	
	Select eCustomer = new Select(eCust);
	
	eCustomer.selectByVisibleText("GE");
   
   
Thread.sleep(1000);
   //INCO Terms


WebElement inCoTerms = driver.findElement(By.id("incoTerms"));

Select inCoTer = new Select(inCoTerms);

inCoTer.selectByVisibleText("Ex Work");





//Exp Start Date

Thread.sleep(1000);
   
   driver.findElement(By.id("expectedStartDate")).sendKeys("13 April 2017");
   
   //Date Of Compeletion
   
   driver.findElement(By.id("dateOfCompletion")).sendKeys("10 January 2021");
   
   //End of warranty
   
   driver.findElement(By.id("endOfWarranty")).sendKeys("10 March 2022");
   
   
   //Thread.sleep(2000);
   //C value
   
   driver.findElement(By.id("contractValue")).sendKeys("2766900");
   
   
   
   
   //driver.findElement(By.id("engineeringHour")).sendKeys("80");
   

   
   
   // C currency
   
   WebElement cCurren = driver.findElement(By.id("contractualCurrency"));

   Select cCurrency = new Select(cCurren);

   cCurrency.selectByVisibleText("MYR");
   
	



   
   //Local C
   WebElement lCurren = driver.findElement(By.id("localCurrency"));

   Select lCurrency = new Select(lCurren);

   lCurrency.selectByVisibleText("MYR");

Thread.sleep(1000);

   //Save
   
   driver.findElement(By.id("saveProjectButton")).click();
   Thread.sleep(1000);
   
   
   
   String c_url= driver.getCurrentUrl();
   
   if (c_url.contains("projects")) {
	   
	   System.out.println("Project has been saved Succesfully under Project List");
	
}
   else {
	   
	   System.out.println("Project Saving is UnSuccesful  under Project List");
   }
   
   
   
	}

}
