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
				int i1=0,k1=0;
				int cont1=0;
				boolean uguali1=false;
				while(i1<5 && cont1 <2) {
					while(k1<5 && !uguali1) {
						if((this.shelf[k1][i1]).equals(this.shelf[k1+1][i1]) ) {
							uguali1=true;
						}
						k1++;
					}
					i1++;
					if(!uguali1) {
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
				int contTipi4=1;
				int contCol=0;
				boolean cNotFull=false;
				for(int k4=0; k4 <5; k4++) {
					contTipi4=1;
					for(int i4=0; i4<6;i4++) {
						if((this.shelf[i4][k4]).isEmpty()){
							cNotFull=true;
						}
					}
					if(!cNotFull) {
						for(int j4=0; j4<5;j4++) {
							if((this.shelf[j4][k4]).equals(this.shelf[j4+1][k4])){
								contTipi4++;								
							}
						}
						if(contTipi4<=3)
							contCol++;
					}
					if(contCol==3) {
						verifica= true;
					}
				}
				return verifica;
			case 6:
				int i5=0,k5=0;
				int cont5=0;
				boolean uguali5=false;
				while(i5<6 && cont5 <2) {
					while(k5<4 && !uguali5) {
						if((this.shelf[i5][k5]).equals(this.shelf[i5][k5+1]) ) {
							uguali5=true;
						}
						k5++;
					}
					i5++;
					if(!uguali5) {
						cont5++;
					}
				}
				if(cont5==2) {
					verifica= true;
				}
				return verifica;
			
			case 7:
				int contTipi6=1;
				int contRig=0;
				boolean rNotFull=false;
				for(int k6=0; k6 <6; k6++) {
					contTipi6=1;
					for(int i6=0; i6<5;i6++) {
						if((this.shelf[k6][i6]).isEmpty()){
							rNotFull=true;
						}
					}
					if(!rNotFull) {
						for(int j6=0; j6<4;j6++) {
							if((this.shelf[k6][j6]).equals(this.shelf[k6][j6+1])){
								contTipi6++;								
							}
						}
						if(contTipi6<=3)
							contRig++;
					}
				}
				if(contRig==4) {
					verifica= true;
				}
				
				return verifica;
			
			case 8:
				if((this.shelf[0][0]).equals(this.shelf[0][4]) && (this.shelf[0][4]).equals(this.shelf[5][4]) && (this.shelf[5][4]).equals(this.shelf[5][0])) {
					verifica=true;
				}
				return verifica;
				
			case 9:
				ObjectEnum colour;
				int pink=0,yellow=0,blue=0,light_blue=0,green=0,white=0;
				
				for (int k=0; k<6; k++) { 
					for(int i=0; i<5; i++) {
						colour=this.shelf[k][i].gObject();
						switch(colour) {
						case PINK:
							pink++;
						case GREEN:
							green++;
						case BLUE:
							blue++;
						case WHITE:
							white++;
						case YELLOW:
							yellow++;
						case LIGHT_BLUE:
							light_blue++;
						case EMPTY:	
						}
					}
				}
				if(pink>=8) {
					verifica= true;	
				}
				else if(green>=8) {
					verifica=true;
				}
				else if(blue>=8) {
					verifica=true;
				}
				else if(light_blue>=8) {
					verifica=true;
				}
				else if(white>=8) {
					verifica=true;
				}
				else if(yellow>=8) {
					verifica=true;
				}
				return verifica;
				
			case 10:
				
		}

		return verifica;
	}
	
	
	
}
