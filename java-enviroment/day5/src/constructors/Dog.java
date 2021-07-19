package constructors;

public class Dog {
	public String name;
	public double weight;
	public int age;
	public String breed;
	
	//THis is what a default Dog Constructor looks like
//	public Dog() { } 
	
	/* 
	 * Below is an example of a custom constructor 
	 * typically constructors are created as a way to initialize 
	 * on a class
	 * 
	 * when you define a custom constructor, java will not provide 
	 * you with the default constructor any longer
	 */
	
	public Dog(String name, double weight, int age ,String breed) {
		/*
		 * if you do not use the this keyword variables
		 * that are created within a method will
		 * shadow the variables listed at an object.instance
		 * scope that share the same name. this is known as variable shadowing
		 */
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.breed = breed;
	}
	public Dog(int age) {
		this("No Name Provided", 0.0, age, "No Breed Provided");
	}
	
	public Dog(String n) {
		name = n;
	}
	
	public void bark() {
		System.out.println("Woof Woof");
	}
	
}
