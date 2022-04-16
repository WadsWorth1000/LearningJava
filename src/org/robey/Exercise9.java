package org.robey;

public class Exercise9 {
	
	/*
	 * Learning Java Volume 1: Exercise 9
	 * More variable declaration, assignments using calculations/formulas and print return
	   
	   A sail boat sail is triangular and has a height of 14 ft.
	   The length of the base of the flag is 6 ft.
	   
	   The formula for the area of a triangle is:
	   area = base*height/2;
	   
	   Write a program that calculates the area of this sail and display the result.
	   
	 */
	
	public static void main(String[] args) {
		
		int height, base, area;

		base = 6;
		height = 14;
		
		area = base*height/2;
		
		System.out.println("The area of the sail is " + area + " square feet.");

	}

}
