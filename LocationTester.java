/*
 * LocationTester
 * Imogen Fagan
 * 4/30/25
 */
package Battleship;

public class LocationTester {
	public static void main(String [] args) {
		Location loc = new Location();
		//checking the stats for an unguessed location
		System.out.println("UNGUESSED LOCATION");
		System.out.print("Hit? ");
		System.out.println(loc.checkHit());
		System.out.print("Miss? ");
		System.out.println(loc.checkMiss());
		System.out.print("Unguessed? ");
		System.out.println(loc.isUnguessed());
		System.out.print("Ship? ");
		System.out.println(loc.hasShip());
		System.out.print("Status? ");
		System.out.println(loc.getStatus());
		System.out.println();
		
		//changing some of the variables for the location
		loc.markMiss();
		loc.setStatus(2);
		//checking the stats for a missed location
				System.out.println("MISSED LOCATION");
				System.out.print("Hit? ");
				System.out.println(loc.checkHit());
				System.out.print("Miss? ");
				System.out.println(loc.checkMiss());
				System.out.print("Unguessed? ");
				System.out.println(loc.isUnguessed());
				System.out.print("Ship? ");
				System.out.println(loc.hasShip());
				System.out.print("Status? ");
				System.out.println(loc.getStatus());
				System.out.println();
			
				//making a new location to be a hit and changing some of its variables
			Location loc2 = new Location();
			loc2.markHit();
			loc2.setShip(true);
			
				//checking the stats for a hit location
				System.out.println("HIT LOCATION");
				System.out.print("Hit? ");
				System.out.println(loc2.checkHit());
				System.out.print("Miss? ");
				System.out.println(loc2.checkMiss());
				System.out.print("Unguessed? ");
				System.out.println(loc2.isUnguessed());
				System.out.print("Ship? ");
				System.out.println(loc2.hasShip());
				System.out.print("Status? ");
				System.out.println(loc2.getStatus());
				System.out.println();
		
				//making a third location to test what is wrong with the output
				//and changing some of its variables
				loc2.setStatus(0);
				//checking the stats for this location
				System.out.println("SET STATUS TO 0");
				System.out.print("Hit? ");
				System.out.println(loc2.checkHit());
				System.out.print("Miss? ");
				System.out.println(loc2.checkMiss());
				System.out.print("Unguessed? ");
				System.out.println(loc2.isUnguessed());
				System.out.print("Ship? ");
				System.out.println(loc2.hasShip());
				System.out.print("Status? ");
				System.out.println(loc2.getStatus());
				System.out.println();
		
		
	}
}
