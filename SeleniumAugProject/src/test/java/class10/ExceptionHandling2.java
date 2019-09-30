package class10;

public class ExceptionHandling2 {

	public static void main(String[] args) {

	
		try
		{
			int c=90/0;
		
			System.out.println(c);
			}
		//It will run only whenever any exception
		
		catch (ArithmeticException e)
		{
		
			 	System.out.println("Please dont enter 0");
			 	System.out.println(e.getMessage());
			
			 	e.printStackTrace();
			
		}
		
		
		
	}

}
