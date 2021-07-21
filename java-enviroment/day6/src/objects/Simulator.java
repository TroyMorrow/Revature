package objects;

public class Simulator {
	public static void main(String[] args) {
		Example ex_1 = new Example("Example One" ,1);
		System.out.println(ex_1);
		
		Example ex_2 = new Example ("Example Two" , 2);
		System.out.println(ex_2);
		
		Example ex_3 = new Example("Example One", 1);
		
		System.out.println(ex_3);
		System.out.println(ex_1.equals(ex_2));
		System.out.println(ex_1.equals(ex_3));
	}
}
