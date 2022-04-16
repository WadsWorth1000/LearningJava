package org.robey;

import java.util.Scanner;

public class Exercise27 {
	
	/*
	  
	 * Learning Java: Exercise 27
	 * Reading inputs with Scanner
	  	 
	 * Keywords: 
	     - import (java.util.Scanner)  -(enabling the use of the Scanner class method.)
	     - Scanner <name> (like any other variable) = new Scanner(System.in);  //this is how you create objects in general
	     - <ScannerName>.nextInt()     -(Scanner class method that scans the next token of the input as an integer.
	                                     If the translation is successful, the scanner advances past the input that matched.)
	     - <ScannerName>.hasNextInt()  -(Scanner class method used to check if the next token in this scanner's
	                                     input can be interpreted as an integer value or not. Otherwise it returns false.) 
	     
	       Note: To avoid errors when receiving an input token of a non integer value (ex: 2.5):
	             First assign the integer variable a value of 0 prior to requesting the token input.
	             Then use an if statement utilizing the method <ScannerName>.hasNextInt() before assigning the integer variable to the input:
	             if(keyboardInput.hasNextInt() == true) <integerVariable> = <ScannerName>.nextInt();
	          
	 */

	public static void main(String[] args)
	
	
	{
		
		Scanner keyboardInput = new Scanner(System.in);  //creating our object to read input
		
		int integerNumber = 0;
		
		double doubleNumber = 0;
		
		System.out.println("Enter any integer: ");
		
		if(keyboardInput.hasNextInt() == true) integerNumber = keyboardInput.nextInt();
		
		System.out.println("You entered the number: " + integerNumber);
		
		System.out.println();
		
		System.out.println("Enter a decimal number (double): ");
		
		if(keyboardInput.hasNextDouble() == true)  doubleNumber = keyboardInput.nextDouble();
		
		System.out.println("You entered the decimal number (double): " + doubleNumber);
		
		
		
		
		
		
		
		
	

	}

}
