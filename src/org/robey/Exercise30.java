package org.robey;
import java.util.Scanner;

public class Exercise30 {

	/*
	  
	 * Learning Java: Exercise 30
	 * if - else statements
	 * Keywords:
	     - if 
	     - else  
		          
	 */
	
	
	public static void main(String[] args) {
		
		Scanner kbInput = new Scanner(System.in);
		
		double score = 0.0;
		
		System.out.print("Enter your score:  ");
		
		if(kbInput.hasNextDouble() == true)
			score = kbInput.nextDouble();
				
		System.out.println();
		
		if(score >= 90) {
			System.out.println("Calculating ..");
			System.out.println("Calculating ..");
			System.out.println();
			System.out.println("Great Job!");
		}
		
		if((score >= 80) && (score <= 90))  {
			System.out.println("Calculating ..");
			System.out.println("Calculating ..");
			System.out.println();
			System.out.println("Good Job!");
		}
		
		if((score >= 70) && (score <= 80)) {
			System.out.println("Calculating ..");
			System.out.println("Calculating ..");
			System.out.println();
			System.out.println("Average Job!");
		}
		
		if((score >= 60) && (score <= 70)) {
			System.out.println("Calculating ..");
			System.out.println("Calculating ..");
			System.out.println();
			System.out.println("Poor Job!");
		}
		
		if((score >= 50) && (score <= 60)) {
			System.out.println("Calculating ..");
			System.out.println("Calculating ..");
			System.out.println();
			System.out.println("Bad Job!");
		}
		
		else {
			System.out.println("OMFG ...");
		}
		
		
		
	}

}
