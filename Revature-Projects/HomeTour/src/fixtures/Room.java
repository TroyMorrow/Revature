package fixtures;

import java.util.Scanner;

public class Room extends Fixture{
	private Room[] exits =  new Room[4];


	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	public Room[] getExits() {
		return this.exits;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public Room getExit(String direction) {
		return null;
	}
	
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
}
