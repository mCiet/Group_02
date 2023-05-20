package cards;

import bookshelf.*;
import tiles.*;



public class Card_common {
	
	//private Tiles[][] shelf;
	Tiles [][] shelf = new Tiles[6][5];

	public Card_common(Tiles[][] shelf) { //passo da main la matrice di tiles al posto che direttamente la shelf
		this.shelf = shelf;
	}
	
	public boolean checkCommonGoals(int nGoals) {
		
		switch (nGoals) {
			// controllo in base al numero di obbiettivo comune se è stato raggiunto 
			//--> ritorna true e false se è stato raggiunto o no
			case 1: 
				for (int k=0; k<6; k++) {
					for(int i=0; i<5; i++) {
						
						//if(this.shelf[k][i].equals)
					}
					
				}
			
			case 2:
				
			case 3:
				
		}
		return false;
		
	}
	
	
	
}
