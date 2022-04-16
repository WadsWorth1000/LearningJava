package org.robey;
import java.util.Scanner;

public class Exercise29 {
	
	/*
	  
	 * Learning Java: Exercise 29
	 * Reading inputs with Scanner continued ...
		          
	 */
	

	public static void main(String[] args) {
		
/*
 * Write a program that reads the two sides (length and width) of a rectangle.
 * Then calculate the perimeter and area of the rectangle based on the inputs.
 */
		
		Scanner kbInput = new Scanner(System.in);
		
		double length = 0, width = 0, perim = 0, area = 0;
		
		System.out.println("Enter the length of the rectangle: ");
		
		if(kbInput.hasNextDouble() == true) {
			length = kbInput.nextDouble();
			System.out.println();
			System.out.println("The length of the rectangle is: " + length);
		}
		
		System.out.println();
		
		System.out.println("-----");
		
		System.out.println();
		
		System.out.println("Enter the width of the rectangle: ");
		
		if(kbInput.hasNextDouble() == true) {
			width = kbInput.nextDouble();
			System.out.println();
			System.out.println("The width of the rectangle is: " + width);
		}	
		
		System.out.println();
		
		System.out.println("_____");
		
		System.out.println();
		
		System.out.println("Calculating...");
		
		perim = (length + width) * 2;
		
		System.out.println("Calculating...");
				
		area = length * width;
		
		System.out.println();	
		
		System.out.println("_____");
		
		System.out.println();
		
		System.out.println("The perimeter of the rectangle is: " + perim);
		System.out.println("The area of the rectangle is: " + area);
		
	}

}
