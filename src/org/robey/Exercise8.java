package org.robey;

public class Exercise8 {
	
	/*
	 * Learning Java Volume 1: Exercise 8
	 * Variable declaration, assignments using calculations/formulas and print return
	 * A rectangular wall has dimensions 23 ft x 12 ft.
	 * Write a program to calculate the area of the wall and display the result as:
	   The area of the wall is <calculated answer> square feet.
	 */

	public static void main(String[] args) {
		
		int length, height, area;
		length = 23;
		height = 12;
		
		area = length * height;
		
		System.out.println("The area of the wall is " + area + " square feet.");

	}

}
