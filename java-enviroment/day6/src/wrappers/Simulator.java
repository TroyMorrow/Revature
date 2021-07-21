package wrappers;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * the Wrapper classes in java:
		 * Byte, Short, Integer, Character, Long, Double, Float, Boolean
		 * are associated with the primitives
		 * byte, short, int, char, long, double, float, boolean
		 */
		int num = 9;
		/*
		 * autoboxing: the implicit process of converting a primitive into a wrapper in Java
		 */
		Integer number = num;
		
		number = null;
		
//		num.toString();
		number.toString();
		/*
		 * unboxing: the implicit processing of converting a wrapper into a primitive in Java
		 */
		
		int unbox = number;
		
		
	}
}
