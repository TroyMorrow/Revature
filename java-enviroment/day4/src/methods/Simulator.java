package methods;

public class Simulator {
	public static void main(String[] args) {
		Account acc = new Account();
		//below we invoke the 'deposit' method on our account object
		/*
		 * when you declare a method the list of placeholder variables you can use 
		 * are known as parameters when invoking a method the data that you supply to the method
		 * are known as arguments
		 */
		acc.deposit(100.00);
		acc.deposit(50.00);
		
		Account accTwo = new Account();
		accTwo.deposit(1000.00);
		System.out.println(acc.total);
		System.out.println(accTwo.total);
		
		acc.deposit();
		acc.deposit("Birthday gift ", 100.00);
		
		System.out.println("My account has: $" + acc.viewTotal());
	}
}