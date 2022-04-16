package org.robey;

public class Exercise21 {
	/* 
	 *  Java: Exercise 21
	 * Incrementation and decrementation continued ...
	 * var++ / var--  (incrementation/decrementation calculated after assignment when its placed after / to the right of the variable)
	 * ++var / --var  (incrementation/decrementation calculated before assignment when its placed before / to the left of the variable)
	 */

	public static void main(String[] args) {

		int var1, var2;
		
		var1 = 10;
		var2 = 20;
		
		var1 = var1++; //incrementation calculated after assignment when its placed after / to the right of the variable
		var2 = var2--; //decrementation calculated after assignment when its placed after / to the right of the variable
		
		System.out.println("The value of var1 is: " + var1);
		System.out.println("The value of var2 is: " + var2);
		
		System.out.println();
		
		int var3, var4;
		var3 = 10;
		var4 = 20;
		
		var3 = ++var3; //incrementation calculated before assignment when its placed before/ to the left of the variable
		var4 = --var4; //decrementation calculated before assignment when its placed before/to the left of the variable
		
		System.out.println("The value of var3 is: " + var3);
		System.out.println("The value of var4 is: " + var4);
		
	}

}
