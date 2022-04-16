package org.robey;
import java.util.Scanner;

public class Exercise42 {
	
	/*
	 * Learning Java: Exercise 42
	 * Do While Loop continued ...
	 * Key words: do, while
	 * Similar to While loop but the condition comes / is tested after the loop instead of before the loop.
	   Therefore the loop will execute at least once, regardless of the condition that follows.
	   Note: semi colon required after condition
	 * Structure: do {
	 				  code; Ex: System.out.println("...");
	 				  <variable> increment/decrement; Ex: i++;
	 			     } while(<variable> condition); //Needs semi colon after condition

    */

	public static void main(String[] args) {

	/* 
	 * Sample 1:
   		Write a program that asks the user to guess a number between 1 and 20, with the correct answer being 17.
   		If the correct answer is not guessed (input), the program returns the message: "WRONG!" and tells the user that their guess 
   		was either too high or too low, depending on the guess's relation to the correct answer.
   		If the user guesses(inputs) the correct answer (17), the program returns the message: "CORRECT!"
   		
   		Wrap the relevant code inside of a Do-While Loop so that the user can continue guessing (inputing) numbers, without re-running
   		the program each time, until they input the correct number (17).
   		
   		Use the scanner class to read the numeric keyboard entries.
   			import java.util.scanner;
   			Scanner userGuess = new Scanner(System.in); 
   		
	 */
		
	Scanner keyboard = new Scanner(System.in);
	
	double numberGuess = 0;
	
	do { 
		
		System.out.println();
		
		System.out.print("I'm thinking of a number between 1 and 20. Try and guess it:  ");
		
		if(keyboard.hasNextDouble() == true) numberGuess = keyboard.nextDouble();
		
		System.out.println();
		
		if((numberGuess < 0) || (numberGuess > 20)) System.out.println("Invalid Entry. Try Again.");
		
		System.out.println();
		
		if(numberGuess < 17) System.out.println("Wrong ... Too LOW!");
		
		System.out.println();
		
		if(numberGuess > 17) System.out.println("Wrong ... Too HIGH!");
		
		} while(numberGuess != 17);
	
				
	System.out.println("You guessed 17. YOU ARE CORRECT!");
	
	} 

}
