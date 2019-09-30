package class11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCRMApplicationdependsOn
{
	
	
  @Test 
  public void loginApp() {
	  
	  System.out.println("Loin DONE");
	  
	  Assert.assertEquals("subba", "subba ");
	  
	  
	    }
  
  @Test (dependsOnMethods="loginApp")
  
  public void userCreate() {
	  
	  System.out.println("User created");
  }
  

  
  @Test (dependsOnMethods= {"userCreate","loginApp"})
  public void logOut() {
	  
	  System.out.println("User loout from the session");
  }
  
  
}
 