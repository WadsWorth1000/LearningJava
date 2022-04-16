package org.robey;

public class Exercise26 {
	
	/*
	  
	 * Learning Java: Exercise 26
	 * Reading single character inputs continued ...
	 
	 * Keywords:  throws 'java.io.IOException' (error handling)
	   			  system.in.read()
	   			  char (single character variable data type to hold input)
	   			  boolean (true / false (dual state) variable data type) 	
	  
	 */

	
	
	public static void main(String[] args) 
	
		throws java.io.IOException {

		char input;  //this will hold the Y/N answer/input
		
		Boolean sunny = null, warm = null; //flags to hold the state of sunny and warm
		
		System.out.println("Is it sunny outside? (Enter Y or N) - then press ENTER");
		input = (char) System.in.read();
		
		if((input == 'Y') || (input == 'y')) sunny = true;
		if((input == 'N') || (input == 'n')) sunny = false;
		
		
		input = (char) System.in.read();  //capturing the carriage return
		input = (char) System.in.read();  //capturing the line feed

		
		System.out.println("Is it warm outside? (Enter Y or N) - then press ENTER");
		
		input = (char) System.in.read();
		
		if((input == 'Y') || (input == 'y')) warm = true;
		if((input == 'N') || (input == 'n')) warm = false;
		
		if((sunny == true) && (warm == true)) System.out.println("It is sunny and warm outside.");
		if((sunny == true) && (warm == false)) System.out.println("It is sunny and cold outside.");
		if((sunny == false) && (warm == true)) System.out.println("It is cloudy and warm outside.");
		if((sunny == false) &&(warm == false)) System.out.println("It is cloudy and cold outside.");
 		
		input = (char) System.in.read();  //capturing the carriage return
		input = (char) System.in.read();  //capturing the line feed
		
		System.out.println();
		
		System.out.println("Nice day for a frolick, ay?");
		

	}

}
