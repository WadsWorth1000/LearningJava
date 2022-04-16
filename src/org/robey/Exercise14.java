package org.robey;

public class Exercise14 {
	
	/*
	 * Java: Exercise 14
	 * FOR loop sample using decrementation (decreasing)
	 * Structure:  for(initialization; condition; iteration) statement; //in this exercise, the iteration will be a decrementation
	*/

	public static void main(String[] args) {
				
		int counter;
		
				for(counter = 10; counter > 0; counter = counter - 1)
					System.out.println("The counter is at: " + counter);
				
				System.out.println();
				
				System.out.println("Blastoff!");

	}

}
