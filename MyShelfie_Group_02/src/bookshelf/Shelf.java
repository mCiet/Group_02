package bookshelf;

import tiles.*;

public class Shelf {

	private Tiles[][] shelf;// oppure così con relativo costruttore
	
	public Shelf() {
		shelf = new Tiles[6][5];
		
	}
	
	
	
	public boolean addTiles(int i, int j, Tiles tiles) {
		if(this.shelf[i][j]== null) {
			this.shelf[i][j]= tiles;
			return true;
		}else {
			return false;
		}
		
	}
	
	
	

}
