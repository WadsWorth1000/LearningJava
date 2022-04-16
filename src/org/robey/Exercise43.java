package org.robey;

public class Exercise43 {
	
	/*
	 * Learning Java Volume 1: Exercise 43
	 * Absolute Value (Math Class)  - the absolute value / modulus is the magnitude / non-negative value of a real number without regard to its sign.
	   								  The absolute value / modulus of a number can also be thought of as it's distance from zero. 
	   								  (+3 has a distance of 3 from zero. -3 also has a distance of 3 from zero). 
	   								  Therefore the absolute value of 3 is 3 and the absolute value of -3 is also 3.
	 * Keywords:  Math.abs
	 * Structure:
	 		<variable1> = <value>;
	 		<variable2> = Math.abs(variable1);
	 */

	public static void main(String[] args) {

//Sample 1:
		
		double number1 = 2.99;
		
		double absNumber1 = Math.abs(number1);
		
		System.out.println(absNumber1);
		
//Sample 2:
		
		double number2 = -2.76;
		
		double absNumber2 = Math.abs(number2);
		
		System.out.println("The absolute value of " + number2 + " is " + absNumber2);

	}

}

