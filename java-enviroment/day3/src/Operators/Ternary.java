package Operators;
/*
 * the ternary operator is used with three operands. a boolean
 * conditions followed by two expression. the first 
 * expression will be the result of the ternary in the event
 * the condition is true, the second expression will be 
 * returned in the event the condition is false
 */
public class Ternary {
	public static void main(String[] args) {
		int a = true ? 15 : 99; // 15 assigned to A
		int b = false ? 15: 99; // 99 assigned to B
		
		String result = a > b ? "A was larger" : "B was larger";
		System.out.println(result);
		
		
	}
}
