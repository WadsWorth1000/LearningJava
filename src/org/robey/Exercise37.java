package org.robey;

public class Exercise37 {
	
	/*
	 
	 * Learning Java: Exercise 35
	 * The Remainder Operator and Continue Statement
	   	- % (remainder statement): Arithmetic function that divides and returns only the remainder of that division
	   	 					       (rounded to the nearest tenth, decimal point not included)
	   	
	   	Sample Structure:  
	   		System.out.println(10 % 9);  // Divides 9 into 10 (1.1) and returns the remainder (1) excluding the decimal point
	   		 				   10 / 9 = 1.1 (.1 being the remainder)
	 
    */
	
	public static void main(String[] args) {
		
//Sample Exercise 1:
		
		System.out.println(18 % 5);  // 18 / 5.5 = 3.272727 (the returned remainder is rounded to 3.3) 
									 // (Therefore 3 (no decimal point) will be returned and displayed from the println statement)
		
		
//Sample Exercise 2:
		
		int i;
		int b = 0;
		
		System.out.println("Multiples of 5: ");
		
		for(i = 1; i <= 30; i++) {
			
			if(i % 5 == b) {
				System.out.println("The following number is an even multiple of 5: " + i);
			}
			
	
			
			}
			
		}
		
		



}
