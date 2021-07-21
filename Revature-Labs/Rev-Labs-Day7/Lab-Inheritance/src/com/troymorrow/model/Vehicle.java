package com.troymorrow.model;

public class Vehicle {
	private String name;
	private long serialNumber;
	
	//getters and setters
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
	public long getSerialNumber() {return this.serialNumber;}
	public void setSerialNumber(long serialNUmber) {this.serialNumber = serialNumber;}
	
	public void move() {
		System.out.println("Vehicle is moving...");
	}
	
	public void move(int spaces) {
		System.out.println("Vehicle moved " + spaces + " spaces");
	}
}
