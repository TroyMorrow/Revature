package scopes;

/*
 * static scope: Accessible throughout the lifetime of our app
 * Instance scope: Accessible so long as the object exists in memory
 * Method scope: Accessible so long as we are actively executing method
 * Block Scope: Accessible so long as we are actively executing the flow control statement
 */

public class Data {
	//instance scope
	public String name;
	/*
	 * iNSTANCE AND CLASS VARIABLES SHARE THE SAME
	 * POOL OF VARIABLE NAMES
	 */
	//static scope
	public static int count;
	
	public static void main(String[] args) {
		//method scope
		
		/*
		 * Variables within a method or block scope can share
		 * the same name with variables in a class or instance scope
		 * but cannot share the same name within other variables within the same method
		 */
		int i = 0;
		for (i = 0; i < 10; i++){
			System.out.println(i);
		}
		for (int x = 10; x > 5; x--){// x is within block scope
			System.out.println(x);
		}
	}
	
	public static void variable() {
		int i = 100;
	}
}
