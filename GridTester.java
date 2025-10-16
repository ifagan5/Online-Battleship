/*
 * GridTester
 * Imogen Fagan
 * 4/30/25
 */
package Battleship;

public class GridTester {
	public static void main(String [] args) {
		//making the grid
		Grid grid = new Grid();
		//setting where all my ships live
		grid.setShip(4, 0, true);
		grid.setShip(4, 1, true);
		grid.setShip(4, 2, true);
		grid.setShip(2, 1, true);
		grid.setShip(1, 1, true);
		grid.setShip(7, 3, true);
		grid.setShip(7, 4, true);
		grid.setShip(7, 5, true);
		grid.setShip(7, 6, true);
		grid.setShip(7, 8, true);
		grid.setShip(8, 8, true);
		grid.setShip(9, 8, true);
		//printing where my ships are
		System.out.println("Seeing all of your ships");
		grid.printShips();
		//setting where my opponent has guessed (and whether or not is was a hit/miss)
		grid.markHit(4, 0);
		grid.markHit(4, 1);
		grid.markHit(4, 2);
		grid.markMiss(5, 2);
		grid.markMiss(4, 3);
		grid.markMiss(3, 3);
		//printing y opponent's guesses
		System.out.println("Seeing an opponent guess until they sink one of your ships");
		grid.printStatus();
		
		
		Ship s = new Ship(3);
		s.setLocation(3,5);
		s.setDirection(0);
		
		Ship s2 = new Ship(4);
		s2.setLocation(4,8);
		s2.setDirection(1);
		grid.addShip(s2);
		grid.addShip(s);
		grid.printShips();
	}
}
