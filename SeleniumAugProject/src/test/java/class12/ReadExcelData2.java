package class12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData2 {
	
	@Test
	
	public void readExcel() {
		
		File src = new File("./TestData/data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh1 =wb.getSheet("Login");
			
			XSSFRow r1 =sh1.getRow(0);
			
			XSSFCell c1 =r1.getCell(0);
			
			
			String data = c1.getStringCellValue();
			
			System.out.println(data);
		}  
		catch (IOException e) 
		{
			System.out.println("File could not read" +e.getMessage());
		}
		
		
		
		
		
	}
	

}
