package org.robey;

public class Exercise32 {

	/*
	  
	 * Learning Java: Exercise 32
	 * Switch statements:  Comparing a variable against different values and checking for equality and then
	  					   executing something based on that value.
	 * Keywords: 
	 		- switch
	 		- case
	 		- break
	 
	 *Sample Structure:
	  
	 	char/int <variable name> = <value>;
	 	
	 	switch(<variable>) {
	 	
	 		case '<value 1>':
	 			System.out.println("");
	 			break;
	 			
	 		case '<value 2>':
	 			System.out.println("");
	 			break;
	 			
	 		case '<value 3>':
	 			System.out.println("");
	 			break;
	 			
	 		case '<value 4>':
	 			System.out.println("");
	 			break;
	 			
			default:
				System.out.println("");
		
		 }      
	 */

	public static void main(String[] args) {

//Exercise 1: Switch statement using a 'char' data type variable:
		
		char grade = 'C'; //single quotes for char data type values
		
		switch(grade) {
		
			case 'A':
				System.out.println("You made an A. Excellent job.");
				break;
			
			case 'B':
				System.out.println("You made a B. Good job.");
				break;
			
			case 'C':
				System.out.println("You made a C. Ok job.");
				break;
			
			case 'D':
				System.out.println("You made a D. Poor job.");
				break;
		
			default:
				System.out.println("You made an invalid entry.");
		
		}
		
//Exercise 1: Switch statement using an 'int' data type variable:
		
			int month = 13;  //no quotes for integer data type values
				
			switch(month) {
				
			case 1:
					System.out.println("You were born in January.");
					break;
					
			case 2:
				System.out.println("You were born in February.");
				break;
					
			case 3:
				System.out.println("You were born in March.");
				break;
					
			case 4:
				System.out.println("You were born in April.");
				break;
				
			case 5:
				System.out.println("You were born in May.");
				break;
				
			case 6:
				System.out.println("You were born in June.");
				break;
			
			case 7:
				System.out.println("You were born in July.");
				break;
				
			case 8:
				System.out.println("You were born in August.");
				break;
				
			case 9:
				System.out.println("You were born in September.");
				break;	
			
			case 10:
				System.out.println("You were born in October.");
				break;
				
			case 11:
				System.out.println("You were born in November.");
				break;
				
			case 12:
				System.out.println("You were born in December.");
				break;
				
			default:
				System.out.println("You were born in another solar system.");
				
			}		
		
		
		
		
	}

}
