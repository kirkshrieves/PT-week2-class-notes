package week02;

public class LogicalOperators {

	public static void main(String[] args) {
		
		boolean fbLogin = true;
		boolean googLogin = false;
		boolean email = true;
		
		//it takes one 'false' in an '&&' for the entire statement to be 'false'
		System.out.println(fbLogin && googLogin && email);
		
		
		//it takes one 'true' in an '||' for the entire statement to be 'true'
		System.out.println(fbLogin || googLogin || email);
		
		//reverse value
		System.out.println(!email);
	}

}
