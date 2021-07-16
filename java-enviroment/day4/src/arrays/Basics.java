package arrays;
/*
 * Arrays  are a fixed in length data structure that allows
 * you to store multiple pieces of the same datatype (known
 * as elements) within a single variable
 * Ararys are objects and as such the variable relating to
 * the array is a reference variable (not a primitive)
 */
public class Basics {
	public static void main(String[] args) {
		/*
		 * there are multiple ways to create arrays
		 * the first shown here is to create a new 
		 * empty array of a fixed size
		 */
		int[] numbersOne = new int[5]; 
		
		/*
		 * the second way is shown here to create an
		 * array of a fixed size, while also assigning
		 * the values to the array
		 */
		int[] numebersTwo = new int[] {4,7,0,12,77};
		
		/*
		 * the third method:  known as anonymous array 
		 * assignment. an anonymous array is one that does not declare the datatype.
		 * here the dataype can be infered due to the declaration
		 * of our reference variable
		 * 
		 * YOu can ONLY assign an anonymous array to a reference variable in the same line
		 */
		int[] numbersThree = {5,66,80,23,6};
		
		int i = 9;
		i = 1000;
		
		numbersOne = new int[] {1,2,3,4};
		//numbersThree = {1,2,3,4}; //error
		
		/*
		 * When you want ot access elements/data within
		 * an array, you can use do so by using the index of 
		 * the array
		 */
		
		System.out.println(numbersThree[0]);
		System.out.println(numbersThree[2]);
		numbersThree[0] = 99;
		System.out.println(numbersThree[0]);
		
		/*
		 * Casting with regards to arrays
		 * 1- we cannot cast the array as a whole, to 
		 * another array datatype. (we will talk more 
		 * about inheritance later in the program, but effectively, 
		 * arrays of 
		 */
		double[] doubles = new double[] {1.0,2.5,7.4};
		numbersThree[0] = (int)doubles[2];
		doubles[0] = numbersThree[1];
		
		int[] numbersFour = numbersThree;
		System.out.println(numbersFour[0]);
		System.out.println(numbersThree[0]);
		numbersFour[0] = 5;
		System.out.println(numbersFour[0]);
		System.out.println(numbersThree[0]);
		numbersFour = new int[] {88,99,102};
		System.out.println(numbersFour[0]);
		System.out.println(numbersThree[0]);
		
		int numbersFive[] = new int[] {5,5,5,5,5};
	}
}
