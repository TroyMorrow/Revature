package two;

import one.Parent;

public class Simulator extends Child{
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pub);
//		System.out.println(p.pro);
		
		Child c = new Child();
		System.out.println(c.pub);
//		System.out.println(c.pro);
		
		/*
		 * the following is accessible , Not because of inheritance, but 
		 * because the Child class and simulator exist within the same package
		 */
		Simulator s = new Simulator();
		System.out.println(s.pub);
		System.out.println(s.pro); // only works when child class is extended
	}
}
