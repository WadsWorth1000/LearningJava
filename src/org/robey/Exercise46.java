package org.robey;

public class Exercise46 {
	/*
	 * Learning Java:  Exercise 46
	 * Powers and Square Roots:  Math class (Math.<class>) 
	 * Keywords: pow, 
	 * Sample Structure:
	        Powers:     
	   		double <variable a> = <value>; // double variable type used for powers
	   		System.out.println(Math.pow(<variable a>, power>));
	   		
	   		Square Roots:
	   		double <variable a> = <value>; // double variable type used for square roots
	   		System.out.println(Math.sqrt(<variable a>, 
	 */

	public static void main(String[] args) {

	
//Sample 1:  Powers - printing values with print line 
		
		System.out.println(Math.pow(5, 2));
		
//Sample 2:  Powers - printing calculation results with print line using a variable
		
		double var1 = 8;
		
		System.out.println(Math.pow(var1, 2));
		
//Sample 3:  Powers - printing calculation results with print line using variables for both the number and the exponent
		
		double var2 = 3;
		
		double var3 = 3;
		
		System.out.println(Math.pow(var2, var3));
		
//Sample 4:  Square Roots - printing calculation results with print line 
		
		System.out.println(Math.sqrt(9));
		
//Sample 5:  Square Roots - printing calculation results with print line using a variable
		
		double var4 = 16;
		
		System.out.println(Math.sqrt(var4));
		
		
		
		
		
	}

}
