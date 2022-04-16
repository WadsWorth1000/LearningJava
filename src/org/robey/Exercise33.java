package org.robey;
import java.util.Scanner;

public class Exercise33 {
	/*
	 * Learning Java: Exercise 33
	 * Switch statements using Scanner input method.
	 	import java.util.Scanner;
	 	Scanner input = new Scanner(System.in);
	 	if(input.hasNextInt() == true)
			score = input.nextInt();
    */

	public static void main(String[] args) {
		
		int score = 1;
		int score2 = 1;
		int sum = score + score2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a whole number between 1 and 10 and press Enter: ");
		
		if(input.hasNextInt() == true)
			score = input.nextInt();
		
		switch(score) {
			
			case 1:
				System.out.println("You entered: 1");
				break;
				
			case 2:
				System.out.println("You entered: 2");
				break;

			case 3:
				System.out.println("You entered: 3");
				break;
			
			case 4:
				System.out.println("You entered: 4");
				break;
				
			case 5:
				System.out.println("You entered: 5");
				break;

			case 6:
				System.out.println("You entered: 6");
				break;
				
			case 7:
				System.out.println("You entered: 7");
				break;
				
			case 8:
				System.out.println("You entered: 8");
				break;
				
			case 9:
				System.out.println("You entered: 9");
				break;
				
			case 10:
				System.out.println("You entered: 10");
				break;
				
			default:
				System.out.println("Invalid Entry");
		}	
				
		System.out.println();		
				
		System.out.print("Please enter a whole number between 1 and 10 and press Enter: ");
		
		if(input.hasNextInt() == true)
			score2 = input.nextInt();
		
		switch(score2) {
		
			case 1:
				System.out.println("You entered: 1");
				break;
			
			case 2:
				System.out.println("You entered: 2");
				break;

			case 3:
				System.out.println("You entered: 3");
				break;
		
			case 4:
				System.out.println("You entered: 4");
				break;
			
			case 5:
				System.out.println("You entered: 5");
				break;

			case 6:
				System.out.println("You entered: 6");
				break;
			
			case 7:
				System.out.println("You entered: 7");
				break;
			
			case 8:
				System.out.println("You entered: 8");
				break;
			
			case 9:
				System.out.println("You entered: 9");
				break;
			
			case 10:
				System.out.println("You entered: 10");
				break;
			
			default:
				System.out.println("Invalid Entry");
				
			}
				
			sum = score + score2;
			
			System.out.println();
			
			System.out.println("---");	
		
			System.out.println();		
				
			System.out.println("The sum of your entries equals " + sum);
			
			System.out.println("___");
			
			
				
		
		
	}

}
