package strings;

public class Simulator {
	public static void main(String[] args) {
		String one = "Revature";
		String two = new String("Revatrue");
		String three = "Revature";
		
		System.out.println(one);
		System.out.println(two);
		
		/*
		 * the == operator compares memory addresses
		 * when creating strings string literals are placed in the string pool
		 * while other string objects are placed in the normal heap area
		 */
		
		System.out.println(one == two);
		System.out.println(one == three);
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
	}
}
