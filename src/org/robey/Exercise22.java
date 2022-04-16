package org.robey;

public class Exercise22 {
	/* 
	 *  Java: Exercise 22
	 * Logical Operators
	 * AND, OR, NOT, XOR
	 */

	//   &&   Logical AND   'A and B'  (both)  
	//   ||   Logical OR    'A or B or Both'  (either or both)
	//   !    Logical NOT   'Invert State'  (not)
	//   ^    Logical XOR   'A or B not Both'  (only one)
	
	public static void main(String[] args) {
	
		System.out.println("-----------------");
		System.out.println("LOGICAL OPERATORS");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("&&   Logical AND   'A and B'  (both)");
		System.out.println("||   Logical OR    'A or B or Both'  (either or both)");
		System.out.println("!    Logical NOT   'Invert State'  (not)");
		System.out.println("^    Logical XOR   'A or B not Both'  (only one)");
		System.out.println("_____________________________________________________");
		System.out.println();
		System.out.println();
		
		
//Sample 1  - Logical AND ( && )  - and		

		System.out.println("_________________");
		System.out.println();
		System.out.println("Logical AND  - &&");
		System.out.println("_________________");
		
		System.out.println();

		int a;
		boolean b;
		
		a = 10;
		b = true;
		
		System.out.println();
				
		if((a == 10) && (b == true)) {
					System.out.println("Success!");  //statement executed because if statement is true. 
													 // Variable a does equal 10 AND ( && ) variable b is true
		}
				
		System.out.println();
				
		if((a == 5) && (b == true)) {
			System.out.println("Success!");  //statement not executed because a != 5 (everything in parentheses must be true)
		}
				
		System.out.println();
				
		if((a >= 7) && (b == false)) {
			System.out.println("Success!");  //statement not executed because b == false (everything in parentheses must be true)
		}
				
		System.out.println();
		System.out.println();
		
		
//Sample 2  - Logical OR ( || )  - or
		
		System.out.println("________________");
		System.out.println();
		System.out.println("Logical OR  - ||");
		System.out.println("________________");
		
		System.out.println();

		if((a == 10) || ( b == false)) {
			System.out.println("Success"); //statement executed because a == 10 but b == false
		}
		
		System.out.println();
		System.out.println();
		
		
//Sample 3  - Logical NOT  ( ! )  - not
		
		System.out.println("________________");
		System.out.println();
		System.out.println("Logical NOT  - !");
		System.out.println("________________");
		
		System.out.println();
				
		a = 7;
						
		if(a != 7) {
				System.out.println("Success!"); //statement not executed because the if statement is false. Variable a does equal ( == ) 10
		}
		
		if(a != 10) {
				System.out.println("Success!");  //statement executed because the if statement is true. Variable a does not equal ( != ) 10
		}		
		
		System.out.println();
		System.out.println();
		
		
//Sample 4  - Logical XOR  ( ^ )  - 'or'		
		
		System.out.println("________________");
		System.out.println();
		System.out.println("Logical XOR  - ^");
		System.out.println("________________");
		
		System.out.println();
		
		if((a == 10) ^ (b == true)) {
			System.out.println("Success!");  //statement executed because one of the two conditions are true (a does equal 10)
		}
		
		System.out.println();
		System.out.println();
		
//Sample 5  - Random Exercise
		
		/*
		 * Create a variable named 'age' and assign a value of 30 to it.
		 
		 * If the value of 'age' lies between 25 and 35, output the following: 
		   'Your age is between 25 and 35.'
		  
		 * If the value of 'age' lies between 45 and 55, output the following:
		   'Your age is between 45 and 55.'
		  
		 * Change the value of variable 'age' to 50 and re-run the program.	  
		  		 
		 */
		
		System.out.println("- - - - - - - - - - - - - - - -");
		System.out.println();
		
		var age = 50;
		
		if((age >= 25) && (age <= 35)) {
			System.out.println("Your age is between 25 and 35.");
		}
			
		if((age >= 45) && (age <= 55)) {
			System.out.println("Your age is between 45 and 55.");
		}	

		
		
		
	}

}
