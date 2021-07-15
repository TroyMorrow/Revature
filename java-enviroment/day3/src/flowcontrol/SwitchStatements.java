package flowcontrol;

public class SwitchStatements {
	public static void main(String[] args) {
		char letter = 'j';
		
		switch (letter) {
		case 'a':
			System.out.println("A is for Assembly");
			break;
		case 'b':
			System.out.println("B is for Binary");
			break;
		case 'c':
			System.out.println("C is for compiled");
			break;
		default:
			System.out.println("No matching letter found");
		}
	}
}
