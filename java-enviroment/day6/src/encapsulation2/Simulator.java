package encapsulation2;

import encapsulation.EncapSimulator;

public class Simulator {
	public static void main(String[] args) {
		EncapSimulator en = new EncapSimulator();
//		System.out.println(en.pri);
//		System.out.println(en.def);
		/* 
		 * Default can only be accessed within the same package that class is declared
		 */
//		System.out.println(en.pro);
		/*
		 * protected can only be accessed within the same package that the class is declared OR
		 * within subclasses 
		 */
		System.out.println(en.pub);
	}
}
