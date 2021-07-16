package Loops;

public class BreakAndContinue {
	public static void main(String[] args) {
		//break statement halts executing of code completely
		System.out.println("BREAK:");
		for (char letter = 'a'; letter < 'd'; letter++) {
			for (int i = 0; i < 4; i++) {
				if (i == 2) {
					break;
				}
				System.out.println(letter + ":" +i);
			}
		}
		//Continue halts code only at the condition in which is it stated
		System.out.println("CONTINUE:");
			for (char letter = 'a'; letter < 'd'; letter++) {
				for (int i = 0; i < 4; i++) {
					if (i == 2) {
						continue;
					}
					System.out.println(letter + ":" +i);
				}
		}
			/*
			 * A label is an identifier/moniker we can apply 
			 * to a loop that allows us to dictate where we 
			 * apply the logic for a break or continue statement
			 * NOTE that the name of labels are arbitary we
			 * as developers can put any value there 
			 * 
			 * label syntax
			 * 
			 * <label-name> : for..
			 * <label-name> : while..
			 * <label-name> : do..
			 */
		System.out.println("LABELS:");
			alpha: for (char letter = 'a'; letter < 'd'; letter++) {
				numeric: for (int i = 0; i < 4; i++) {
					if (i == 2) {
						continue alpha;
					}
					System.out.println(letter + ":" +i);
				}
		}
	
	}
}
