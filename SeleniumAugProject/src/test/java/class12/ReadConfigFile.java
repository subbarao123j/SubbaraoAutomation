package class12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfigFile {
	
	@Test
	
	public void readConfig() {
	
	//File src = new File(System.getProperty("user.dir") +"/Config/env.properties");
		
	//File src = new File("./Config/env.properties");
	try {
		
		
		Properties pro = new Properties();
		
		pro.load(new FileInputStream(new File("./Config/env.properties")));
		
		//pro.get("trainer");
		
		System.out.println(pro.get("tool"));
		
	} catch (FileNotFoundException e) {
		
		System.out.println("File could not locate"+e.getMessage());
		
	}
catch (IOException e) {
		
		System.out.println("File could not locate"+e.getMessage());
		
	}	
			
			
	}

}
