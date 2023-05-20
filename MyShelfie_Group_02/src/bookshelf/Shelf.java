package bookshelf;

import tiles.*;

public class Shelf {

	private Tiles[][] shelf;// oppure così con relativo costruttore
	
	public Shelf() {
		shelf = new Tiles[6][5];
		
	}
	
	
	
	public Tiles[][] getShelf() {
		return shelf;
	}


	public void addTiles( int c, Tiles tiles) {
		int CelleLibere=0;
		
		for (int i=0;i< 6;i++) {
			if(this.shelf[i][c]== null) { //da testare se funziona correttamente
				this.shelf[i][c] = tiles;
			}
		}
	}
	
	//funzione per controllare se c'è abbastanza posto nella colonna scelta
	public boolean IsFull(int j,int nTessere) {
		int CelleLibere=0;
		
		for (int i=0;i< 6;i++) {
			if(this.shelf[i][j]== null) { //da testare se funziona correttamente
				CelleLibere++;
			}
		}
		if(CelleLibere>=nTessere){
			return true; //significa che c'è abbastanza spazio
		}else {
			return false;
		}
	}
	
	

}
