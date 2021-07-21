package objects;

import java.util.Objects;

public class Automated {
	public String name;
	public int age;
	
	public Automated(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Automated [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automated other = (Automated) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
}
