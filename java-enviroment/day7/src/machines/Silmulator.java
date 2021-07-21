package machines;

import maintenance.CarWash;

public class Silmulator {
	public static void main(String[] args) {
//		Vehicle v = new Vehicle();
		CarWash cw = new CarWash();
//		v.start();
		
		Car c = new Car(0, "v6", "Accord", "Honda", 2000);
		c.start();
		c.honkHorn();
		
		CarOwner co = new CarOwner("Joseph", c);
		cw.washCar(c);
		
		Sedan s = new Sedan(0, "v4" , "Civic", "Honda", 2000);
		s.honkHorn();		
		Planes p = new Planes();
//		p.start();
//		p.fly();
		
		Vehicle one = new Car(4, "v6", "Accord", "Honda", 2000);
//		Vehicle two = new Planes(100, "757", "boeing Flymaster");
		Boat b = new Boat(0, null, null, null);
		
		
	}
	
	public static void useFunction(Vehicle v) {
		if (v instanceof Boat) {
			((Boat)v).coast();
		}else if (v instanceof Car) {
			((Car)v).honkHorn();
		}else {
			v.drive();
		}
	}
}
