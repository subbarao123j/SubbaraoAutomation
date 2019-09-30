package phoenixAuto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreatingProject2 {
	
	@Test
	//subba code
	public void creatingProject() throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
	driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://10.9.80.189:9001/login");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("kul_subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.className("btn")).click();
		
		Thread.sleep(1000);
		 
		driver.findElement(By.xpath("//*[contains(@class,'cui-briefcase')]")).click();
		
		driver.findElement(By.id("add-project")).click();
		Thread.sleep(1000);
		
		
		

		
		//bu1
	driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]//div[2]//span[2]")).click();
	
	List<WebElement> dropdown = driver.findElements(By.xpath("//ul[(@id='businessUnit_listbox')]//li"));


	for (WebElement webElement1 : dropdown) {
		
		String innerhtml = webElement1.getAttribute("innerHTML");
		
	if (innerhtml.contentEquals("BU3")) {
		
		webElement1.click();
		
		
		break;
		
	}
		System.out.println(innerhtml);
		
		
	}
	

 //bu2
	
	
	
	
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id='projectDetails-content']/fieldset[1]/div[3]/div/span/span/span[2]")).click();
	
	List<WebElement> dropdown2 = driver.findElements(By.xpath("//ul[(@id='operativeUnit_listbox')]//li"));


	for (WebElement webElement2 : dropdown2) {
		
		String innerhtml = webElement2.getAttribute("innerHTML");
		
	if (innerhtml.contentEquals("Bahrain")) {
		
		webElement2.click();
		
		
		break;
		
	}
		System.out.println(innerhtml);
		
		
	}
		
	//Expected OrderInTake
	
driver.findElement(By.xpath("//input[@id='expectedOrderIntake']")).sendKeys("23 September 2019");


//Mandatory & Unique Inputs

		
   driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys("phoenixAutomation0012");
	
	
   driver.findElement(By.xpath("//input[@id='projectCode']")).sendKeys("phoenix0012");			

   driver.findElement(By.xpath("//input[@id='sageCode']")).sendKeys("sageCode0013");   
   
   
   
   //Customer
   

driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[2]/div[8]/div/span/span/span[1]")).click();

List<WebElement> dropdown11 = driver.findElements(By.xpath("//ul[(@id='customer_listbox')]//li"));


for (WebElement webElement1 : dropdown11) {
	
	String innerhtml = webElement1.getAttribute("innerHTML");
	
if (innerhtml.contentEquals("TNB"))
		{
	
	webElement1.click();
		break;
	
}

	
}
   
   
   
   //EndCustoemr


driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[2]/div[9]/div/span/span/span[1]")).click();

List<WebElement> dropdown15 = driver.findElements(By.xpath("//ul[(@id='endCustomer_listbox')]//li"));


for (WebElement webElement1 : dropdown15) {
	
	String str = webElement1.getAttribute("innerHTML");
	
	
if (str.contentEquals("TNB")) {
	
	webElement1.click();
	
	break;
	
}

	

}
Thread.sleep(1000);
   //INCO Terms


driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[2]/div[11]/div/span/span/span[1]")).click();
Thread.sleep(1000);

List<WebElement> dropdown16 = driver.findElements(By.xpath("//ul[(@id='incoTerms_listbox')]//li"));


for (WebElement webElement1 : dropdown16) {
	
	String innerhtml = webElement1.getAttribute("innerHTML");
	
if (innerhtml.contentEquals("Financial Conduct Authority")) {
	
	webElement1.click();
	
	
	break;
	
}

}


Thread.sleep(1000);
   
   driver.findElement(By.id("expectedStartDate")).sendKeys("30 September 2019");
   
   driver.findElement(By.id("dateOfCompletion")).sendKeys("30 September 2020");
   
   driver.findElement(By.id("endOfWarranty")).sendKeys("30 September 2021");
   
   
   driver.findElement(By.name("contractValue")).sendKeys("100000");
   
   driver.findElement(By.id("engineeringHour")).sendKeys("80");
   

   
   
   // C currency
   
 
   
	
driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[3]/div[3]/div/span/span/span[1]")).click();
Thread.sleep(1000);

List<WebElement> dropdown7 = driver.findElements(By.xpath("//ul[(@id='contractualCurrency_listbox')]//li"));


for (WebElement webElement1 : dropdown7) {
	
	String innerhtml = webElement1.getAttribute("innerHTML");
	
if (innerhtml.contentEquals("MYR")) {
	
	webElement1.click();
	

	break;
	
}
	
	
}


   
   //Local C
   

Thread.sleep(1000);


driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[3]/div[4]/div/span/span/span[1]")).click();

Thread.sleep(1000);
List<WebElement> dropdown8 = driver.findElements(By.xpath("//ul[(@id='localCurrency_listbox')]//li"));


for (WebElement webElement1 : dropdown8) {
	
	String innerhtml = webElement1.getAttribute("innerHTML");
	
if (innerhtml.contentEquals("MYR")) {
	
	webElement1.click();
	

	break;
	
}
	
	
}

Thread.sleep(1000);

   
   
   driver.findElement(By.id("saveProjectButton")).click();
   Thread.sleep(1000);
   
   String c_url= driver.getCurrentUrl();
   
   if (c_url.contains("projects")) {
	   
	   System.out.println("Project has been saved Succesfully under Project List");
	
}
   else {
	   
	   System.out.println("Project Saving is UnSuccesful  under Project List");
   }
   
	//Adding customer
   Thread.sleep(5000);
	 
	driver.findElement(By.xpath("//a[contains(@href,'customers')]")).click();
		
	driver.findElement(By.xpath("//button[@id='add-company']")).click();
	
	driver.findElement(By.name("name")).sendKeys("TELECOM");
	
	driver.findElement(By.id("code")).sendKeys("c4");
	
	driver.findElement(By.id("pentaCode")).sendKeys("pe78");
	
	
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
	
	Thread.sleep(1000);
	System.out.println("Customer has been added successfully under Customer Management");
	
	Thread.sleep(1000);
   
   driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
   Thread.sleep(1000);
   
   String url2= driver.getCurrentUrl();
   
   Thread.sleep(1000);
   if (url2.contains("logout")) {
	   
	   System.out.println("Logout successfully");
	
}
   
   driver.quit();
   
   System.out.println("Chrome Browser closed succefully");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
