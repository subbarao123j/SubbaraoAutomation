package class12;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AcceptParameters {
	
	
	
	
	@Parameters({"browser", "url", "session"})
	@Test
	public void startTest(String browserName,String appURL,String SessionName)
	
	{
		
		
		System.out.println("Runnin Test on" + browserName +""+ appURL +"" + SessionName);
		
		
	}

}
