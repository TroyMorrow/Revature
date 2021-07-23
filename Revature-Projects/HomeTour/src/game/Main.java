package game;

import java.util.Arrays;
import java.util.Scanner;
import game.Player;
import game.RoomManager;
import fixtures.Room;

public class Main {
	private static RoomManager manager = new RoomManager(9);
	private static boolean running = true;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		manager.init();
		manager.getRooms();
		manager.setRooms(manager.getRooms());
		printInstructions();
		Player player = new Player();
		
		
		player.setCurrentRoom(manager.getStartingRoom());
		
		
		while(running){
			printRoom(player);
			String[] input = collectInput();
			parse(input, player); 
			}
		
		if (!running) {
			System.out.println("Thanks for playing.");
		}
		
	}
		
		

	
	private static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom());
	}
	
	public static String[] collectInput() {
//		Scanner sc = new Scanner(System.in);
		String [] command = new String [2];
		
		for(int i = 0; i < command.length; i++) {
			command[i] = sc.nextLine();
		}
		
		return command;
		
	}
	
	public static void parse(String[] command, Player player) {
		String action = command[0].toUpperCase().intern();
		String details = null;
		
		if (command.length >1) {
			details = command[1].toUpperCase().intern();
		} 
		if (action == "GO" || action == "MOVE") {
			player.getCurrentRoom();
			switch(details) {
			case "NORTH":{
				player.getCurrentRoom().getExits(); //get new current room based on northern exit [0]
				player.setCurrentRoom(player.getCurrentRoom());
				break;
			}
			case "SOUTH": {
				player.getCurrentRoom().getExits(); //get new current room based on southern exit [1]
				player.setCurrentRoom(player.getCurrentRoom());
				break;
			}
			case "EAST": {
				player.getCurrentRoom().getExits(); //get new current room based on eastern exit [2]
				player.setCurrentRoom(player.getCurrentRoom());
				break;
			}
			case "WEST": {
				player.getCurrentRoom().getExits(); //get new current room based on western exit [3]
				player.setCurrentRoom(player.getCurrentRoom());
				break;
			}
			}
			}else if (action == "QUIT") {
			endGame();
		}
			
	}
	
	public static void movePlayer(String details, Player player) {
		
	}
	
	public static void endGame() {
		running = false;
	}
	
	public static void printInstructions() {
		System.out.println("Welcome to Escaped Room house tour! Using this program you with enter in specific instructions " + 
	"\n" + "to traverse the layout of the house to find items to unlock doors and leave the estate. " + "\n" + 
				"You will have to enter either 'GO' or 'MOVE' followed by a specific direction like north, south," + 
	"\n" + "east, or west. ");
	}
}
