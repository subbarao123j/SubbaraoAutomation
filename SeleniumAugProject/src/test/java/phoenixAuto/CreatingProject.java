package phoenixAuto;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreatingProject {

	public static void main(String[] args) throws InterruptedException {

//System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
System.setProperty("webdriver.chrome.driver", "D:\\SOFTWAARES-05082019\\77\\chromedriver_win32\\chromedriver.exe");

//System.setProperty("webdriver.gecko.driver", "D:\\SOFTWAARES-05082019\\geckodriver-v0.24.0-win64\\geckodriver.exe");



//WebDriver  driver = new FirefoxDriver();

/*ChromeOptions opt = new ChromeOptions();

opt.setHeadless(true);*/

WebDriver  driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
			
		driver.get("http://10.9.80.189:9001/login");
		
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("kul_subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.className("btn")).click();
		
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//*[contains(@class,'cui-briefcase')]")).click();
		
		driver.findElement(By.id("add-project")).click();
		Thread.sleep(2000);
		
		
		

		
		//bu1
	driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]//div[2]//span[2]")).click();
	
	List<WebElement> dropdown = driver.findElements(By.xpath("//ul[(@id='businessUnit_listbox')]//li"));


	for (WebElement webElement1 : dropdown) {
		
		String innerhtml = webElement1.getAttribute("innerHTML");
		
	if (innerhtml.contentEquals("BU3")) {
		
		webElement1.click();
		break;
		
	}
		
		
		
	}
	

 //bu2
	
	
	
	
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id='projectDetails-content']/fieldset[1]/div[3]/div/span/span/span[2]")).click();
	
	List<WebElement> dropdown2 = driver.findElements(By.xpath("//ul[(@id='operativeUnit_listbox')]//li"));


	for (WebElement webElement2 : dropdown2) {
		
		String innerhtml = webElement2.getAttribute("innerHTML");
		
	if (innerhtml.equalsIgnoreCase("Bahrain")) {
		
		webElement2.click();
		
		System.out.println(webElement2.getText());
		
		break;
		
	}
		
		
		
	}
	
 

	



driver.findElement(By.xpath("//input[@id='expectedOrderIntake']")).sendKeys("23 September 2019");
		
   driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys("phoenixAutomation4");
	
	
   driver.findElement(By.xpath("//input[@id='projectCode']")).sendKeys("phoenix004");			

   driver.findElement(By.xpath("//input[@id='sageCode']")).sendKeys("sageCode004");
		
		
   //Customer
   

driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[2]/div[8]/div/span/span/span[1]")).click();

List<WebElement> dropdown11 = driver.findElements(By.xpath("//ul[(@id='customer_listbox')]//li"));


for (WebElement webElement1 : dropdown11) {
	
	String innerhtml = webElement1.getAttribute("innerHTML");
	
if (innerhtml.contentEquals("TNB")) {
	
	webElement1.click();
	break;
	
}

	
}
   
   Thread.sleep(2000);
   //EndCustoemr


driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[2]/div[9]/div/span/span/span[1]")).click();

List<WebElement> dropdown15 = driver.findElements(By.xpath("//ul[(@id='endCustomer_listbox')]//li"));


for (WebElement webElement1 : dropdown15) {
	
	String innerhtml = webElement1.getAttribute("innerHTML");
	
if (innerhtml.contentEquals("TNB")) {
	
	webElement1.click();
	break;
	
}

	
	
}
Thread.sleep(2000);
   //INCO Terms


driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[2]/div[11]/div/span/span/span[1]")).click();

List<WebElement> dropdown16 = driver.findElements(By.xpath("//ul[(@id='incoTerms_listbox')]//li"));


for (WebElement webElement1 : dropdown16) {
	
	String innerhtml = webElement1.getAttribute("innerHTML");
	
if (innerhtml.contentEquals("Financial Conduct Authority")) {
	
	webElement1.click();
	break;
	
}

		
}


Thread.sleep(2000);
   
   driver.findElement(By.id("expectedStartDate")).sendKeys("30 September 2019");
   
   driver.findElement(By.id("dateOfCompletion")).sendKeys("30 September 2020");
   
   driver.findElement(By.id("endOfWarranty")).sendKeys("30 September 2021");
   
   
   driver.findElement(By.name("contractValue")).sendKeys("100000");
   
   driver.findElement(By.id("engineeringHour")).sendKeys("80");
   
   Thread.sleep(2000);
   
   
   // C currency
   
 
   
	
driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[3]/div[3]/div/span/span/span[1]")).click();
Thread.sleep(2000);

List<WebElement> dropdown7 = driver.findElements(By.xpath("//ul[(@id='contractualCurrency_listbox')]//li"));


for (WebElement webElement1 : dropdown7) {
	
	String innerhtml = webElement1.getAttribute("innerHTML");
	
if (innerhtml.contentEquals("MYR")) {
	
	webElement1.click();
	break;
	
}
	
	
	
}

Thread.sleep(2000);
   
   //Local C
   

   


driver.findElement(By.xpath("//*[@id=\"projectDetails-content\"]/fieldset[3]/div[4]/div/span/span/span[1]")).click();
Thread.sleep(2000);

List<WebElement> dropdown8 = driver.findElements(By.xpath("//ul[(@id='localCurrency_listbox')]//li"));


for (WebElement webElement1 : dropdown8) {
	
	String innerhtml = webElement1.getAttribute("innerHTML");
	
if (innerhtml.contentEquals("MYR")) {
	
	webElement1.click();
	break;
	
}
	
	
	
}

Thread.sleep(2000);

   
   
   driver.findElement(By.id("saveProjectButton")).click();
   Thread.sleep(3000);
   
   String c_url= driver.getCurrentUrl();
   
   if (c_url.contains("projects")) {
	   
	   System.out.println("Project has been saved Succesfully under Project List");
	
}
   else {
	   
	   System.out.println("Project Saving is UnSuccesful  under Project List");
   }
   
   
   
   driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
   Thread.sleep(2000);
   
   String url2= driver.getCurrentUrl();
   
   Thread.sleep(2000);
   if (url2.contains("logout")) {
	   
	   System.out.println("Logout successfully");
	
}
   
   driver.quit();
   
   System.out.println("Chrome Browser closed succefully");
  
	}

}
