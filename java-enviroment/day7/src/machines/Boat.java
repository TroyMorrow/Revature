package machines;

public class Boat extends Vehicle{

	public Boat(int passengerCount, String engineSize, String model, String type) {
		super(passengerCount, engineSize, model, type);
		// TODO Auto-generated constructor stub
	}
	
	public void coast() {
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving on the water");
	}
	
	
}
