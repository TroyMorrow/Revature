package objects;

public class Example {
	public String name;
	public int age;
	public Example (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Example [name = "+name+", age="+age+"]";
	}
	
	public boolean equals(Example example) {
		boolean equivalent = true;
		if (!this.name.equals(example.name)) {
			equivalent = false;
		}
		
		if (!(this.age == example.age)) {
			equivalent = false;
		}
		return equivalent;
	}
}
