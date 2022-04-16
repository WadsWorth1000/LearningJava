package org.robey;

public class Exercise39 {
	public static final double PIE = 3.14;

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Scott");
		person1.setPhoneNumber(2144029471);
		person1.insert();
		person1.extraLife();

		Person person2 = new Person();
		person2.setName("Ryan");
		person2.setPhoneNumber(2145647789);
		person1.insert();

		int num1 = 11;
		
		int answer = 1;

		double num2 = 2.27;
		
		answer = multNumbers(num1);
		
		System.out.println(answer);

		
	}

	public static int multNumbers(int a) {

		int ans = a * 7;

		return ans;

	}

}
