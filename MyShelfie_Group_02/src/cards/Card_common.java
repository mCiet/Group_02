package cards;

import bookshelf.*;
import tiles.*;



public class Card_common {

	/*Tiles [][] shelf = new Tiles[6][5];

	public Card_common(Tiles[][] shelf) { //passo da main la matrice di tiles al posto che direttamente la shelf
		this.shelf = shelf;
	}*/
	


	public static boolean checkCommonGoals(int nGoals, Shelf ShelfGio) {
		boolean verifica=false;
		Tiles [][] shelf;
		shelf=ShelfGio.getShelf();
		
		boolean pink=false,yellow=false,blue=false,light_blue=false,green=false,white=false;
		switch (nGoals) {
		// controllo in base al numero di obbiettivo comune se è stato raggiunto 
		//--> ritorna true e false se è stato raggiunto o no
		case 1: 
			
			int cont=0;
			for (int k=0; k<5; k++) { // il ciclo controlla una riga e colonna in meno perchè sarebbe inutile riga 5 e colonna 4 già controllate con riga e colonan precendente
				for(int i=0; i<4; i++) {//
					if((shelf[k][i]).equals(shelf[k][i+1]) && (shelf[k][i+1]).equals(shelf[k+1][i]) && (shelf[k+1][i]).equals(shelf[k+1][i+1]) ) {
						cont++;
					}
				}
				if(cont==2)
					verifica= true;
			}
			break; // se nessun ciclo trova la corrispondenza con l'obbiettivo comune restituisce false

		case 2:
			
			ObjectEnum colour1;
			int contTipi1;
			int i1=0,k1=0;
			int cont1=0;
			int contCol1=0;
			boolean uguali1=false;
			while(i1<5 && cont1 <2) {
				pink=false;
				yellow=false;
				blue=false;
				light_blue=false;
				green=false;
				white=false;
				contTipi1=0;
				while(k1<6) {
					colour1=shelf[k1][i1].gObject();
					switch(colour1) {
					case PINK:
						if(!pink){
							pink=true;
							contTipi1++;
						}else {
							break;
						}
					case GREEN:
						if(!green){
							pink=true;
							contTipi1++;
						}else {
							break;
						}
					case BLUE:
						if(!blue){
							pink=true;
							contTipi1++;
						}else {
							break;
						}
					case WHITE:
						if(!white){
							pink=true;
							contTipi1++;
						}else {
							break;
						}
					case YELLOW:
						if(!yellow){
							pink=true;
							contTipi1++;
						}else {
							break;
						}
					case LIGHT_BLUE:
						if(!pink){
							pink=true;
							contTipi1++;
						}else {
							break;
						}
					case EMPTY:
						break;
					}	

					k1++;
				}
				i1++;
				if(contTipi1==6) {
					cont1++;
				}
			}
			if(cont1==2) {
				verifica= true;
			}
			break;

		case 3:
			
			// non implementato

		case 4:	
			// non implementato


		case 5: 
			
			
			ObjectEnum colour4;
			int contTipi4=0;
			int contCol=0;
			boolean cNotFull=false;
			for(int k4=0; k4 <5; k4++) {
				contTipi4=1;
				cNotFull=false;
				for(int i4=0; i4<6;i4++) {
					if((shelf[i4][k4]).isEmpty()){
						cNotFull=true;
					}
				}
				if(!cNotFull) {
					pink=false;
					yellow=false;
					blue=false;
					light_blue=false;
					green=false;
					white=false;
					for(int j4=0; j4<6;j4++) {


						colour4=shelf[j4][k4].gObject();
						switch(colour4) {
						case PINK:
							if(!pink){
								pink=true;
								contTipi4++;
								break;
							}		
						case GREEN:
							if(!green){
								green=true;
								contTipi4++;
								break;
							}
						case BLUE:
							if(!blue){
								blue=true;
								contTipi4++;
								break;
							}
						case WHITE:
							if(!white){
								white=true;
								contTipi4++;
								break;
							}
						case YELLOW:
							if(!yellow){
								yellow=true;
								contTipi4++;
								break;
							}
						case LIGHT_BLUE:
							if(!pink){
								light_blue=true;
								contTipi4++;
								break;
							}
						}		
					}
					if(contTipi4<=3)
						contCol++;
				}
				if(contCol>=3) {
					verifica= true;
				}
			}
			break;
		case 6:
			
			
			ObjectEnum colour5;
			int contTipi5;
			int i5=0,k5=0;
			int cont5=0;
			while(i5<6 && cont5 <2) {
				pink=false;
				yellow=false;
				blue=false;
				light_blue=false;
				green=false;
				white=false;
				contTipi5=0;
				while(k5<5 && cont5<2) {
					colour5=shelf[i5][k5].gObject();
					switch(colour5) {
					case PINK:
						if(!pink){
							pink=true;
							contTipi5++;
						}else {
							break;
						}
					case GREEN:
						if(!green){
							pink=true;
							contTipi5++;
						}else {
							break;
						}
					case BLUE:
						if(!blue){
							pink=true;
							contTipi5++;
						}else {
							break;
						}
					case WHITE:
						if(!white){
							pink=true;
							contTipi5++;
						}else {
							break;
						}
					case YELLOW:
						if(!yellow){
							pink=true;
							contTipi5++;
						}else {
							break;
						}
					case LIGHT_BLUE:
						if(!pink){
							pink=true;
							contTipi5++;
						}else {
							break;
						}
					case EMPTY:
						break;
					}	
					k5++;
				}
				if(contTipi5==5) {
					cont5++;
				}
				i5++;

			}
			if(cont5==2) {
				verifica= true;
			}
			break;

		case 7: 
			
			int contTipi6=0;
			int contRig=0;
			boolean rNotFull=false;
			ObjectEnum colour6;
			pink=false;
			yellow=false;
			blue=false;
			light_blue=false;
			green=false;
			white=false;
			for(int k6=0; k6 <6; k6++) {
				rNotFull=false;
				contTipi6=0;
				for(int i6=0; i6<5;i6++) {
					if((shelf[k6][i6]).isEmpty()){
						rNotFull=true;
					}
				}
				if(!rNotFull) {
					for(int j6=0; j6<5;j6++) {
						colour6=shelf[k6][j6].gObject();
						switch(colour6) {
						case PINK:
							if(!pink){
								pink=true;
								contTipi6++;
								break;
							}		
						case GREEN:
							if(!green){
								pink=true;
								contTipi6++;
								break;
							}
						case BLUE:
							if(!blue){
								pink=true;
								contTipi6++;
								break;
							}
						case WHITE:
							if(!white){
								pink=true;
								contTipi6++;
								break;
							}
						case YELLOW:
							if(!yellow){
								pink=true;
								contTipi6++;
								break;
							}
						case LIGHT_BLUE:
							if(!pink){
								pink=true;
								contTipi6++;
								break;
							}
						}						
					}
					if(contTipi6<=3)
						contRig++;
					
				}
			}
			if(contRig>=4) {
				verifica= true;
			}

			break;

		case 8:
			
			if((shelf[0][0]).equals(shelf[0][4]) && (shelf[0][4]).equals(shelf[5][4]) && (shelf[5][4]).equals(shelf[5][0])) {
				verifica=true;
			}
			break;

		case 9:
			
			
			ObjectEnum colour;
			int pink8=0,yellow8=0,blue8=0,light_blue8=0,green8=0,white8=0;

			for (int k8=0; k8<6; k8++) { 
				for(int i8=0; i8<5; i8++) {
					colour=shelf[k8][i8].gObject();
					switch(colour) {
					case PINK:
						pink8++;
						break;
					case GREEN:
						green8++;
						break;
					case BLUE:
						blue8++;
						break;
					case WHITE:
						white8++;
						break;
					case YELLOW:
						yellow8++;
						break;
					case LIGHT_BLUE:
						light_blue8++;
						break;
					case EMPTY:	
						break;
					}
				}
			}
			if(pink8>=8) {
				verifica= true;	
			}
			else if(green8>=8) {
				verifica=true;
			}
			else if(blue8>=8) {
				verifica=true;
			}
			else if(light_blue8>=8) {
				verifica=true;
			}
			else if(white8>=8) {
				verifica=true;
			}
			else if(yellow8>=8) {
				verifica=true;
			}
			break;

		case 10:
			
			
			for (int k9=0; k9<4; k9++) { 
				for(int i9=0; i9<3; i9++) {
					if((shelf[i9][k9]).equals(shelf[i9][k9+2]) && (shelf[i9][k9+2]).equals(shelf[i9+1][k9+1]) && (shelf[i9+1][k9+1]).equals(shelf[i9+2][k9]) && (shelf[i9+2][k9]).equals(shelf[i9+2][k9+2])) {
						verifica=true;
					}
				}
				if(verifica) {
					break;
				}
			}
			break;		

		case 11:
		
			for (int k10=0; k10<2; k10++) { 
				if((shelf[k10][0]).equals(shelf[k10+1][1]) && (shelf[k10+1][1]).equals(shelf[k10+2][2]) && (shelf[k10+2][2]).equals(shelf[k10+3][3]) && (shelf[k10+3][3]).equals(shelf[k10+4][4])) {
					verifica=true;	
					break;
				}
				else if((shelf[k10][4]).equals(shelf[k10+1][3]) && (shelf[k10+1][3]).equals(shelf[k10+2][2]) && (shelf[k10+2][2]).equals(shelf[k10+3][1]) && (shelf[k10+3][1]).equals(shelf[k10+4][0])) {
					verifica=true;
					break;
				}

			}
			break;

		case 12: //non implementata
			
			/*for (int k11=0; k11<2; k11++) { 
				if( !(shelf[k11][0]).isEmpty() && !(shelf[k11+1][1]).isEmpty() && !(shelf[k11+2][2]).isEmpty() && !(shelf[k11+3][3]).isEmpty() && !(shelf[k11+4][4]).isEmpty()) {
					verifica=true;
					break;
				}
				else if( !(shelf[k11][4]).isEmpty() && !(shelf[k11+1][3]).isEmpty() && !(shelf[k11+2][2]).isEmpty() && !(shelf[k11+3][1]).isEmpty() && !(shelf[k11+4][0]).isEmpty())  {
					verifica=true;
					break;
				}

			}
			break;*/

		}

		return verifica;
	}



}
