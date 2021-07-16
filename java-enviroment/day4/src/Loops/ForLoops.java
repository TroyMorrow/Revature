package Loops;

public class ForLoops {
	public static void main(String[] args) {
		System.out.println("Start of application");
		/* 
		 * For -loops like while and do-while loops
		 * are used to repeat some portion of our code.
		 * For loops provide us with more nuanced control
		 * over the logic of the loop. the syntax of the a 
		 * for loop is as follows:
		 * 
		 * for(initialization; condition; modification){
		 *    body of loop
		 *    }
		 *    
		 *    initialization: a statement that will
		 *    execute one time before our loops condition is evaluated
		 *    
		 *    condition: the statement used to determine
		 *    when our for-loop will execute. SPecifically this is a boolean statement
		 *    typically this condition uses a variable created during the initialization
		 *    
		 *    modification: a statement that will execute at the end of each cycle
		 */
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		for (int x = 10; x >= 0; x--) {
			System.out.println(x);
		}
		
		for (int j = 2; j == 2; j =15) {
			System.out.println("This only happens once");
		}
		
		System.out.println("End of application");
	}
}
