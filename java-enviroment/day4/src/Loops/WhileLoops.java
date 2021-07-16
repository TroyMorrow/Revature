package Loops;

public class WhileLoops {
	public static void main(String[] args) {
		System.out.println("Start of Application");
		char letter = 'a';
		/*
		 * while loops will check a boolean condition
		 * and if it is true then the while loop will
		 * execute the logic of the loop
		 */
		while (letter <= 'z') {
			System.out.print(letter);
			
			if (letter == 'j')
				break;
			letter++;
		}
		/*
		 * do-while loops execute the logic of the loop
		 * prior to checking the condition
		 */
		
//	do {
//			System.out.println(letter);
//			letter++;
//		}while(letter <= 'j');
		System.out.println("\nEnd of Application");
	}
}
