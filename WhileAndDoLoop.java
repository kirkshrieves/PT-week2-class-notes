package week02;

public class WhileAndDoLoop {

	public static void main(String[] args) {
		
		//while loop
		int myVariable = 1;
		
		//pre test loop
		while(myVariable <= 10)
		{
			System.out.print(myVariable + " ");
			myVariable++;
		}
		System.out.println("I am out of loop");
		
		//make sure to reset variable to utilize for another loop
		myVariable = 1;
		//do while loop is a post test loop; it will execute the body at least once
		do
		{
			System.out.print(myVariable + " ");
			myVariable++;
		}while(myVariable <= 10);
		
		
	}
}
