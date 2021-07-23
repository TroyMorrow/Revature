package game;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	public Room[] rooms;
	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}
	//creating rooms
	public void init() {
		Room foyer = new Room("The Foyer", "A small foyer", "The small entry way of " + 
	"a neo-colonial house. A dining room is open to the west, where a large table " + 
				"can be seen." + "\n" + "The hardwood floor leads east into doorway " + 
	  "\n" + "To the north is a small room, where you can see a piano.");
		this.rooms[0] = foyer;
		
		
		Room hallway = new Room("Hallway", "Main Hallway", "This is Hallway");
		this.rooms[1] = hallway;
		
		Room dining = new Room("The Dining Room", "Fancy dining room", "The dining room "+ 
		"looks to be decorated as one the your would see from 1700's England. " + "\n" + 
				"Through the double doors to the north is the Foyer." + "\n" + "To the east " + 
		" is the entrance to the kitchen." + "\n" + "The south leads to what appears to be " + 
				"a small study but looks quite mysterious.");
		this.rooms[2] = dining;
		
		Room piano = new Room("Piano Room", "Room with Giant Grand Piano","This room looks like it was created to help "+ 
		"someone practice for a performance in a girant concert hall.");
		this.rooms[3] = piano;
		
		Room kitchen = new Room("The Kitchen", "Large kitchen", "The large is very big " + 
				"with wall to wall cabinets. The kitchen is painted a mild gray with blue accents." + "\n" + "There is an aroma in the room as if someone just " + 
				"finsihed cooking." + "\n" + "There is a doorway to the north that seems to lead to a " + 
						"room with a piano." + "\n" + "To the south is the dining room." + "\n" + 
				"To the west is a closed door." + "\n" + "And to the east is the foyer.");
		this.rooms[4] = kitchen;
		
		Room study = new Room("Study", "Main study", "You enter the main study and realize" + 
		" the reason is felt mysterious wa because you watched too many horror and thriller movies.");
		this.rooms[5] = study;
		
		Room closet = new Room("Closet" ,"Jacket Closet", "This is a jacket closet and there is no where to go except " + 
		"for back to the kitchen.");
		this.rooms[6] = closet;
		
		Room living = new Room("Living Room", "Large Living Room", "Large living room with an L shape couch that " + 
		"can sit 12 people and a big 80inch TV mounted on the wall.");
		this.rooms[7] = living;
		
		Room outside = new Room("Outside", "Porch on Backyard", "You are now outside. You see a fire pit, many outdoor chairs "+ 
		"and tables, as well as a big pool and hot tub.");
		this.rooms[8] = outside;
		
		//setting Exits [0]: north, [1]: south, [2]: east, [3]: west
		Room[] foyerExits = {hallway, null, piano, dining};
		foyer.setExits(foyerExits);
		
		Room[] hallwayExits = {living, foyer, null, kitchen};
		hallway.setExits(hallwayExits);
		
		Room[] diningExits = {kitchen, null, foyer, study};
		dining.setExits(diningExits);
		
		Room[] pianoExits = {null, null, null, foyer};
		piano.setExits(pianoExits);
		
		Room[] kitchenExits = {closet, dining, hallway, null};
		kitchen.setExits(kitchenExits);
		
		Room[] studyExits = {null, null, dining, null};
		study.setExits(studyExits);
		
		Room[] livingExits = {outside, hallway, null, null};
		living.setExits(livingExits);
		
		Room[] closetExits = {null, kitchen, null, null};
		closet.setExits(closetExits);
		
		Room[] outsideExits = {null, living, null, null};
		outside.setExits(outsideExits);
		
		this.startingRoom = foyer;
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
}
