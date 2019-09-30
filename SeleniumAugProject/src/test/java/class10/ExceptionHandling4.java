package class10;

import java.util.InputMismatchException;

public class ExceptionHandling4 {

	public static void main(String[] args) {

	
		try
		{
			int c=90/0;
			
			//int c=90/string;
		
			System.out.println(c);
			}
		//It will run only whenever any exception
		
		catch (ArithmeticException e)
		{
		
			 	System.out.println("Please dont enter 0");
			 	System.out.println(e.getMessage());
			
			 	e.printStackTrace();
			
		}
		
		catch (InputMismatchException e)
		{
			
			System.out.println("please dont enter string");
			System.out.println(e.getMessage());
		}
		
		catch(Exception e)
		{
			
			
			System.out.println(e.getMessage());
		}
		
		
		catch(Throwable e)
		{
			
			
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		}
		
		
	


