/*
 * shipTester
 * Imogen Fagan
 * 4/30/25
 */
package Battleship;

public class shipTester {
	
	public static void main(String [] args) {
		//creating a new ship
		Ship ship1 = new Ship(4);
		System.out.print("Ship: ");
		System.out.println(ship1.toString());
		//checking to see if the ship's location and direction are set
		System.out.print("Location set: ");
		System.out.println(ship1.isLocationSet());
		System.out.print("Direction set: ");
		System.out.println(ship1.isDirectionSet());
		System.out.println();
		//setting other variables of the ship
		ship1.setDirection(0);
		ship1.setLocation(4,5);
		System.out.print("Ship: ");
		System.out.println(ship1.toString());
		//checking to see if the ship's location and direction are set
		System.out.print("Location set: ");
		System.out.println(ship1.isLocationSet());
		System.out.print("Direction set: ");
		System.out.println(ship1.isDirectionSet());
		//getting all the ship's variables 
		System.out.print("Length: ");
		System.out.println(ship1.getLength());
		System.out.print("Direction: ");
		System.out.println(ship1.getDirection());
		System.out.print("Row: ");
		System.out.println(ship1.getRow());
		System.out.print("Column: ");
		System.out.println(ship1.getCol());
	}
	
}
