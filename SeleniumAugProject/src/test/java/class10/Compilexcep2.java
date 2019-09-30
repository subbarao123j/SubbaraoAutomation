package class10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Compilexcep2 {

	public static void main(String[] args)   {

	
		
		File src = new File("D:\\2 R&D\\MYDATA\\2 To Business data20-06-2019\\2019 BUSINESS\\1 Learn  Automation\\3rdAugust\\1 From Mukesh\\class-9\\Class_9-20190910T011448Z-001\\Class_9\\Topics_Videos_Watch.docx");
		
		
		try {
			FileInputStream fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			
			System.out.println("seems file doesnot exist" +e.getMessage());
			
			
		}
		finally
		{
			
			System.out.println("Bye bye");
		}
		
		}
		
		
		
	}
	
	
	
	
	


