package two;

import one.Parent;

public class Child extends Parent{
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pub);
//		System.out.println(p.pro); //error
//		System.out.println(p.def); //error
//		System.out.println(p.pri); //error
		
		Child c = new Child();
			System.out.println(c.pub);
			System.out.println(c.pro);
//			System.out.println(c.def); //error
//			System.out.println(c.pri); //error
	}
}
