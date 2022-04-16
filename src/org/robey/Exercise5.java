package org.robey;

public class Exercise5 {

	/*
	 * Learning Java Volume 1: Exercise 5
	 * Declaring, assigning and returning integer variables
	 * Keywords:  int
	 * Structure:  int <variable name>;  //declaration
	               <variable name> = whole number value;  //assignment
	*/
		
	public static void main(String[] args) {
		System.out.println("Declaring and using integer variables in Java");
		System.out.println("");
		System.out.println("Variable -  named memory location that can change values.");
		System.out.println("   Integer -  whole number variable type between the values of: -2,147,483,648  and  2,147,483,648");
		System.out.println("");
		System.out.println("Variables must be declared before you can use them.");
		System.out.println("");
		System.out.println("To declare an integer variable, type the following: int (variable name)");
		System.out.println("For example: int variable1;");
		int variable1;  //Declaring an integer variable and naming it variable1.
		System.out.println("");
		System.out.println("After declaring a variable, you can then assign a value to that variable.");
		System.out.println("For example: variable1 = 9;");
		System.out.println("");
		variable1 = 9;  //Assigning a value to the variable;
		System.out.println("");
		System.out.println("To output the value of the variable, simply enter a system out print line with the variable placed inside the parentheses.");
		System.out.println("For example: System.out.println(variable1);");
		System.out.println("");
		System.out.println(variable1);  //Displaying the value of the variable.
		System.out.println("");
		System.out.println("You can also add text in the same print line.");
		System.out.println("For example: System.out.println(The value of variable1 is: + variable1)");
		System.out.println(" - Note: The text in the print line example above must be placed within quotes.");
		System.out.println("");
		System.out.println("The value of variable1 is: " + variable1);  //Displaying/outputting the value of the variable with text.
		
	}

}
