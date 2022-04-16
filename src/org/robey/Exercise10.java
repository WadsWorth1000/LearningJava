package org.robey;

public class Exercise10 {

	/*
	 * Learning Java Volume 1: Exercise 10
	 * Floating Point Variables (numbers with decimal points)
	 * Using the Math class(Math.) and methods within the class
	 * Keywords:  Double, Float, Math.(sqrt)
	 * Double:    Double / 64 bits / Most commonly used floating point data type. 
	 			  Returns higher precision than float by storing and returning more decimal points.
	 * Float:     Float / 32 bits / Used when less decimal places are needed in order to save memory.
	 			  Less precision (returns fewer decimal points) / faster runtime.
	 
	 */
	
	public static void main(String[] args) {
		
		//Sample 1a
		
		float float1 = 2.776665245152F; //input F after assigning float variable types(otherwise it will assume double).
		//float float1 = (float) 2.776665245152; or caste the float (float) prior to the value(otherwise it will assume double).
		
		System.out.println(float1);	//returns a trunkated value (2.7766652) of float1 because float variable data types can't hold enough decimal points.
		
		double float2 = 2.776665245152;
		System.out.println(float2); //returns the complete value of float2 because double variable data types can hold more decimal points. 
		
		System.out.println();
		
		//Sample 1b(using the math class)
		
		double variable1 = 74.33;
		double answer;
		
		answer = Math.sqrt(variable1); //Math is a class / .sqrt(square root) is a method inside of the Math class. 
									   //There are many different methods in the Math class.
		
		System.out.println("The square root of " + variable1 + " is " + answer); //returns the square root of the value of variable1
		
		System.out.println();
		
		
		//Sample 2
		
		double inches, centimeters;
		
		inches = 12.7;  //inches variable declared as a double data type with decimal points assigned.
						//Decimal points will be stored and returned.
	
		centimeters = inches * 2.54;  //centimeters variable assigned as a double data type with decimal points assigned.
									  //Decimal points will be stored and returned.
		

		System.out.println(inches + " inches is equal to " 
				+ centimeters + " centimeters");
		
		//Sample 3
		
		double number1, number2;
		
		System.out.println();
		
		number1 = 7.848 + 9.216;
		number2 = 15.6615 + 11.3371;
		
		System.out.println(number1);
		System.out.println(number2);
		
		//Sample 4
		
		int number3;
		double number4;
		
		number3 = 12/5; //number3 variable is declared as an integer which cannot hold decimal points.
						//the output will only show the numbers to the left of the decimal point.
		
		number4 = 12.0/5.0; /*
							number4 variable is declared as a double type variable which can hold decimal points.
							The output will show the numbers to the right of the decimal point.
							In the case of division of whole numbers returning decimal points, you need to assign the
							value of whole numbers with a decimal place (.0) to let Java know it's working
							with a double data type variable.
							*/
			
		System.out.println();
		System.out.println(number3); //number3 is an integer. No decimal points stored or returned (decimal points truncated). 
		System.out.println(number4); /*
									  number4 is a double data type involving division of whole numbers
									  with decimal points assigned. Decimal points will be stored and returned.
									  */
		
	}

}
