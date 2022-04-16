package org.robey;

public class Exercise34 {
	/*
	 * Learning Java: Exercise 34
	 * Using the Break Statement with For Loops
	 	
    */
	

	public static void main(String[] args) {
		
		int i;
		
		for(i = 1; i <= 10; i++) {
			
			System.out.println("This is loop number: " + i);
			if(i == 7) {
				break;
			}
			
		}
		
		System.out.println("All looping is now done.");
		
		

	}

}
