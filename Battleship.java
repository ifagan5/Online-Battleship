package Battleship;
import java.util.Scanner;
public class Battleship {
	public static void main(String [] args) {
		Player player1 = new Player();		
		Ship s2  = player1.gets2();
		Ship s31 = player1.gets31();
		Ship s32 = player1.gets32();
		Ship s4 = player1.gets4();
		Ship s5 = player1.gets5();
		Grid ownGrid1 = player1.getOwnGrid();
		Grid guesses1 = player1.getGuesses(); 		
		Player player2 = new Player();		
		Ship s22  = player2.gets2();
		Ship s312 = player2.gets31();
		Ship s322 = player2.gets32();
		Ship s42 = player2.gets4();
		Ship s52 = player2.gets5();
		Grid ownGrid2 = player2.getOwnGrid();
		Grid guesses2 = player2.getGuesses();
		System.out.println("Welcome Player 1! It is time to pick your ships' locations!");
		System.out.println("You have one ship of length 2");
		player1.printMyShips();
		int d2 = -1; 
		Scanner input = new Scanner(System.in);
		while(!(d2 == 0) && !(d2 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d2 = input.nextInt();
				if (d2 > 1 || d2 < 0) {
					System.out.println("Invalid input! Please try again!");			}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();			} 		}
		boolean shipPlaced2 = false;
		while(shipPlaced2 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player1.printMyShips();
			int[] guess = player1.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d2 == 0) {
				 if(col +1 > 10-s2.getLength()) {
					 col = 10-s2.getLength();			 }		 }
			 else {
				 if(row+ 1 > 10-s2.getLength()) {
					 row = 10-s2.getLength();				 }			 }
			 int r = row;
			int c = col;
			for(int i = 0; i < s2.getLength(); i++) {
				if(ownGrid1.hasShip(r, c)){
					count++;			}
				else{			}
				if(d2 == 0) {
					c++;		}
				else {
					r++;			}			}
			if(count == 0) {
				player1.chooseShipLocation(s2, row, col, d2);
				shipPlaced2 = true;
				break;		}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaced2 = false;			}		}	
		System.out.println("You have two ships of length 3");
		player1.printMyShips();
		int d31 = -1; 
		while(!(d31 == 0) && !(d31 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d31 = input.nextInt();
				if (d31 > 1 || d31 < 0) {
					System.out.println("Invalid input! Please try again!");	}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();			} 		}
		boolean shipPlaceds31 = false;
		while(shipPlaceds31 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player1.printMyShips();
			int[] guess = player1.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d31 == 0) {
				 if(col +1 > 10-s31.getLength()) {
					 col = 10-s31.getLength();			 }		 }
			 else {
				 if(row+ 1 > 10-s31.getLength()) {
					 row = 10-s31.getLength();			 } }
			 int r = row;
				int c = col;
			for(int i = 0; i < s31.getLength(); i++) {
				if(ownGrid1.hasShip(r, c)){
					count++;			}
				if(d31 == 0) {
					c++;			}
				else {
					r++;				}				}
			if(count == 0) {
				player1.chooseShipLocation(s31, row, col, d31);
				shipPlaceds31 = true;			}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaceds31 = false;}}		
		player1.printMyShips();
		int d32 = -1; 
		while(!(d32 == 0) && !(d32 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d32 = input.nextInt();
				if (d32 > 1 || d32 < 0) {
					System.out.println("Invalid input! Please try again!");			}		} 
			catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();} }
		boolean shipPlaceds32 = false;
		while(shipPlaceds32 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player1.printMyShips();
			int[] guess = player1.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d32 == 0) {
				 if(col +1 > 10-s32.getLength()) {
					 col = 10-s32.getLength();			 } }
			 else {
				 if(row+ 1 > 10-s32.getLength()) {
					 row = 10-s32.getLength();				 }		 }
			 int r = row;
				int c = col;
			for(int i = 0; i < s32.getLength(); i++) {
				if(ownGrid1.hasShip(r, c)){
					count++;			}
				if(d32 == 0) {
					c++;			}
				else {
					r++;			}			}
			if(count == 0) {
				player1.chooseShipLocation(s32, row, col, d32);
				shipPlaceds32 = true;		}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaceds32 = false;}}
		player1.printMyShips();
		System.out.println("You have one ship of length 4");
		int d4 = -1; 
		while(!(d4 == 0) && !(d4 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d4 = input.nextInt();
				if (d4 > 1 || d4 < 0) {
					System.out.println("Invalid input! Please try again!");	}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();} }
		boolean shipPlaceds4 = false;
		while(shipPlaceds4 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player1.printMyShips();
			int[] guess = player1.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d4 == 0) {
				 if(col +1 > 10-s4.getLength()) {
					 col = 10-s4.getLength();	 }}
			 else {
				 if(row+ 1 > 10-s4.getLength()) {
					 row = 10-s4.getLength();	 } }
			 int r = row;
				int c = col;
			for(int i = 0; i < s4.getLength(); i++) {
				if(ownGrid1.hasShip(r, c)){
					count++;	}
				if(d4 == 0) {
					c++;	}
				else {
					r++;	}		}
			if(count == 0) {
				player1.chooseShipLocation(s4, row, col, d4);
				shipPlaceds4 = true;	}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaceds4 = false;	}	}
		player1.printMyShips();
		System.out.println("You have one ship of length 5");
		int d5 = -1; 
		while(!(d5 == 0) && !(d5 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d5 = input.nextInt();
				if (d5 > 1 || d5 < 0) {
					System.out.println("Invalid input! Please try again!");	}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();	} 	}
		boolean shipPlaceds5 = false;
		while(shipPlaceds5 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player1.printMyShips();
			int[] guess = player1.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d5 == 0) {
				 if(col +1 > 10-s5.getLength()) {
					 col = 10-s5.getLength();	 } }
			 else {
				 if(row+ 1 > 10-s5.getLength()) {
					 row = 10-s5.getLength();	 }	 }
			 int r = row;
				int c = col;
			for(int i = 0; i < s5.getLength(); i++) {
				if(ownGrid1.hasShip(r, c)){
					count++;	}
				if(d5 == 0) {
					c++;}
				else {
					r++;}		}
			if(count == 0) {
				player1.chooseShipLocation(s5, row, col, d5);
				shipPlaceds5 = true;	}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaceds5 = false;	} }
		System.out.println("Player 1, here are your ships!");
		player1.printMyShips();
		System.out.println("Player 1, when you are ready to move on please type '1'");
		int done1 = input.nextInt();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Welcome Player 2! It is time to pick your ships' locations!");
		System.out.println("You have one ship of length 2");
		player2.printMyShips();
		int d22 = -1; 
		while(!(d22 == 0) && !(d22 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d22 = input.nextInt();
				if (d22 > 1 || d22 < 0) {
					System.out.println("Invalid input! Please try again!");	}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();	} 	}
		boolean shipPlaced22 = false;
		while(shipPlaced22 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player2.printMyShips();
			int[] guess = player2.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d22 == 0) {
				 if(col +1 > 10-s22.getLength()) {
					 col = 10-s22.getLength();	 } }
			 else {
				 if(row+ 1 > 10-s22.getLength()) {
					 row = 10-s22.getLength();	 } }
			 int r = row;
			int c = col;
			for(int i = 0; i < s22.getLength(); i++) {
				if(ownGrid2.hasShip(r, c)){
					count++;}
				else{}
				if(d22 == 0) {
					c++;		}
				else {
					r++;	}}
			if(count == 0) {
				player2.chooseShipLocation(s22, row, col, d22);
				shipPlaced22 = true;
				break;}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaced22 = false;	} }
		System.out.println("You have two ships of length 3");
		player2.printMyShips();
		int d312 = -1; 
		while(!(d312 == 0) && !(d312 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d312 = input.nextInt();
				if (d312 > 1 || d312 < 0) {
					System.out.println("Invalid input! Please try again!");	}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();	} }
		boolean shipPlaced312 = false;
		while(shipPlaced312 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player2.printMyShips();
			int[] guess = player2.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d312 == 0) {
				 if(col +1 > 10-s312.getLength()) {
					 col = 10-s312.getLength();	 }	 } 
			 else {
				 if(row+ 1 > 10-s312.getLength()) {
					 row = 10-s312.getLength();	 }	 }
			 int r = row;
			int c = col;
			for(int i = 0; i < s312.getLength(); i++) {
				if(ownGrid2.hasShip(r, c)){
					count++;}		
				else{		}
				if(d312 == 0) {
					c++;}
				else {
					r++;}	}
			if(count == 0) {
				player2.chooseShipLocation(s312, row, col, d312);
				shipPlaced312 = true;
				break;	}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaced312 = false;	}}
		player2.printMyShips();
		int d322 = -1; 
		while(!(d322 == 0) && !(d322 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d322 = input.nextInt();
				if (d322 > 1 || d322 < 0) {
					System.out.println("Invalid input! Please try again!");	}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();} }
		boolean shipPlaced322 = false;
		while(shipPlaced322 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player2.printMyShips();
			int[] guess = player2.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d322 == 0) {
				 if(col +1 > 10-s322.getLength()) {
					 col = 10-s322.getLength(); } }
			 else {
				 if(row+ 1 > 10-s322.getLength()) {
					 row = 10-s322.getLength(); }}
			 int r = row;
			int c = col;
			for(int i = 0; i < s322.getLength(); i++) {
				if(ownGrid2.hasShip(r, c)){
					count++;}
				else{}
				if(d322 == 0) {
					c++;}
				else {
					r++;}}
			if(count == 0) {
				player2.chooseShipLocation(s322, row, col, d322);
				shipPlaced322 = true;
				break;}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaced312 = false;}}
		player2.printMyShips();
		System.out.println("You have one ship of length 4");
		int d42 = -1; 
		while(!(d42 == 0) && !(d42 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d42 = input.nextInt();
				if (d42 > 1 || d42 < 0) {
					System.out.println("Invalid input! Please try again!");}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();} }
		boolean shipPlaced42 = false;
		while(shipPlaced42 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player2.printMyShips();
			int[] guess = player2.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d42 == 0) {
				 if(col +1 > 10-s42.getLength()) {
					 col = 10-s42.getLength(); } }
			 else {
				 if(row+ 1 > 10-s42.getLength()) {
					 row = 10-s42.getLength();}}
			 int r = row;
			int c = col;
			for(int i = 0; i < s42.getLength(); i++) {
				if(ownGrid2.hasShip(r, c)){
					count++;}
				else{}
				if(d42 == 0) {
					c++;}
				else {
					r++;}}
			if(count == 0) {
				player2.chooseShipLocation(s42, row, col, d42);
				shipPlaced42 = true;
				break;}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaced42 = false;}}
		player2.printMyShips();
		System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
		int d52 = -1; 
		while(!(d52 == 0) && !(d52 == 1)) {
			try {
				System.out.println("Would you like this ship to be horizontal (0) or vertical (1)?");
				d52 = input.nextInt();
				if (d52 > 1 || d52 < 0) {
					System.out.println("Invalid input! Please try again!");}
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again!");
				input.nextLine();} }
		boolean shipPlaced52 = false;
		while(shipPlaced52 == false) {
			System.out.println("The square you choose will be the leftmost/topmost square this ship occupies.");
			player2.printMyShips();
			int[] guess = player2.askForGuess();
			int row = guess[0];
			int col = guess[1];
			int count = 0;
			 if(d52 == 0) {
				 if(col +1 > 10-s52.getLength()) {
					 col = 10-s52.getLength(); } } 
			 else {
				 if(row+ 1 > 10-s52.getLength()) {
					 row = 10-s52.getLength(); } }
			 int r = row;
			int c = col;
			for(int i = 0; i < s52.getLength(); i++) {
				if(ownGrid2.hasShip(r, c)){
					count++;}
				else{	}
				if(d52 == 0) {
					c++;}
				else {
					r++;}}
			if(count == 0) {
				player2.chooseShipLocation(s52, row, col, d52);
				shipPlaced52 = true;
				break;}
			else {
				System.out.println("It looks like that location alrady has a ship!");
				System.out.println("Please choose again!");
				shipPlaced52 = false;}}
		System.out.println("Player 2, here are your ships!");
		player2.printMyShips();
		System.out.println("Player 2, when you are ready to move on please type '1'");
		int done2 = input.nextInt();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Player 2 has placed their ships");
		boolean won = false;
		while(!won) {
			boolean guess1 = false;
			boolean guess2 = false;
			while(!guess1) {
				System.out.println("Welcome Player 1! When you are ready to guess plase type '1'");
				int in = input.nextInt();
				System.out.println("Player 1's ships:");
				player1.printMyShips();
				System.out.println("Player 1's guesses:");
				player1.printMyGuesses();
				int[] guess = player1.askForGuess();
				int row = guess[0];
				int col = guess[1];
				if(guesses1.alreadyGuessed(row, col)) {
					System.out.println("It looks like that location has alrady been guessed.");
					System.out.println("Please try again!");}
				else if(ownGrid2.hasShip(row, col)) {
					System.out.println("That was a HIT!");
					guesses1.markHit(row,col);
					int count2 = 0;
					for(int rows = 0; rows < 10; rows++) {
						for (int cols = 0; cols < 10; cols++) {
							if(guesses1.getStatus(rows, cols) == 1) {
								count2++;}}}
					if(count2 == 17) {
						won = true;}
					guess1 = true;}
				else {
					System.out.println("That was a MISS!");
					guesses1.markMiss(row,col);
					guess1 = true;}	}
			System.out.println("Player 1's ships:");
			player1.printMyShips();
			System.out.println("Player 1's guesses:");
			player1.printMyGuesses();
			System.out.println("Player 1, when you are ready to move on please type '1'");
			int inn = input.nextInt();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			while(!guess2) {
				System.out.println("Welcome Player 2! When you are ready to guess plase type '1'");
				int in = input.nextInt();
				System.out.println("Player 2's ships:");
				player2.printMyShips();
				System.out.println("Player 2's guesses:");
				player2.printMyGuesses();
				int[] guess = player1.askForGuess();
				int row = guess[0];
				int col = guess[1];
				if(guesses2.alreadyGuessed(row, col)) {
					System.out.println("It looks like that location has alrady been guessed.");
					System.out.println("Please try again!");}
				else if(ownGrid1.hasShip(row, col)) {
					System.out.println("That was a HIT!");
					guesses2.markHit(row,col);
					int count2 = 0;
					for(int rows = 0; rows < 10; rows++) {
						for (int cols = 0; cols < 10; cols++) {
							if(guesses2.getStatus(rows, cols) == 1) {
								count2++;}}}
					if(count2 == 17) {
						won = true;}
					guess2 = true;}
				else {
					System.out.println("That was a MISS!");
					guesses2.markMiss(row,col);
					guess2 = true;}}
			System.out.println("Player 2's ships:");
			player2.printMyShips();
			System.out.println("Player 2's guesses:");
			player2.printMyGuesses();
			System.out.println("Player 2, when you are ready to move on please type '1'");
			int inn2 = input.nextInt();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");}
		int count2 = 0;
		for(int rows = 0; rows < 10; rows++) {
			for (int cols = 0; cols < 10; cols++) {
				if(guesses2.getStatus(rows, cols) == 1) {
					count2++;}}}
		if(count2 == 17) {
			System.out.println("CONGRATULATIONS PLAYER 2!");
			System.out.println("YOU WON THE GAME!");}
		else {
			System.out.println("CONGRATULATIONS PLAYER 1!");
			System.out.println("YOU WON THE GAME!");
		}}	}