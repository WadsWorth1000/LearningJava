package org.robey;
import java.util.Scanner;

public class Exercise44 {
	
	public static void main(String[] args) 
		throws java.io.IOException {
	
		Scanner keyboard = new Scanner(System.in);
		
		String input;
		
		String input2;
		
		char input3;
		

		
		System.out.print("Enter your name: ");
		input = keyboard.nextLine();
		
		System.out.println();
										
		System.out.print("Enter your age: ");
		input2 = keyboard.nextLine();
		
		System.out.println();
		
		System.out.println("Your name is " + input + " and you are " + input2 + " years old.");
		
		System.out.println();
				
		System.out.print("Do you believe?\nPlease enter Y(for Yes) or N(for No): ");
		input3 = (char) System.in.read();
		
		System.out.println();
		
		if((input3 == 'Y') || (input3 == 'y')) System.out.println("Well done friend. Well done indeed.");
				
		if((input3 == 'N') || (input3 == 'n')) System.out.println("W ... T ... F ... !? \nOMG -- LOOOOL");
	

		
	}

}
