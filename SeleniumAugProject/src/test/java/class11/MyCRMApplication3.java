package class11;

import org.testng.annotations.Test;

public class MyCRMApplication3
{
	
	
  @Test (priority=0)
  public void loginApp() {
	  
	  System.out.println("Loin DONE");
  }
  
  @Test (priority=1)
  public void createUser() {
	  
	  System.out.println("User created");
  }
  
  @Test (priority=2)
  public void deleteUser() {
	  
	  System.out.println("User deleted");
  }
  
  @Test (priority=3)
  public void logOut() {
	  
	  System.out.println("User loout from the session");
  }
  
  
}
 