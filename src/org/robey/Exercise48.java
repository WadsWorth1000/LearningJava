package org.robey;
import java.util.Scanner;

public class Exercise48 {
	/*
	 * Learning Java:  Exercise 48
	   Introduction to Methods continued
	   
	   Exercise: 
	   		Ask the user to input a season number between 1 and 4 (1 = Spring, 2 = Summer, 3 = Fall, 4 = Winter)
	   		Depending on the number the user inputs, call upon a method that corresponds to the season number input and create a seasonal description to print to the screen.
	   			
	   		  
	 */
	

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int season = 1;
		
		System.out.print("Enter a season number and then hit ENTER (1 = Spring, 2 = Summer, 3 = Fall, 4 = Winter): ");
		
		season = input.nextInt();
		
		if(season == 1) {
			
			printSpring();
		
		}
		
		if(season == 2) {
			
			printSummer();
		
		}
		
		if(season == 3) {
			
			printFall();
			
		}
		
		if(season == 4) {
			
			printWinter();
			
		}
		
		
	}
		
		public static void printSpring() {
			
			System.out.println("The season is Spring, and the flowers are blooming!");
		}
		
		public static void printSummer() {
			
			System.out.println("The season is Summer, and it is hot!");
		}
		
		public static void printFall() {
			
			System.out.println("The season is Fall, and the leaves are falling!");
			
		}
		
		public static void printWinter() {
			
			System.out.println("The season is Winter, and it is snowing!");
			
		}
		
		
		
		
	
	

		
		
		



}
