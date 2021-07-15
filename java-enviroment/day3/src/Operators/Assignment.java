package Operators;

public class Assignment {
	public static void main(String[] args) {
		int x = 100;
		
		System.out.println(x = 15);
		System.out.println(x); 
		
		boolean run = false;
		
		/*
		 * Be wary of the following
		 * Below does NOT check the value of boolean run
		 * it changes its value to true!
		 * 
		 * Use == to compare the boolean run to the value
		 * given in the if statement.
		 */
		if (run = true) {
			System.out.println("I ran!");
		}
	}
}
