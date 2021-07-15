package Operators;

public class Binary {
	public static void main(String[] args) {
		int mod = 10 % 3;
		System.out.println(mod);
		
		int oddOrEven = 15 % 2;
		System.out.println(oddOrEven);
		
		System.out.println("Hello there: " + (5 + 2));
		
		System.out.println(10 > 10); //false
		System.out.println(10 >= 10); //true
		
		System.out.println(10 == 10); //true
		System.out.println(10 != 10); //false
		
		/*
		 * Division with integers can be a bit confusing
		 * keep in mind that any whole number literal
		 * when used in any expression or assignment is 
		 * treated as an int datatype. int datatypes DO NOT
		 * use any decimal values
		 */
		double r_whole = 9/2;
		System.out.println(r_whole);
		
		double r_decimal = 9.0/2.0;
		System.out.println(r_decimal);
		
		
		int result = 9/2;
		System.out.println(result); //4
	}
}
