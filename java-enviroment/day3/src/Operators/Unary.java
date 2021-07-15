package Operators;
/*
 * Unary operators are operators that apply
 * some functionality to a single operand
 * note that some operators are context specific,
 * meaning that they can either change functionality 
 * based on the values used, or must only be used
 * with a specific type of operand.
 */

public class Unary {
	public static void main(String[] args) {
		int post = 10;
		System.out.println(post); // 10
		System.out.println(post++); // 10 then increase 10 to 11
		System.out.println(post);
		
		System.out.println("Before: " + post++ + ", After: " + post);
		
		int pre = 10;
		System.out.println(pre);
		System.out.println(--pre);
		
		
	}
}
