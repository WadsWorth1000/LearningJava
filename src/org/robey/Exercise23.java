package org.robey;

public class Exercise23 {
	
	/* 
	  
	 *  Java: Exercise 23
	 * Arithmetic Shortcut Operators
	  
	 * x = x + y     x += y
	 * x = x - y     x -= y 
	 * x = x * y     x *= y
	 * x = x / y     x /= y 
	  
	 */


	public static void main(String[] args) {

	System.out.println("---------------------");
	System.out.println("Arithmetic Shortcuts:");
	System.out.println("---------------------");
	System.out.println("x = x + y  |  x += y");
	System.out.println("x = x - y  |  x -= y");
	System.out.println("x = x * y  |  x *= y");
	System.out.println("x = x / y  |  x /= y");  //(remember to use 'double' data types when dealing with division)
	System.out.println("____________________");
	System.out.println();
	System.out.println();
		
	
//Sample 1:  x += y	
	System.out.println("---------");
	System.out.println("Sample 1:  x += y");
	System.out.println("---------");

	int x = 3, y = 2;
	
	x += y;  //same as saying x = x + y;
	
	System.out.println("x = 3, y = 2");
	System.out.println("x += y (x = x + y)");
	System.out.println("The new value of 'x' is: " + x);
	
	System.out.println("________________________");
	System.out.println();
	System.out.println();
	
//Sample 2:  x -= y	
	
	System.out.println("---------");
	System.out.println("Sample 2:  x -= y");
	System.out.println("---------");
		
	x = 3; y = 2; //reassigned original value of variables because of changes to values in Sample 1
	x -= y;
	
	System.out.println("x = 3, y = 2");
	System.out.println("x -= y (x = x - y)");
	System.out.println("The new value of 'x' is: " + x);
	System.out.println("________________________");
	System.out.println();
	System.out.println();
	
//Sample 3:  x *= y	
	
	System.out.println("---------");
	System.out.println("Sample 3:  x *= y");
	System.out.println("---------");
	
	x = 3; y = 2;
	x *= y;
	
	System.out.println("x = 3, y = 2");
	System.out.println("x *= y (x = x * y)");
	System.out.println("The new value of 'x' is: " + x);
	
	System.out.println("________________________");
	System.out.println();
	System.out.println();
	
//Sample 4:  a /= b	
	
	System.out.println("---------");
	System.out.println("Sample 4:  a /= b");
	System.out.println("---------");
	
	double a = 3, b = 2;  //used double data type due to division. assigned different variables because 'x' and 'y' are already being used as integers above
	a /= b;
	
	System.out.println("a = 3, b = 2");
	System.out.println("a /= b (a = a / b)");
	System.out.println("The new value of 'a' is: " + a);
	System.out.println("__________________________");
	System.out.println();
	System.out.println();
	
//Sample 5: Arithmetic Shortcut Exercise 1
	
		System.out.println("---------");
		System.out.println("Sample 5:  Create a variable 'num' that increments from 1 to 15.");
		System.out.println("           Using a 'for' loop, output the following: ");
		System.out.println("           You will need to create variables a, b, c, d to hold the answers in the table below.");
		System.out.println("           Use shorthand arithmetic assignments everywhere that you can.");
		System.out.println("---------");
		System.out.println();
		
		int num;
			
		System.out.println("num \t   c = num + 2 \t   d = num - 2 \t   e = num * 2 \t   f = num / 2");
		System.out.println("___        ___________     ___________     ___________     ___________");
		
		for(num = 1; num <= 15; num++) {
			
			int c = num, d = num, e = num;
			double f = num;
			
			c += 2; //able to use shorthand operators because we have assigned variables 'c', 'd', 'e', 'f' to equal variable 'num' 
			d -= 2; //therefore: 'num = num + 2'  is the same as: 'c/d/e = num + 2'  which is the same as: 'c/d/e = c/d/e + 2'  
			e *= 2;
			f /= 2;
			
			System.out.println(num + " \t\t " + c + "\t\t"  + d + "\t\t" + e + "\t\t" + f);
									
		}
		
		System.out.println("__               __             __              __              ___");
		    
		
		System.out.println();
		
	}
	
	
}
