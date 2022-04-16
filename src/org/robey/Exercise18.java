package org.robey;

public class Exercise18 {
	/* 
	 * 
	 * Using the Math class (continued) 
	 * Math.power(x,y)  - Raising the number x to the power y 
	 */

	public static void main(String[] args) {

		//Sample 1:  Write a program that raises the number 1.25 to the powers 1-20 (exponent incremented by 1)
		//           (1.25 ^ 1, 1.25 ^ 2, 1.25 ^ 3 ...)

		double exponent; //the Math. class and the methods within(.pow in this case) require and return double data types
		double answer;

		for(exponent = 1; exponent <= 20; exponent++)
		{
			answer = Math.pow(1.25, exponent);
			System.out.println("1.25 raised to the power of " + exponent + " is equal to " + answer);
		}
		
		



	}

}
