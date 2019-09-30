package class10;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		int c;
		try {
			c = 90/0;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//System.out.println(c);
		
	}

}
