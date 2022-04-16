package org.robey;
import java.util.Scanner;

public class Exercise31 {
	
	/*
	  
	 * Learning Java: Exercise 31
	 * if - else statements continued ...
	 * Keywords:
	     - if 
	     - else  
		          
	 */

	public static void main(String[] args) {
	
		double score = 0;
		
		Scanner kbInput = new Scanner(System.in);
		
		System.out.print("Please enter your score and then hit ENTER: ");
		
		if(kbInput.hasNextDouble() == true)
			score = kbInput.nextDouble();
		
		else System.out.println("Invalid Entry");
		
		if(score >= 90) {
			System.out.println("EXCELLENT!");
		}
		
		else if((score >= 80) && (score <= 90))  {
			System.out.println("Good Job!");
		}
		
		else if((score >= 70) && (score <= 80)) {
			System.out.println("Decent Job");
		}
		
		else if((score >= 60)  && (score <= 70)) {
			System.out.println("Poor Job");
			
		}
		
		else System.out.println("THE END TIMES ARE NIGH ...");
			
	}

}
