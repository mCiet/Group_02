package cards;

import bookshelf.*;
import tiles.*;



public class Card_common {
	
	Tiles [][] shelf = new Tiles[6][5];

	public Card_common(Tiles[][] shelf) { //passo da main la matrice di tiles al posto che direttamente la shelf
		this.shelf = shelf;
	}
	
	public boolean checkCommonGoals(int nGoals) {
		boolean verifica=false;
		switch (nGoals) {
			// controllo in base al numero di obbiettivo comune se è stato raggiunto 
			//--> ritorna true e false se è stato raggiunto o no
			case 1: 
				int cont=0;
				for (int k=0; k<5; k++) { // il ciclo controlla una riga e colonna in meno perchè sarebbe inutile riga 5 e colonna 4 già controllate con riga e colonan precendente
					for(int i=0; i<4; i++) {//
						if((this.shelf[k][i]).equals(this.shelf[k][i+1]) && (this.shelf[k][i+1]).equals(this.shelf[k+1][i]) && (this.shelf[k+1][i]).equals(this.shelf[k+1][i+1]) ) {
							cont++;
						}
					}
					if(cont==2)
						verifica= true;
				}
				return verifica; // se nessun ciclo trova la corrispondenza con l'obbiettivo comune restituisce false

			case 2:
				int i=0,k=0;
				int cont1=0;
				boolean uguali=false;
				while(i<5 && cont1 <2) {
					while(k<5 && !uguali) {
						if((this.shelf[i][k]).equals(this.shelf[i][k+1]) ) {
							uguali=true;
						}
						k++;
					}
					i++;
					if(!uguali) {
						cont1++;
					}
				}
				if(cont1==2) {
					verifica= true;
				}
				return verifica;
				
			case 3:
				// da chiarire cosa chiede l'obbiettivo 
				
				
			case 4:	
				// da chiarire cosa chieda nello specifico l'obbiettivo
				
				
			case 5: 
				int contTipi=1;
				int contCol=0;
				boolean cNotFull=false;
				for(int k4=0; k4 <5; k4++) {
					contTipi=1;
					for(int i4=0; i4<6;i4++) {
						if((this.shelf[i4][k4]).isEmpty()){
							cNotFull=true;
						}
					}
					if(!cNotFull) {
						for(int j4=0; j4<5;j4++) {
							if((this.shelf[j4][k4]).equals(this.shelf[j4+1][k4])){
								contTipi++;								
							}
						}
						if(contTipi<=3)
							contCol++;
					}
					if(contCol==3) {
						verifica= true;
					}
				}
				return verifica;
			case 6:
				int contC=0;
				boolean cNotFull2=false;
				boolean allDiff=true;
				for(int k5=0; k5 <5; k5++) {
					contTipi=1;
					for(int i5=0; i5<6;i5++) {
						if((this.shelf[i5][k5]).isEmpty()){
							cNotFull=true;
						}
					}
					if(!cNotFull2) {
						int j5=0;
						while( j5<5 && allDiff) {
							if((this.shelf[j5][k5]).equals(this.shelf[j5+1][k5])){
								allDiff=false;								
							}
							j5++;
						}
						if(allDiff)
							contC++;
					}
					
				}
				if(contC>=2) {
						verifica= true;
					}
				return verifica;
				
		}

		return verifica;
	}
	
	
	
}
