package org.robey;
import java.util.Scanner;

public class Exercise45 {
/*
 * Learning Java:  Exercise 45
 * Rounding Numbers using the Math class (Math.<class>) 
 * Keywords: round, floor, ceil
 * Sample Structure:  
   		double <variable a> = <value>; // double variable type used for rounding decimals
   		System.out.println(Math.round(<variable a>));
 * 
 */
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double input = 0;
				
		double num1 = 2.27;

		System.out.println(Math.round(num1));
		System.out.println(Math.floor(num1));	
		System.out.println(Math.ceil(num1));
		
		System.out.print("Enter a number: ");
		if(keyboard.hasNextDouble() == true) input = keyboard.nextDouble();
		
		System.out.println("Rounded: " + Math.round(input));
		System.out.println("Floored: " + Math.floor(input));	
		System.out.println("Roofed: " + Math.ceil(input));
		
		Scanner sc = new Scanner(System.in);
		
		String scan = sc.next();
		
		System.out.print(scan);
		
		
		
		
	}

}
