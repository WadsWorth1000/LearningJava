package org.robey;

public class Exercise49MethodParameters {
	/*
	 * Learning Java:  Exercise 49
	   Adding parameters to Methods and Returning Values
	   
	   Pass a variable from the main method into another method, perform a calculation using that variable in the method, and then pass it back to the main method	  
	 */
	

	public static void main(String[] args) {
		
		int num1 = 11;
		
		int num2 = 4;
		
		int answer = multNumbers(num1);
		
		int answer2 = multNumbers(num2);
		
		double answer3 = divNumbers(num1);
		
		int answer4 = addNumbers(num1, num2);
		
		System.out.println("The answer is: " + answer);
			
		System.out.println("The answer is: " + answer2);
				
		System.out.println("The answer is: " + answer3);
		
		System.out.println("The answer is: " + answer4);
		
		
	}
		
		public static int multNumbers(int a) {
						
			int ans = a * 7;
			
			return ans;
			
		}
		
		public static double divNumbers(double a) {
			
			double ans = a / 2;
			
			return ans;
			
		}
		
		public static int addNumbers(int x, int y) {
			
			int ans = x + y;
			
			return ans;
			
		}
		
		
	

}
