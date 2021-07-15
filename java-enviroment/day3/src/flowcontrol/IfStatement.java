package flowcontrol;
/*
 * Flow control statements allow you to dictate the 
 * execution order of functionality within your language
 * typically using keyword/reserved words for a language
 * 
 * Conditional statement are a sub-category of flow-control
 * statements which allow you to choose certain functionality
 * based on a boolean condition
 */

public class IfStatement {

	public static void main(String[] args) {
		System.out.println("Start of application");
		
		int x = 5;
		/*
		 * be wary of where you place your semi-colon
		 * when creating flow control statements
		 */
		if(x < 0) {
			System.out.println("The condition was true");
			System.out.println("We execute all of the code associated "
					+ "with an if statement");
		}
		
		int y = 80;
		if(y > 100) {
			System.out.println("Y is more than 100");
		} else if(y >= 10){
			System.out.println("Y is more than 10 but less than 100");
		} else {
			System.out.println("Y is 9 or less");
		}
		/* 
		 * this is an example of a nested if statement
		 */
		int age = 16;
		boolean withParent = false;
		if (age >=18) {
			System.out.println("You can watch rated R movies");
		} else if (age>13) {
			if (withParent) {
				System.out.println("You can watch rated R movies");
			}else {
				System.out.println("You can watch rated T movies");
			}
		}else {
			if (withParent) {
				System.out.println("You can watch rated T movies");
			}else {
				System.out.println("You can watch rated E movies");
			}
		}
		
		if (age >= 18 || (age >= 13 & withParent)) {
			System.out.println("You can watch rated R movies");
		}
		
		System.out.println("End of Application");
	}
}
