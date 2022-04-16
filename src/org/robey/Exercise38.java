package org.robey;

public class Exercise38 {
	
	/*
	 * Learning Java: Exercise 38
	 * Methods
	 * Adding parameters / arguments to a method and returning values
	 * Method -  A block of code / collection of statements/instructions grouped
	             together to perform a certain task or operation.
	             Typically, a method has a unique name within its class and provides re-usability
	             without having to rewrite code again and again. 
	             Also provides the easy modification and readability of code, just by adding or removing a chunk of code.
	             The method is executed only when we call or invoke it.
	             The Main Method is the most important method in a program.
	              
	*Structure:  public static int (returns and integer) methodName(int a) (parameter: receives an integer and declares it as 'a') { 
	             
	             Code;
	             
	             }
	             	  			 		
	  			 Method name structure: two words (no space) to describe the method
	  			 	                    first word: lowercase / second word: Uppercase
	  			 			
    */

	public static void main(String[] args) {

		int num1 = 11;
		int answer;

		answer = multNumbers(num1);

		System.out.println("The answer is: " + answer);

	}
	
		
		public static int multNumbers(int a) {
			
			int ans = a * 7;
			
			return ans;
		}
			

		
}
	



