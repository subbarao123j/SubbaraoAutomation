package javascenarios;

public class RevereseString {

	public static void main(String[] args) {

		
		String s = "magadu";
	/*	StringBuilder s1= new StringBuilder();
		
		s1.append(s);
		s1=s1.reverse();
		
		
	System.out.println(s1.toString());*/
		
		StringBuilder s1= new StringBuilder(s);
						
		
		System.out.println(s1.reverse());
		
	}

}
