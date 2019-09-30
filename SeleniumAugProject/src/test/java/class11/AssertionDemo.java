package class11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
  @Test (description="This test will lointo application")
  public void loginApp()
  {
	  String toolName ="Selenium";
	  
Assert.assertEquals("Selenium", toolName,"ToolName is not matching");
	  
  }
  
  @Test (description="This test will marks test")
  public void marksTest()
  {
	  int marks = 90;
	  
Assert.assertEquals(90, marks,"ToolName is not matching");
	  
  }
  @Test (description="This test will toolName comparison")
  public void toolName1()
  {
	 String toolName1="Selenium123";
	  
Assert.assertTrue(toolName1.contains("Selenium"), "TestNdoesnotExist");
	  
  }
  
}
