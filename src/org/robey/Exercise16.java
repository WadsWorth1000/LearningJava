package org.robey;

public class Exercise16 {

	/*
	 * Java: Exercise 16
	 * Code blocks continued
	*/
	
	public static void main(String[] args) {


	//write a program that converts inches to feet incrementally one inch at a time (1 inch, 2 inches, 3 inches, ...)
	/* the output should like:
	 * 1 inch is equal to <answer> feet.
	 * 2 inches is equal to <answer> feet.
	 * 3 inches is equal to <answer> feet.
	*/
	//continue converting and printing up to 20 inches
	//insert a blank after every fourth printed entry
		
	int inches, counter = 0;
	
	double feet; //double data type needed due to possible decimal points returned after inch to feet conversion (inches/12.0)
		
			for(inches = 1; inches <= 20; inches++) {
		
			feet = inches/12.0; //decimal point placed to return floating point division
			
			if(inches == 1) System.out.println(inches + " inch is equal to " + feet + " feet.");
			if(inches != 1) System.out.println(inches + " inches is equal to " + feet + " feet.");
			
			counter++;
			
			if(counter == 4) {
				System.out.println(); //blank line printed every fourth line
				counter = 0; //resets the counter to 0
			}	
			
			
		}
		
		
	}

	
}
