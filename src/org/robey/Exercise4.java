package org.robey;

public class Exercise4 {
	
	/*
	 * Learning Java: Exercise 4
	 * Printing blank lines and using carriage returns
	 * Structure:  System.out.println();  //blank line
	               \n  //carriage return
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("Using the System.out.println(); command with nothing inside of the quotes will return a blank line.");
		//System.out.println("");
		System.out.println("");
		
		System.out.println("You can also use backslash n within the quotes of a print line \nto create a new carriage return (line feed)"
				+ " when your text is long \nfor readability.\n" //New line: \n
				+ "Side Note: This is actually not usually advised to use because different operating systems might not interpret it properly.");
		//Side note: \n is not advised to use because it may not be properly interpreted by all operating systems.

	}

}
