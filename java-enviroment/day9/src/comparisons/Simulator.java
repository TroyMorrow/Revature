package comparisons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * the arrays class is a utilities class that provides functionality
 * and utility methods that can be used with array object. 
 * 
 * The collections class with an s is a utility class that provides functionality and
 * utility methods that can be used with objects that inherit form the collection 
 */
public class Simulator {
	public static void main(String[] args) {
		Data d1 = new Data(1,4.5);
		Data d2 = new Data(17,99.2);
		Data d3 = new Data(7,14.6);
		Data d4 = new Data(81,9.9);
		Data d5 = new Data(37,103.4);
		Data [] datas = {d1, d2, d3, d4, d5};
		System.out.println(datas);
		System.out.println("COMPARABLE INTERFACE");
		System.out.println("BEFORE SORT:");
		System.out.println(Arrays.toString(datas));
		Arrays.sort(datas);
		System.out.println("AFTER SORT:");
		System.out.println(Arrays.toString(datas));
		
		ArrayList<Data> dlist = new ArrayList<Data>();
		dlist.add(d1);
		dlist.add(d2);
		dlist.add(d3);
		dlist.add(d4);
		dlist.add(d5);
		System.out.println("COMPARATOR INTERFACE");
		System.out.println("NUM COMPARATOR [BEFOR]");
		System.out.println(dlist);
		System.out.println("NUM COMPARATOR [AFTER]");
		Collections.sort(dlist, new NumComparator());
		System.out.println(dlist);
		
		System.out.println("COMPARATOR INTERFACE");
		System.out.println("WEIGHT COMPARATOR [BEFOR]");
		System.out.println(dlist);
		System.out.println("WEIGHT COMPARATOR [AFTER]");
		Collections.sort(dlist, new WeightComparator());
		System.out.println(dlist);
	}
}
