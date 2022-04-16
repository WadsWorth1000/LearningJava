package org.robey;

public class Exercise25 {

//Sample 1:  Requesting multiple/sequential single character inputs continued ...
//           and displaying the contents of the buffer (invisible characters: line feed / carriage return) to the screen
	
	public static void main(String[] args) 
	
	throws java.io.IOException {
	
		char input;
		int input2;  //integer variable to display the ASCII (numerical) values of the invisible inputs (CR - Carriage Return) (LF - Line Feed)
					 //these invisible characters are automatically applied after any input + ENTER  
		
		System.out.println("Enter a single character from keyboard, then press ENTER: ");
		
		input = (char) System.in.read();  // must cast (char) because System.in.read inherently assumes integer
		
		System.out.println("You entered: " + input);

		input2 = System.in.read();  //clearing the buffer (invisible inputs) for the second input request.
		System.out.println("Invisible character 1: " + input2 + " - Line Feed (LF)"); //showing the ASCII value of the invisible (CR) carriage return (013)
		input2 = System.in.read();  //clearing the buffer for the second input request.
		System.out.println("Invisible character 2: " +input2 + " - Carriage Return (CR)"); //showing the ASCII value of the invisible (LF) line feed (010) 
		
		System.out.println();
		
		System.out.println("Enter a second single character from keyboard, then press ENTER: ");
		
		input = (char) System.in.read();  // must cast (char) because System.in.read inherently assumes integer

		System.out.println("You entered: " + input);
		
		input2 = System.in.read();  //clearing the buffer (invisible inputs) for the second input request.
		System.out.println("Invisible character 1: " + input2 + " - Line Feed (LF)"); //showing the ASCII value of the invisible (CR) carriage return (013)
		input2 = System.in.read();  //clearing the buffer for the second input request.
		System.out.println("Invisible character 2: " + input2 + " - Carriage Return"); //showing the ASCII value of the invisible (LF) line feed (010) 
		
		
	}

}
