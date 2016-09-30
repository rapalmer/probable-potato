package othello;

public class Game {
	
	private Board gameBoard;
	
	private boolean gameOver;
	
	public Game(){
		gameBoard = new Board();
		gameOver = false;	
	}
	
	public void makeMove(int x, int y, char player){
		if(gameBoard.inBounds(x, y)){
			gameBoard.set(x, y, player);
		}
		else{
			System.out.println("Woah Buddy! That's an illegal move off the board. Please try again.");
			return;
		}
	}
	
	public boolean isOver(){
		return gameOver;
	}
	
	public void showBoard(){
		gameBoard.printBoard();
	}

	public boolean isLegalMove(int moveX, int moveY, char player) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
