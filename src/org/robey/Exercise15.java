package org.robey;

public class Exercise15 {

	/*
	 * Java: Exercise 15
	 * Code blocks
	 * Structure: (sample)
	     if(conditional relation) {
	 	   code 
	 	   statement;
	 	 }
	*/	
	
	public static void main(String[] args) {
	
	//Samples:

		int a = 4;
		
		System.out.println("-------------------------------------");
		
		System.out.println();
		
		System.out.println("a = " + a);
		
		System.out.println();
		
		System.out.println("-------------------------------------");
		
		System.out.println();
		
		if(a == 4) {
			a=a+5;
			System.out.println("a was equal to 4, now a is equal to " + a); //statement executed since a is equal to 4
		}		
		
		System.out.println();
		
		System.out.println("-------------------------------------");
		
		System.out.println();
		
		if(a == 9) {
			a = a++;
			System.out.println("now a is equal to 10");
		}
		
		System.out.println();
		
		System.out.println("-------------------------------------");
		
	}

}
