package week02;

import java.util.Scanner;

public class ConditionalIf {

	public static void main(String[] args) {
		
		boolean weatherNow;
		boolean isSnowing;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is it cold outside? Please enter true or false: ");
		weatherNow = scanner.nextBoolean();
		
		if(weatherNow) 
		{
			//System.out.println("If it is cold wear coat and gloves");
			System.out.println("Is it snowing? Please type true or false: ");
			isSnowing = scanner.nextBoolean();
			//inner if or nested if statement
			if(isSnowing)
			{
				System.out.println("Wear a coat & gloves");
			}
			else
			{
				System.out.println("Wear gloves");
			}	
		}
		else 
		{
			System.out.println("Wear shorts");
		}	
	}

}
