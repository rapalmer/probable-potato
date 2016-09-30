package othello;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		int moveX = 0;
		int moveY = 0;
		
		char player = 'B';
		
		Scanner in = new Scanner(System.in);
			
		Game g = new Game();
		
		while(!g.isOver()){
			g.showBoard();
			
			System.out.print("Enter an X coordinate from 0 to 7 for your move: ");
			try{
				moveX = in.nextInt();
			} catch(InputMismatchException e){
				System.out.println("That's not an integer. Please try again!");
				break;
			}
			
			System.out.print("Enter a Y coordinate from 0 to 7 for your move: ");
			try{
				moveY = in.nextInt();
			} catch(InputMismatchException e){
				System.out.println("Sorry I need an integer. Please try again!");
				in.close();
				break;
			}
			
			if(g.isLegalMove(moveX, moveY, player)){
				g.makeMove(moveX, moveY, player);
			} else {
				System.out.println("Sorry buddy that's not a legal move! Try again!");
				break;
			}
			
			
			
			System.out.println();
			System.out.println("X: "  + moveX + " Y: " + moveY);
			
			if(player == 'B'){
				player = 'W';
			} else { player = 'B'; }
		}
		
		
		in.close();
	}

}
