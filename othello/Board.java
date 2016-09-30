package othello;

import java.util.Arrays;

public class Board {
	
	private char[][] gameBoard;
	static private int X = 8;
	static private int Y = 8;
	
	public Board(){
		//X = x;
		//Y = y;
		gameBoard = new char[X][Y];
		clearBoard();
	}
	
	public void printBoard(){
		for(int i = 0; i < X; i++){
			System.out.println(Arrays.toString(gameBoard[i]));
		}
	}
	
	public void set(int x, int y, char player){
		gameBoard[x][y] = player;
	}
	
	public boolean inBounds(int x, int y){
		if(x >= 0 && x < X && y >= 0 && y < Y){
			return true;
		}
		else return false;
	}
	
	private void clearBoard(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if((i == 3 && j == 3) || (i == 4 && j == 4)){
					gameBoard[i][j] = 'W';
				}
				else if((i == 4 && j == 3) || (i == 3 && j == 4)){
					gameBoard[i][j] = 'B';
				}
				else{
					//gameBoard[i][j] = 'O'; //Not sure if I like the array better empty or filled with O's
				}
			}
			
		}
	}

}
