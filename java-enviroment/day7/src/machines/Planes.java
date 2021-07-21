package machines;

import utilities.Flyable;

public class Planes extends Vehicle{
	public void fly() {
		System.out.println("Flying through the air");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("SPeeding up so we can fly later");
	}
}
