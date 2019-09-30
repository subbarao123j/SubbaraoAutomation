package class11;

import org.testng.annotations.Test;

public class MyCRMApplication
{
	
	
  @Test
  public void loginApp() {
	  
	  System.out.println("Loin DONE");
  }
  
  @Test
  public void createUser() {
	  
	  System.out.println("User created");
  }
  
  @Test
  public void deleteUser() {
	  
	  System.out.println("User deleted");
  }
  
  @Test
  public void logOut() {
	  
	  System.out.println("User loout from the session");
  }
  
  
}
 