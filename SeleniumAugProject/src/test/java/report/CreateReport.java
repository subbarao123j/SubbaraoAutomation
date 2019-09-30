package report;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateReport {
	
	@Test
	public void createReport() throws IOException
	{
		
		// File location
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("DOMSAutomation1.html");
		
		//  Report object
		ExtentReports report=new ExtentReports();
		
		report.attachReporter(reporter);
		
		ExtentTest test1=report.createTest("Login & LogOut-DOMSApplication");
		
		test1.pass("Login & LogOut scenarios of DOMSSystem is Automated Successfully By Subbarao");
		
		report.flush();
		
		
	}

}
