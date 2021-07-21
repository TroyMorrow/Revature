package com.troymorrow.model;

public class Airplane extends FlyingVehicle{
	private short wheels;
	private short propellors;
	
	public Airplane(short wheels, short propellors) {
		this.wheels = wheels;
		this.propellors = propellors;
	}
	
	public short getWheels() {return this.wheels;}
	public void setWheels(short wheels) {this.wheels = wheels;}
	
	public short getPropellors() {return this.propellors;}
	public void setPropellors(short propellors) {this.propellors = propellors;}
	
	public void turn() {
		System.out.println("Turing...");
	}
}
