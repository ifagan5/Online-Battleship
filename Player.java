package Battleship;
import java.util.Scanner;
import java.util.Random;

public class Player {
	private Ship s2;
	private Ship s31;
	private Ship s32;
	private Ship s4;
	private Ship s5;
	private Ship[] arr = {s2, s31, s32, s4, s5};
	
	//ships and opp's guesses
	private Grid ownGrid = new Grid();
	//own guesses
	private Grid guesses = new Grid();
	
	/**
	 * Player constructor
	 */
	public Player() {
		s2 = new Ship(2);
		s31 = new Ship(3);
		s32= new Ship(3);
		s4 = new Ship(4);
		s5 = new Ship(5);
	}
	
	public Ship gets2() {
		return s2;
	}
	
	public Ship[] getArr() {
		return arr;
	}
	
	public Ship gets31() {
		return s31;
	}
	
	public Ship gets32() {
		return s32;
	}
	
	public Ship gets4() {
		return s4;
	}
	
	public Ship gets5() {
		return s5;
	}
	
	public Grid getOwnGrid() {
		return ownGrid;
	}
	
	public Grid getGuesses() {
		return guesses;
	}
	
	/**
	 * Adds a ship to a specified location on the player's grid
	 * @param s (Ship) - the ship that is being added
	 * @param row (int) - the row that ship will be added into (first box)
	 * @param col (int) - the column the ship will be added into (first box)
	 * @param direction (int) - whether the ship is horizontal or vertical 
	 */
	public void chooseShipLocation(Ship s, int row, int col, int direction) {
		s.setLocation(row, col);
		s.setDirection(direction);
		ownGrid.addShip(s);
	}
	
	/**
	 * prints the player's grid (which has the player's boats and their opponent's guesses)
	 */
	public void printMyShips() {
		ownGrid.printShips();
	}
	
	/**
	 * prints out the player's grid (which has the player's boats and their opponent's guesses)
	 */
	public void printOpponentsGuesses() {
		ownGrid.printStatus();
	}
	
	/**
	 * print's out the grid of the player's guesses
	 */
	public void printMyGuesses() {
		guesses.printStatus();
	}
	
	/**
	 * Takes in a square that the opponent guessed and returns whether or not it was a hit and updates the player's own grid to reflect their
	 * opponent's guess.
	 * @param row (int) - the row my opponent guessed
	 * @param col (int) - the column my opponent guessed
	 * @return (boolean) - whether or not my opponent hit a ship (true if it was a hit, false if not)
	 */
	public boolean recordOpponentGuess(int row, int col) {
		if(ownGrid.hasShip(row, col)) {
			ownGrid.markHit(row, col);
			return true;
		}
		else {
			ownGrid.markMiss(row, col);
			return false;
		}
	}
	
	/**
	 * Takes in a square that the player guessed and whether or not that guess was a hit, and then updates the player's guesses
	 * grid to show that guess.
	 * @param row (int) - the row the player guessed
	 * @param col (int) - the column of the player's guess
	 * @param val (boolean) - whether or not it was a hit
	 */
	public void markGuess(int row, int col, boolean val) {
		if(val) {
			guesses.markHit(row, col);
		}
		else {
			guesses.markMiss(row, col);
		}
	}
	
	/**
	 * this method asks the player for a guess and re
	 * @return
	 */
	public int[] askForGuess() {
		Scanner input = new Scanner(System.in);
		System.out.println("Player, what letter row would you like to guess?");
		String r = input.next();
		int row = -1;
		while(row == -1) {
			if(r.equals("A") || r.equals("a")) {
				row = 0;
			}
			else if (r.equals("B")|| r.equals("b")) {
				row = 1;
			}
			else if (r.equals("C")|| r.equals("c")) {
				row = 2;
			}
			else if (r.equals("D")|| r.equals("d")) {
				row = 3;
			}
			else if (r.equals("E")|| r.equals("e")) {
				row = 4;
			}
			else if (r.equals("F")|| r.equals("f")) {
				row = 5;
			}
			else if (r.equals("G")|| r.equals("g")) {
				row = 6;
			}
			else if (r.equals("H")|| r.equals("h")) {
				row = 7;
			}
			else if (r.equals("I")|| r.equals("i")) {
				row = 8;
			}
			else if (r.equals("J")|| r.equals("j")){
				row = 9;
			}
			else {
				System.out.println("That row doesn't exist! Please try again!");
				System.out.println("Player, what letter row would you like to guess?");
				r = input.next();
			}
			
		}
		
		
		int col = -1;
		while (!(col > 0 && col <= 10)) {
			try {
				System.out.println("Player, what number column would you like to guess?");
				col = input.nextInt();
				if (col > 10 || col < 1) {
					System.out.println("That column doesn't exist! Please try again!");
				}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();
			} 
		}
		col = col -1;
		int[] arr = {row, col};
		return arr;
		
	}
	
	public void initializeShipsRandomly() {
		 for(int i = 0; i < arr.length; i++) {
		 //int length = arr[i].getLength();
		 int dir;
		 int row;
		 int col;
		 Ship ship = arr[i];

		 //while(true) { 
		dir = Randomizer.nextInt(0, 1); 
		row = Randomizer.nextInt(0, ownGrid.numRows() - 1); 
		col = Randomizer.nextInt(0, ownGrid.numCols() - 1); 
		if(!ownGrid.hasShip(row, col)){
			int r = row;
			int c = col;
			//horizontal
			if(dir == 0) {
				for(int j = 0; j < ship.getLength(); j++) {
					r++;
					if(ownGrid.hasShip(r, col)) {
						row = Randomizer.nextInt(0, ownGrid.numRows() - 1); 
						col = Randomizer.nextInt(0, ownGrid.numCols() - 1);
						break;
					}
					else {
						
					}
				}
			}
			
			else {
				for(int j = 0; j < ship.getLength(); j++) {
					c++;
					if(ownGrid.hasShip(row, c)) {
						row = Randomizer.nextInt(0, ownGrid.numRows() - 1); 
						col = Randomizer.nextInt(0, ownGrid.numCols() - 1);
						break;
					}
					else {
						
					}
				}
			}
		}
		ship.setDirection(dir); 
		ship.setLocation(row, col); 
	
		 
		//ship.setLength(length);
		 
		//} 
		ownGrid.addShip(ship); } }
	
		
}
