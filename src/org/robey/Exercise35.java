package org.robey;
import java.util.Scanner;

public class Exercise35 {
	/*
	 * Learning Java: Exercise 35
	 * Using the Break Statement with For Loops continued ...
	 * 
	 	
    */
	
	
	public static void main(String[] args) 
		throws java.io.IOException {
		
		char input;  //variable to hold the input
		
		int i;  //variable used in For Loop
		
		char upperCase = 'A'; //variable to compare input to upper case letters of the alphabet
		char lowerCase = 'a'; //variable to compare input to lower case letters of the alphabet
		
		System.out.print("Input your favorite CAPITAL letter of the alphabet: ");
		
		input = (char) System.in.read();  //read in the user's favorite capital letter
		
		for(i = 1; 1 <= 26; i++) {  //loop from 1 to 26 (26 letters in the alphabet)
			
			if((input == upperCase) || (input == lowerCase)) 
				break;
			
			upperCase++;
			lowerCase++;
			
			}
			
			System.out.println("Your favorite letter is " + input + " which is letter number " + i);
			
	}
	
}


