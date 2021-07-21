package machines;

public abstract class Vehicle extends Object{
	public int passengerCount;
	public String engineSize;
	public String model;
	public String type;
	
	
	public Vehicle(int passengerCount, String engineSize, String model, String type) {
		super();
		this.passengerCount = passengerCount;
		this.engineSize = engineSize;
		this.model = model;
		this.type = type;
	}

	public Vehicle() {
		this(0, "na", "n/a", "n/a");
	}
	public abstract void drive();
	
	public void start() {
		System.out.println("Starting the Engine");
	}
	
	public void brake() {
		System.out.println("Slowing down");
	}
}
