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
		
		// Riempimento riga 2 della matrice
		
		table[2][0] = new Tiles (ObjectEnum.NULL);	
		table[2][1] = new Tiles (ObjectEnum.NULL);
		
		if(nGiocatori >=3) {
			table[2][2] = new Tiles (ObjectEnum.EMPTY);
			table[2][6] = new Tiles (ObjectEnum.EMPTY);
		}else {
			table[2][2] = new Tiles (ObjectEnum.NULL);
			table[2][6] = new Tiles (ObjectEnum.NULL);
		}
		
		table[2][3] = new Tiles (ObjectEnum.EMPTY);
		table[2][4] = new Tiles (ObjectEnum.EMPTY);
		table[2][5] = new Tiles (ObjectEnum.EMPTY);
		
		table[2][7] = new Tiles (ObjectEnum.NULL);
		table[2][8] = new Tiles (ObjectEnum.NULL);
		
		// Riempimento riga 3 della matrice
		
		table[3][0] = new Tiles (ObjectEnum.NULL);	
		
		if(nGiocatori ==4) {
			table[3][1] = new Tiles (ObjectEnum.EMPTY);
			table[3][8] = new Tiles (ObjectEnum.EMPTY);
		}else {
			table[3][1] = new Tiles (ObjectEnum.NULL);
			table[3][8] = new Tiles (ObjectEnum.NULL);

		}
		if(nGiocatori ==3) {
			table[3][8] = new Tiles (ObjectEnum.EMPTY);
			
		}
		table[3][2] = new Tiles (ObjectEnum.EMPTY);
		table[3][3] = new Tiles (ObjectEnum.EMPTY);
		table[3][4] = new Tiles (ObjectEnum.EMPTY);
		table[3][5] = new Tiles (ObjectEnum.EMPTY);
		table[3][6] = new Tiles (ObjectEnum.EMPTY);
		table[3][7] = new Tiles (ObjectEnum.EMPTY);
		
		
		//Riempimento riga 4 della matrice
		
		table[4][1] = new Tiles (ObjectEnum.EMPTY);
		table[4][2] = new Tiles (ObjectEnum.EMPTY);	
		table[4][3] = new Tiles (ObjectEnum.EMPTY);
		table[4][4] = new Tiles (ObjectEnum.EMPTY);
		table[4][5] = new Tiles (ObjectEnum.EMPTY);
		table[4][6] = new Tiles (ObjectEnum.EMPTY);
		table[4][7] = new Tiles (ObjectEnum.EMPTY);
		if(nGiocatori ==4) {
			table[4][0] = new Tiles (ObjectEnum.EMPTY);	
			table[4][8] = new Tiles (ObjectEnum.EMPTY);
			
		}else {
			table[4][0] = new Tiles (ObjectEnum.NULL);	
			table[4][8] = new Tiles (ObjectEnum.NULL);
		}
		
		//Riempimento riga 5 della matrice
		
		if(nGiocatori ==3) {
			table[5][0] = new Tiles (ObjectEnum.EMPTY);
		}else {
			table[5][0] = new Tiles (ObjectEnum.NULL);
			table[5][7] = new Tiles (ObjectEnum.NULL);
		}
		if(nGiocatori ==4) {
			table[5][0] = new Tiles (ObjectEnum.EMPTY);
			table[5][7] = new Tiles (ObjectEnum.EMPTY);
		}
		
		table[5][1] = new Tiles (ObjectEnum.EMPTY);
		table[5][2] = new Tiles (ObjectEnum.EMPTY);	
		table[5][3] = new Tiles (ObjectEnum.EMPTY);
		table[5][4] = new Tiles (ObjectEnum.EMPTY);
		table[5][5] = new Tiles (ObjectEnum.EMPTY);
		table[5][6] = new Tiles (ObjectEnum.EMPTY);
		table[5][8] = new Tiles (ObjectEnum.NULL);
		
		//riempimento riga 6 della matrice
		
		
		table[6][0] = new Tiles (ObjectEnum.NULL);
		table[6][1] = new Tiles (ObjectEnum.NULL);
		if(nGiocatori>=3) {
			table[6][2] = new Tiles (ObjectEnum.EMPTY);	
			table[6][6] = new Tiles (ObjectEnum.EMPTY);
		}else {
			table[6][2] = new Tiles (ObjectEnum.NULL);	
			table[6][6] = new Tiles (ObjectEnum.NULL);
		}
		
		table[6][3] = new Tiles (ObjectEnum.EMPTY);
		table[6][4] = new Tiles (ObjectEnum.EMPTY);
		table[6][5] = new Tiles (ObjectEnum.EMPTY);
		table[6][7] = new Tiles (ObjectEnum.NULL);
		table[6][8] = new Tiles (ObjectEnum.NULL);
		
		//riempimento riga 7 della matrice
		table[7][0] = new Tiles (ObjectEnum.NULL);
		table[7][1] = new Tiles (ObjectEnum.NULL);
		table[7][2] = new Tiles (ObjectEnum.NULL);	
		if(nGiocatori==4) {
			table[7][3] = new Tiles (ObjectEnum.EMPTY);
		}else {
			table[7][3] = new Tiles (ObjectEnum.NULL);
		}
		
		
		table[7][4] = new Tiles (ObjectEnum.EMPTY);
		table[7][5] = new Tiles (ObjectEnum.EMPTY);
		table[7][6] = new Tiles (ObjectEnum.NULL);
		table[7][7] = new Tiles (ObjectEnum.NULL);
		table[7][8] = new Tiles (ObjectEnum.NULL);

		//riempimento riga 8 della matrice

		table[8][0] = new Tiles (ObjectEnum.NULL);	
		table[8][1] = new Tiles (ObjectEnum.NULL);
		table[8][2] = new Tiles (ObjectEnum.NULL);
		table[8][3] = new Tiles (ObjectEnum.NULL);
		
		if (nGiocatori ==3) {
			table[8][4] = new Tiles (ObjectEnum.NULL);
			table[8][5] = new Tiles (ObjectEnum.EMPTY);
		}
		else{
			table[8][4] = new Tiles (ObjectEnum.NULL);
			table[8][5] = new Tiles (ObjectEnum.NULL);
		}
		if (nGiocatori ==4) {
			table[8][4] = new Tiles (ObjectEnum.EMPTY);
			table[8][5] = new Tiles (ObjectEnum.EMPTY);
		}
		table[8][6] = new Tiles (ObjectEnum.NULL);
		table[8][7] = new Tiles (ObjectEnum.NULL);
		table[8][8] = new Tiles (ObjectEnum.NULL);
	}
	
	public Tiles[][] getTable() {
		return table;
	}

	public void boardFill(Bag borsa) {
		for (int k=0; k<9; k++) {
			for (int j=0; j<9; j++) {
				if(table[k][j].gObject()==ObjectEnum.EMPTY) {
					table[k][j]=borsa.RandGeneration();
				}
			}
		}
	}
	
	public void printBoard() {
		for (int k=0; k<9; k++) {
				System.out.println(table[k][0].gObject()+ " "+ table[k][1].gObject()+ " "+ table[k][2].gObject()+ " " + table[k][3].gObject()+ " " + table[k][4].gObject()+ " "+table[k][5].gObject()+ " "+ table[k][6].gObject()+ " "+ table[k][7].gObject()+ " "+ table[k][8].gObject()+ " ");
		}
	}
	
	public Tiles getTiles(int i, int j) {
		Tiles tiles;
		tiles = table[i][j];
		return tiles;
	}
	
	public void emptycell(int i, int j) {
		this.table[i][j].setColour(ObjectEnum.EMPTY);
		
		}
	
	public boolean refillLivingroom()	{
		boolean refill=false;
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				//controllo che non sia vuota
				if(!(this.table[i][j].gObject().equals(ObjectEnum.EMPTY))) {
					//controllo se ci sono intorno solo caselle vuote
					if((this.table[i+1][j].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i+1][j].gObject().equals(ObjectEnum.NULL)) ) {
							if((this.table[i][j+1].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i][j+1].gObject().equals(ObjectEnum.NULL))) {
								if((this.table[i][j-1].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i][j-1].gObject().equals(ObjectEnum.EMPTY))) {
									if((this.table[i-1][j].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i-1][j].gObject().equals(ObjectEnum.NULL))) {
										refill = true;//se è true significa che quella casella ha intorno solo caselle vuote
									}else {
										refill=false;
									}
								}else {
									refill=false;
								}
							}else {
								refill=false;
							}
					}else {
						refill=false;//se anche solo uno degli if è falso significa che c'è almeno un casella adiacente che non è vuota
					}
				}
			}
		}
		return refill;
	}
	
	public boolean freeSide(int i, int j) { //controllo freeside
		
		//sopra
		if((this.table[i-1][j].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i-1][j].gObject().equals(ObjectEnum.NULL))   ) { 
			return true;
		}
		
		//sotto
		if((this.table[i+1][j].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i-1][j].gObject().equals(ObjectEnum.NULL))   ) { 
			return true;
		}
		
		//destra
		if((this.table[i][j+1].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i-1][j].gObject().equals(ObjectEnum.NULL))   ) { 
			return true;
		}
		
		//sinistra
		if((this.table[i][j-1].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i-1][j].gObject().equals(ObjectEnum.NULL))   ) { 
			return true;
		}
		
		return false;
	}
	}

	



