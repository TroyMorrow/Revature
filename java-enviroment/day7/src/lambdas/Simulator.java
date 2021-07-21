package lambdas;

public class Simulator {
	public static void main(String[] args) {
		HelloWorldInterface hwi = new HelloWorldClass();
		hwi.sayHello();
		
		HelloWorldInterface hlam = () -> {
			System.out.println("Hello World- Lambda");
		};
		hlam.sayHello();
		
		TakeInput tilam1 = (String word, int num) -> {
			System.out.println("Word: " + word + ", num: " + num);
		};
		tilam1.printInput("Revature", 100);
		
		TakeInput tilam2 = (word, num) -> {
			System.out.println("Word: " + word + ", num: " + num);
		};
		
		TakeInput tilam3 = (a, b) -> {
			System.out.println("Word: " + a + ", num: " + b);
		};
	}
}
