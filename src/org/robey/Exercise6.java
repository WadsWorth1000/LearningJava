package org.robey;

public class Exercise6 {

	public static void main(String[] args) {
		/*
		 * Learning Java Volume 1: Exercise 6
		 * 		 * 
		 * Lisa has 34 dollars, John has 205 dollars, and Jenny has negative 20 dollars.
		 * Write a program that assigns these dollar amounts to variables, then output the following to the screen.
		  
		 * Lisa has 34 dollars, and John has 205 dollars.
		 * Jenny has negative money, and she has -20 dollars!
		 
	    */

		int lisa, john, jenny;  //declaring our variables on one line instead of separate lines for each variable using commas.
		
		lisa = 34;  //assigning values to our variables.
		john = 205;
		jenny = -20;
		
		System.out.println("Lisa has " + lisa + " dollars, and John has " + john + " dollars.");
		System.out.println("Jenny has negative money, and she has " + jenny + " dollars!");
		
	}

}
