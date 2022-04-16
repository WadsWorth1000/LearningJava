package org.robey;

public class Exercise40 {
	/*
	 * Learning Java: Exercise 40
	 * While Loop
	 * Similar to for loop, but you assign the value / initialize the variable outside of the loop, and increment the variable within the body (within the code braces) of the loop
	 * Key words:  while
	 * Structure:
	   		while(<variable> condition) {
	   		  code; Ex: System.out.println("...");
	   		  variable increment/decrement; Ex: i++;
	   		  }

    */

	
	public static void main(String[] args) {
//Sample 1:  
		
		int i;
		
		i = 1;  //Assign the value of the variable before (outside) the loop below
		
			while(i<=10) {
			
			System.out.println("This is loop number: " + i);
			
			i++;
		}
				
		System.out.println();
		
//Sample 2:
		
		char letter = 'a';
		
		while(letter <= 'z') {
			
			System.out.println("The current letter is: " + letter);
			  
			letter++;
					
		}
		
/* Exercise 1:
 * Write a program that uses a While Loop to calculate the sum of all numbers from 1 to 100 and then output the result to the screen
 */
		
		int number = 1; //This is the current number
		
		int sum = 0; //This is the running total of the sum
		
		while(number <= 100) {
			
			sum = sum + number;
			
			number++;
			
		}
			
			System.out.println("The sum of all numbers from 1 to 100 is: " + sum);
			


		
	}

}
