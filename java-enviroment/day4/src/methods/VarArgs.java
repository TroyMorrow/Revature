package methods;

public class VarArgs {
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		String [] sentences = new String[] {"Hello", "Goodbye"};
		va.takeArray(sentences);
		va.takeVarArgs(sentences);
		va.takeVarArgs("Hello", "Goodbye", "Programming", "Java");
		va.takeVarArgs();
		
	}
	
	public void takeArray(String[] words) {
		for (String w : words) {
			System.out.println(w);
		}
	}
	
	/* 
	 * to use the following method we can pass any arbitrary 
	 * number of arguments (so long as they are the same datatype
	 * as declared), and our method will work
	 */
	public void takeVarArgs(String... words) {
		for (String w : words) {
			System.out.println(w);
		}
	}
}
