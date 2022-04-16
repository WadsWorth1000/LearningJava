package org.robey;

public class Exercise12 {
	
	/*
	  
	 * Java: Exercise 12
	 * Single line IF statements with Relational operators for conditional expressions
	 
	 * Keywords: if
	 * Structure:  if(condition true) statement;  // statement executed since condition is true
	 * Structure:  if(condition not true) statement;  // statement not executed since condition is not true
	 * ==  equal to (two equal signs when dealing with relational equality opposed to assignment)
	 * !=  not equal to 
	 * <   less than
	 * <=  less than / equal to
	 * >   greater than
	 * >=  greater than / equal to
	 
	*/
	
	public static void main(String[] args) {
		
	int x;
	int y;
	
	double a, b, c;
		
	x = 3;
	y = 4;
	
	if(x == y) System.out.println("x is equal to y");  // not true because x is not equal to y (statement not executed)
	if(x != y) System.out.println("x is equal to y");  // true because x is not equal to y (statement executed)
	if(x < y) System.out.println("x is less than y");  // true because x is less than y (statement executed) 
	if(x <= y) System.out.println("x is less than or equal to y");  // true because x is less than or equal to y (statement executed)
	if(x > y) System.out.println("x is greater than y");  // not true because x is not greater than y (statement not executed)
	if(x >= y) System.out.println("x is greater than or equal to y");  // not true because x is not greater than or equal to y (statement not executed)
	System.out.println();
	
	a = 3.45;
	b = 4.25;
	c = 3.45;
	
	if(a == c) 
		System.out.println("a is equal to c");  // true because a is equal to c (statement executed)
	
	if(b >= a)
		System.out.println("b is greater than or equal to a");  // true because b is greater than or equal to a (statement executed)
	
	if(a != c)
		System.out.println("a is not equal to c");  // not true because a is not equal to c (statement not executed)

	}

}
