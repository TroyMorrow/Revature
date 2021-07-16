package arrays;
/* 
 * 
 */
public class MultiArray {
	public static void main(String[] args) {
		int[][] numbers = new int[3][5];
		//                          0         1         2
		//                       0 1 2 3   0 1 2 3   0 1  2  3
		numbers = new int [][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(numbers[1][2]);
		
		int[][][] corrdinates = new int [][][] {{{1,2,3},{1,2,3},{1,2,3}},
												{{4,5,6},{4,5,6},{4,5,6}},
												{{7,8,9},{7,8,9},{7,8,9}}
												};
		
 	}
}
