package org.robey;

public class Exercise41 {

	/*
	 * Learning Java: Exercise 41
	 * Do While Loop continued ...
	 * Key words: do, while
	 * Similar to While loop but the condition comes / is tested after the loop instead of before the loop.
	   Therefore the loop will execute at least once, regardless of the condition that follows.
	   Note: semi colon required after condition
	 * Structure: do {
	 				  code; Ex: System.out.println("...");
	 				  <variable> increment/decrement; Ex: i++;
	 			     } while(<variable> condition); //Needs semi colon after condition

    */
	
	public static void main(String[] args) {
//Sample 1
		
		int i;
		
		i = 1;
		
		do {
			
			System.out.println("Do While Loop: " + i);
			
			i++;
		
		} while(i <= 10);
		
	}

}
