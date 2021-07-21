package overloadingPref;

public class Simulator {
	public static void main(String[] args) {
		method(5);
	}
	
	public static void method (int i) {
		System.out.println("int");
	}
	
	public static void method(long l ) {
		System.out.println("Long");
	}
	
	public static void method(int...var) {
		System.out.println("Var args");
	}
}
