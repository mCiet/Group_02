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
			table[5][7] = new Tiles (ObjectEnum.NULL);
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
		String l0="",l1="",l2="",l3="",l4="",l5="",l6="",l7="",l8="";
		ObjectEnum col;
		System.out.println("     " + "  A  "  + "  B  "  + "  C  " + "  D  " + "  E  " + "  F  " + "  G  " + "  H  " + "  I  ");
		for (int k=0; k<9; k++) {
			for(int i=0;i<9;i++) {


				col=(table[k][i].gObject());
				String let="";
				switch(col){
				case PINK:
					let="  P  ";
					break;
				case GREEN:
					let="  G  ";
					break;
				case BLUE:
					let="  B  ";
					break;
				case WHITE:
					let="  W  ";
					break;
				case YELLOW:
					let="  Y  ";
					break;
				case LIGHT_BLUE:
					let="  L  ";
					break;
				case EMPTY:
					let="     ";
					break;
				case NULL:
					let="     ";
					break;
				}	
				switch(i){
				case 0:
					l0=let;
					break;
				case 1:
					l1=let;
					break;
				case 2:
					l2=let;
					break;
				case 3:
					l3=let;
					break;
				case 4:
					l4=let;
					break;
				case 5:
					l5=let;
					break;
				case 6:
					l6=let;
					break;
				case 7:
					l7=let;
					break;
				case 8:
					l8=let;
					break;

				}
			}

			System.out.println(k + "     " +l0+l1+l2+l3+l4+l5+l6+l7+l8);
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

		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				//controllo che non sia vuota
				if(!((this.table[i][j].gObject().equals(ObjectEnum.EMPTY))|| (this.table[i][j].gObject().equals(ObjectEnum.NULL)))) {
					//controllo se ci sono intorno solo caselle vuote
					//sotto
					if(i!=8) {
						if(!((this.table[i+1][j].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i+1][j].gObject().equals(ObjectEnum.NULL)))) {
							return false;
						}
					}
					
					//sopra
					if(i!=0) {
						if(!((this.table[i-1][j].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i-1][j].gObject().equals(ObjectEnum.NULL)))) {
							return false;
						}
					}
					
					//destra
					if(j!=8) {
						if(!((this.table[i][j+1].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i][j+1].gObject().equals(ObjectEnum.NULL)))) {
							return false;
						}
					}
					
					//sinistra
					if(j!=0) {
						if(!((this.table[i][j-1].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i][j-1].gObject().equals(ObjectEnum.NULL)))) {
							return false;
						}
					}
					
				}
			}
		}
				
		return true;
	}

	public boolean freeSide(int i, int j) { //controllo freeside

		if(i!=0) {
			//sopra
			if((this.table[i-1][j].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i-1][j].gObject().equals(ObjectEnum.NULL))   ) { 
				return true;
			}
		}
		
		if(i!=8) {
			//sotto
			if((this.table[i+1][j].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i+1][j].gObject().equals(ObjectEnum.NULL))   ) { 
				return true;
			}
		}
		
		if(j!=8) {
			//destra
			if((this.table[i][j+1].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i][j+1].gObject().equals(ObjectEnum.NULL))   ) { 
				return true;
			}
		}
		
		if(j!=0) {
			//sinistra
			if((this.table[i][j-1].gObject().equals(ObjectEnum.EMPTY)) || (this.table[i][j-1].gObject().equals(ObjectEnum.NULL))   ) { 
				return true;
			}
		}

		return false;
	}

	public boolean accessible(int j, int i) {

		if ((this.table[j][i].gObject().equals(ObjectEnum.EMPTY)) || (this.table[j][i].gObject().equals(ObjectEnum.NULL))){
			return false;
		}
		return true;
	}
}





