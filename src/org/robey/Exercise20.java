package org.robey;

public class Exercise20 {
	/* 
	 * Learning : Exercise 20
	 * Scopes / Lifetimes of Variables
	 * Code blocks (curly braces {} ) define the scope of a variable
	 * Code outside of the code block can see the code inside the block,
	   but the code inside of the block cannot see the code outside of the block.
	 */
	
	public static void main(String[] args) {
		
//Sample 1
		
		int i = 12;
		
		if(i>5){ //variable i is visible and if condition can be determined because they both reside inside the same code block shell(scope)
		System.out.println("The value of i is: " +i); //therefore, the print statement can be executed
		}
		
		
//Sample 2
		
		int b = 12;
		
		if(b>5){ 
		int k = -5; //variable assigned and declared inside inner scope
		System.out.println("The value of i is: " + i);
		System.out.println("The value of k is: " + k); //statement executed because the variable k is visible 
		
		}
		
		//System.out.println("The value of k is: " + k); //error returned because the variable k is assigned and declared
													     //in the inner scope and is not visible to this outer scope
	
		System.out.println();
		
//Sample 3	

		int count = 0;
		
		for(count=0; count <=10; count++) {
			System.out.println("count is: " + count);
			int var1 = 10; //visible inside scope
			System.out.println("Beginning value of loop is: " + var1); //statement executed
			var1 = -25;
			System.out.println("Ending value of loop is: " + var1); //var1 value reassigned(overwritten) at end of loop
																	//then reassigned its original value at the beginning until loop terminates 
			
			System.out.println();
			System.out.println();
			
		}
				
		//System.out.println(count + var1); //error returned because although count is visible, var1 is not	
		
		System.out.println();
		
	}
	
	
	

}
