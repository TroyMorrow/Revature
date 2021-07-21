package animals;

import utilities.Flyable;
import utilities.Herbivorous;

public class Bat implements Flyable, Herbivorous{
	public void fly() {
		System.out.println("Flying at night");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void digest() {
		// TODO Auto-generated method stub
		
	}
	
}
