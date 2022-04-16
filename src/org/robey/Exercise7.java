package org.robey;

public class Exercise7 {

	/*
	 * Learning Java Volume 1: Exercise 7
	 * Basic arithmetic with integer variables
	 * Addition:  +
	 * Subtraction:  -
	 * Multiplication:  *
	 * Division:  /
	 */	
	
	
	public static void main(String[] args) {
		
	

		int num1, num2, num3, num4;
		int sum, difference, multiply, divide;
				
		num1=10;
		num2=3;
		num3=5;
		num4=2;
		sum=num1+5;
		difference=num3-num2;
		multiply=num3*num4;
		divide=num1/num4;
					
		System.out.println("num1 + 5 = " + sum);
		System.out.println("num3 minus num2 = " + difference);
		System.out.println("num3 times num4 = " + multiply);
		System.out.println("num1 divided by num4 = " + divide);
				
		System.out.println("original value of num1 = " + num1);
		num1=num1*6;
		System.out.println("new value of num1 = " + num1);
			
		
	}

}
