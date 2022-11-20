package week02;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		
		int numberOne, numberTwo, numberThree;
		
		System.out.println("Please enter three numbers: ");
		//created reference object of Scanner class; scanner is the object
		Scanner scanner = new Scanner(System.in);
		//reading user's input and assigning them to variables
		numberOne = scanner.nextInt();
		numberTwo = scanner.nextInt();
		numberThree = scanner.nextInt();
		
		if(numberOne > numberTwo && numberOne > numberThree) {
			System.out.println(numberOne + " is greater than " + numberTwo + " and " + numberThree);
		//no need to check conditions of number a second time
		} else if (numberTwo > numberThree) {
			System.out.println(numberTwo + " is greater than " + numberOne + " and " + numberThree);		
		} else if (numberThree > numberOne && numberThree > numberTwo) {
			System.out.println(numberThree + " is greater than " + numberOne + " and " + numberThree);
		}

	}

}
