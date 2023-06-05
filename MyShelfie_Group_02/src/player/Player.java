package player;

import bookshelf.Shelf;
import tiles.*;
import cards.*;

public class Player {
	
	private static int ID; // INCREMENTO AUTOMATICO
	public static void setID(int iD) {
		ID = iD;
	}

	private int c =0;
	private Shelf shelf;
	private personal_goals personalCard;
	
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
