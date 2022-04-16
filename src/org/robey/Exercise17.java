package org.robey;

public class Exercise17 {
	/* 
	 * Learning Java: 
	 * More integer data types
	 * Keywords: byte, short, int, long
	             byte:  8 bits / -128 to 127
	             short:  16 bits / -32768 to 32767
	             int:  32 bits / -2,147,483,648 to -2,147,483,647 
	             long:  64 bits / -9,223,372,036,854,775,808 to -9,223,372,036,854,775,807
	 */

	public static void main(String[] args) {
		
		byte byteVariable = -100;
		short shortVariable = -2000;
		int intVariable = 100000;
		long longVariable = 4223372036854L;  //must place L at the end of the value when assigning long variables		
		System.out.println(byteVariable);
		System.out.println(shortVariable);
		System.out.println(intVariable);
		System.out.println(longVariable);

		System.out.println();
		
		/*
		 * Write a program to calculate how far a beam of light will travel after 300 minutes and output the result
		   to the screen.
		 * Lightspeed is 186,282 miles per second
		 */
		
		long distance;
		int minutes;
		
	    minutes = 300;
	    distance = minutes * 186282L *60;
	    
	    System.out.println("A beam of light will travel " + distance + " miles in 300 minutes.");
		
	}

}
