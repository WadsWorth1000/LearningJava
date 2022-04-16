package org.robey;

import java.util.Scanner;

public class Exercise28 {
	
	/*
	  
	 * Learning Java: Exercise 28
	 * Reading inputs with Scanner continued ...
		          
	 */

	public static void main(String[] args) {
		
		Scanner kbInput = new Scanner(System.in);  //creating our object to read input
		
		int age = 0;
		
		System.out.println("Enter your age: ");
		
		if(kbInput.hasNextInt() == true) {
			age = kbInput.nextInt();
			System.out.println("You are " + age + " years old.");
			System.out.println("...");
			System.out.println("...");
			System.out.println(age + " fucking years old man.");
			age = age +14;
			System.out.println("...");
			System.out.println("...");
			System.out.println("...");
			System.out.println("In 14 years you will be: " + age);
		}
		
		if(kbInput.hasNextInt() != true) {
		System.out.println("Invalid entry");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}