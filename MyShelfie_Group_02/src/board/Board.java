package board;

import tiles.ObjectEnum;
import tiles.Tiles;

public class Board {
	
	Tiles [][] table = new Tiles[9][9];
	
	
	public Board(int nGiocatori) {
		
		
		// Riempimento riga 0 della matrice
		table[0][0] = new Tiles (ObjectEnum.NULL);	
		table[0][1] = new Tiles (ObjectEnum.NULL);
		table[0][2] = new Tiles (ObjectEnum.NULL);
		if (nGiocatori ==3) {
		table[0][3] = new Tiles (ObjectEnum.EMPTY);
		table[0][4] = new Tiles (ObjectEnum.NULL);
		}
		else{
			table[0][3] = new Tiles (ObjectEnum.NULL);
			table[0][4] = new Tiles (ObjectEnum.NULL);
		}
		if (nGiocatori ==4) {
			table[0][3] = new Tiles (ObjectEnum.EMPTY);
			table[0][4] = new Tiles (ObjectEnum.EMPTY);
		}
		table[0][5] = new Tiles (ObjectEnum.NULL);
		table[0][6] = new Tiles (ObjectEnum.NULL);
		table[0][7] = new Tiles (ObjectEnum.NULL);
		table[0][8] = new Tiles (ObjectEnum.NULL);
		
		// Riempimento riga 1 della matrice
		
		table[1][0] = new Tiles (ObjectEnum.NULL);	
		table[1][1] = new Tiles (ObjectEnum.NULL);
		table[1][2] = new Tiles (ObjectEnum.NULL);		
		table[1][3] = new Tiles (ObjectEnum.EMPTY);
		table[1][4] = new Tiles (ObjectEnum.EMPTY);
		if (nGiocatori ==4) {
		table[1][5] = new Tiles (ObjectEnum.EMPTY);
		}
		else {
		table[1][5] = new Tiles (ObjectEnum.NULL);	
		}
		table[1][6] = new Tiles (ObjectEnum.NULL);
		table[1][7] = new Tiles (ObjectEnum.NULL);
		table[1][8] = new Tiles (ObjectEnum.NULL);
		
	}
	
	public void boardFill(Bag borsa) {
		for (int k=0; k<9; k++) {
			for (int j=0; j<9; j++) {
				if(table[k][j].gObject()==ObjectEnum.EMPTY) {
					//table[k][j]=bag.RandGeneration();
				}
			}
		}
	}
		
		
	}

	



