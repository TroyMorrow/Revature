package exceptions;

public class Simulator {
	public static void main(String[] args) {
		try {
			System.out.println(sumOddNumbers(4, 5));
		} catch (EvenNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * when excuting methods in the even that we catch any particular exception
		 * we can perfomr any next logical steps. Printing a stack trace is typically
		 * viewed as a good default step to take since it allows you information
		 * to diagnose your problem 
		 */
	}
	/*
	 *Using a throws declaration is known as ducking the exception
	 *this means that we will not resolve the issue directly within this method, 
	 *but rather will communicate to the location that involves this method that the 
	 *issue must be resolved. this is used to consolidate try-catch blocks in your
	 *code 
	 */
	
	public static int sumOddNumbers(int a, int b) throws EvenNumberException{
		if (a % 2 == 0) {
			throw new EvenNumberException("First Input was Even");
		}else if (b % 2 == 0) {
			throw new EvenNumberException("Second Input was Even");
		}
		
		return a + b;
	}
	
	public static int divide(int a, int b) {
		
		return a/b;
	}
}
