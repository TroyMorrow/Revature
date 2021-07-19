package scanners;

import java.util.Scanner;

public class ScanSimulator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		System.out.println(sentence);
		String word = scan.next();
		System.out.println("Your word was: " + word);
		int number = scan.nextInt();
		if (number > 10) {
		System.out.println("Your number is high: " + number);
	}else { 
		System.out.println("Your number is low: " + number);
	}
	}
}
