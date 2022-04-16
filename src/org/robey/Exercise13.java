package org.robey;

public class Exercise13 {
	
	/*	  
	 * Learning Java: Exercise 13
	 * Single line FOR loops using incrementation and decrementation
	  
	 * keywords:   for
	 * structure:  for(initialization; condition; iteration) statement;
	 * initialization is the assignment of the variable of loop
	 * condition is the relational operator that determines the duration of the loop
	 * iteration is the incrementation(increasing) or decrementation(decreasing) of the value of the variable of loop
	 * everything within the parentheses dictates when to start and end the loop
	 * statement continually executed loop condition remains true
	 * Note:  var = var +1; can also be written as:  var++;
	          var = var - 1; can also be written as:  var--;
	*/

	public static void main(String[] args) {

		int counter;

		// FOR loop samples with incrementation
		for(counter = 0; counter <= 10; counter = counter +1) {    // variable (counter) assigned an initial value of 0 to begin loop 
														           // condition set as: less than or equal to 10
			                                                       // variable incremented by 1 throughout loop 
			System.out.println("The counter is at: " + counter);   // statement will continue to execute while condition holds true
		                                                           // once condition no longer holds true, loop ends / statement terminates
		}
		
		System.out.println();
		
		for(counter = 5; counter <= 20; counter = counter +5) {
			System.out.println("The counter is at: " + counter);
		}
	
		System.out.println();
		
		// Note:  in the following example, the initialization of the variable in the loop overrides / reassigns the value of the
		// variable (17 reassigned to 0)
		
		counter = 17;
		
		for(counter = 0; counter <= 20; counter++) {
			System.out.println("The counter is at: " + counter);
		}

	}

}
