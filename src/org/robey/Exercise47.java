package org.robey;

public class Exercise47 {
	
	/*
	 * Learning Java:  Exercise 47
	   Introduction to Methods (subroutines)
	   Methods  - Logical chunks of code that organize your code in a more readable and applicable format. 
	   			  Methods can be created and then called upon quickly without having to rewrite the same chunks of code over and over.
	   			  Also keeps the main method from becoming too large.
	   			  
	   Structure: Similar to a class or the main method:
	   				public static void firstMethod(String[] args) {  //no spaces, first word lower case, sequential words upper case. 
	   																//the name of the method should describe what the code in the method is about 
	   				 	code ... ;
	   				} 	
	   				 	
	  
	 */

	public static void main(String[] args) {
		
		System.out.println("Project Initialization");
		programStart();
		firstName();
		lastName();
		sumCharactersName();

	}
		
		public static void programStart() {
		
			System.out.println("Initiating Sequences ...");
			System.out.println("Stand By ...");
			
		}
		
			public static void firstName() {
				
				System.out.println("My first name is Ryan");
				
			}
			
				public static void lastName() {
					
					System.out.println("My last name is Robey");
					
				}

				
					public static void sumCharactersName() {
						
						int ryan = 4;
						int robey = 5;
						
						System.out.println("The sum of the characters of my first and last name is: " + (ryan + robey));
					}
				
	
}


	


