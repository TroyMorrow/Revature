package machines;

public class Car extends Vehicle{
	public String make;
	public int year;
	
	public Car(int passengerCount, String engineSize, String model, String make, int year) {
		super(passengerCount, engineSize, model, "Car");
		this.make = make;
		this.year= year;
	}
	
	public void honkHorn() {
		System.out.println("Honk Honk");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
}
