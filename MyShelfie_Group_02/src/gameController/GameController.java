package gameController;

import javax.swing.text.View;
import grafic.*;
import board.*;
import tiles.*;


public class GameController {
	Board board;
	Bag bag;
	FrontEnd view;
	
	
	public GameController(FrontEnd frame) {
		view = frame;
	}

	public void startGame(int nGio) {
		
		board = new Board(nGio);
		bag = new Bag();
		
		board.boardFill(bag);
		view.UpdateBoardView(board.getTable());
		
		
	}
	
}
