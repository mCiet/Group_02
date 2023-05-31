package player;

import bookshelf.Shelf;
import tiles.*;

public class Player {
	
	private static int ID; // INCREMENTO AUTOMATICO
	private int c =0;
	private Shelf shelf;
	
	public Player() {
		this.ID = c++;
		this.shelf = new Shelf();
		
	}

	public Shelf getShelf() {
		return shelf;//in questo modo ritorna matridce di tiles
	}

	public static int getID() {
		return ID;
	}

	

	

	

}
