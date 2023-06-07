package bookshelf;

import tiles.*;

public class Shelf {

	private Tiles[][] shelf;// oppure così con relativo costruttore
	
	public Shelf() {
		shelf = new Tiles[6][5];
		
		for(int i =0;i<6;i++) {
			for (int j =0; j<5;j++) {
				shelf[i][j] = new Tiles();
			}
		}
	}
	
	
	public Tiles[][] getShelf() {
		return shelf;
	}


	public void addTiles( int c, Tiles tiles) {
		int i=5;
		boolean trovato=false;
		do {
			if(this.shelf[i][c].gObject()== ObjectEnum.EMPTY) { //da testare se funziona correttamente
				trovato =true;
			}else {
			i--;	
			}
			
		}while(!trovato && i<0);
		
		this.shelf[i][c].setColour(tiles.gObject());
		
	}
	
	//controllo se qualcuno ha concluso la shelf
	
	public boolean Isfull() {
		
		for(int i =0;i<6;i++) {
			for (int j =0; j<5;j++) {
				if(this.shelf[i][j].gObject()== ObjectEnum.EMPTY) { 
					return false;
				}
			}
		}
		return true;
	}
	
	//funzione per controllare se c'è abbastanza posto nella colonna scelta
	public boolean IsFullCol(int j,int nTessere) {
		int CelleLibere=0;
		
		for (int i=0;i< 5;i++) {
			if(this.shelf[i][j].gObject().equals(ObjectEnum.EMPTY)) { //da testare se funziona correttamente
				CelleLibere++;
			}
		}
		if(CelleLibere>=nTessere){
			return false; //significa che c'è abbastanza spazio
		}else {
			return true;
		}
	}
	
	public void printShelf() {
		for (int k=0; k<6; k++) {
			System.out.println(shelf[k][0].gObject()+ " "+ shelf[k][1].gObject()+ " "+ shelf[k][2].gObject()+ " " + shelf[k][3].gObject()+ " " + shelf[k][4].gObject());
		}
	}

}
