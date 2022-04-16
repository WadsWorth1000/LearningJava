package org.robey;

public class Exercise24 {
	
	/* Ask Scott about buffer in the second example. (Shouldnt need to clear the buffer since i cleared it in the first example)
	  
	 * Learning Java: Exercise 24
	 * Taking single character inputs from the keyboard using System.in.read()
	 * Learn how to read single characters from the keyboard using the char data type and the system.in.read() method. 
	 * Characters that are read from the keyboard can then be used to control program flow.
	 * Learn how to request and capture multiple and separate inputs by clearing the buffer  
	   (invisible characters: line feed / carriage return) with additional System.in.read() entries
	   
	   Keywords:  throws 'java.io.IOException' (error handling)
	   			  system.in.read()
	   			  char (single character variable to hold the input) can also use other variable data types (int, et	
	  
	 */

	
	public static void main(String[] args) // '{' delete code block from this line and place it after the java.io.IOException below
										  	
	
		throws java.io.IOException {  // now we can use the System.in.read() method freely throughout our program without error
			
/*Sample 1:  Using the System.in.read() method to capture multiple character inputs.
 			 Then using an 'if' / System.out.println() statement to return output based on the captured input.
 */
		
			char input, input2, input3;
			
			System.out.println("Enter a two digit number with a decimal point (example: 2.5), then press ENTER: ");
			
			System.out.println();
			
			input = (char) System.in.read();  // must cast (char) because System.in.read inherently assumes integer
			input2 = (char) System.in.read();
			input3 = (char) System.in.read();
			
			System.out.println();
			
			System.out.println("The character you entered was: " + input);
			System.out.println("The character you entered was: " + input2);
			System.out.println("The character you entered was: " + input3);
			
			System.out.println();
			
			if(input == '1') System.out.println("You entered the number 1!");
			if(input != '1') System.out.println("You did not enter the number 1!");
			
			System.out.println();
			System.out.println();
			
			
/* Sample 2:  
  
	Clear the buffer for a second input request.	
	Then create a True/False question requesting an input as follows:
  
	'The capital of the United States of America is Washington, DC? 
	 Answer True(T) or False(F): '
   			  
		If the user enters 'T', return the following output: 'Correct!'
		If the user enters 't', return the following output: 'Correct!'
		If the user enters anything other than 'T' or 't', return the following output: 'Incorrect!'
   			  
 */
			
			input = (char) System.in.read();  //clearing the buffer for the second input request. The first request only showed 
			input = (char) System.in.read();  //the single character input, but it also input an invisible line feed and carriage return.
						
			System.out.println("The capital of the United States of America is Washington, DC?");
			System.out.println("Answer True(T) or False(F): ");
			
			System.out.println();
			
			input = (char) System.in.read();  //clearing the buffer for the second input request.
			
			System.out.println();
			
			if((input == 'T') || (input == 't')) System.out.println("Correct!");
			if((input != 'T') && (input != 't')) System.out.println("Incorrect!");
					
			System.out.println();
			System.out.println();
			
	}

}
