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
		boolean pink=false,yellow=false,blue=false,light_blue=false,green=false,white=false;
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
					colour1=this.shelf[k1][i1].gObject();
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
			// da chiarire cosa chiede l'obbiettivo 


		case 4:	
			// da chiarire cosa chieda nello specifico l'obbiettivo


		case 5: 
			ObjectEnum colour4;
			int contTipi4=0;
			int contCol=0;
			boolean cNotFull=false;
			for(int k4=0; k4 <5; k4++) {
				contTipi4=1;
				cNotFull=false;
				for(int i4=0; i4<6;i4++) {
					if((this.shelf[i4][k4]).isEmpty()){
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


						colour4=this.shelf[j4][k4].gObject();
						switch(colour4) {
						case PINK:
							if(!pink){
								pink=true;
								contTipi4++;
							}		
						case GREEN:
							if(!green){
								green=true;
								contTipi4++;
							}
						case BLUE:
							if(!blue){
								blue=true;
								contTipi4++;
							}
						case WHITE:
							if(!white){
								white=true;
								contTipi4++;
							}
						case YELLOW:
							if(!yellow){
								yellow=true;
								contTipi4++;
							}
						case LIGHT_BLUE:
							if(!pink){
								light_blue=true;
								contTipi4++;
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
					colour5=this.shelf[i5][k5].gObject();
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
					if((this.shelf[k6][i6]).isEmpty()){
						rNotFull=true;
					}
				}
				if(!rNotFull) {
					for(int j6=0; j6<5;j6++) {
						colour6=this.shelf[k6][j6].gObject();
						switch(colour6) {
						case PINK:
							if(!pink){
								pink=true;
								contTipi6++;
							}		
						case GREEN:
							if(!green){
								pink=true;
								contTipi6++;
							}
						case BLUE:
							if(!blue){
								pink=true;
								contTipi6++;
							}
						case WHITE:
							if(!white){
								pink=true;
								contTipi6++;
							}
						case YELLOW:
							if(!yellow){
								pink=true;
								contTipi6++;
							}
						case LIGHT_BLUE:
							if(!pink){
								pink=true;
								contTipi6++;
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
			if((this.shelf[0][0]).equals(this.shelf[0][4]) && (this.shelf[0][4]).equals(this.shelf[5][4]) && (this.shelf[5][4]).equals(this.shelf[5][0])) {
				verifica=true;
			}
			break;

		case 9:
			ObjectEnum colour;
			int pink8=0,yellow8=0,blue8=0,light_blue8=0,green8=0,white8=0;

			for (int k8=0; k8<6; k8++) { 
				for(int i8=0; i8<5; i8++) {
					colour=this.shelf[k8][i8].gObject();
					switch(colour) {
					case PINK:
						pink8++;
					case GREEN:
						green8++;
					case BLUE:
						blue8++;
					case WHITE:
						white8++;
					case YELLOW:
						yellow8++;
					case LIGHT_BLUE:
						light_blue8++;
					case EMPTY:	
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
					if((this.shelf[i9][k9]).equals(this.shelf[i9][k9+2]) && (this.shelf[i9][k9+2]).equals(this.shelf[i9+1][k9+1]) && (this.shelf[i9+1][k9+1]).equals(this.shelf[i9+2][k9]) && (this.shelf[i9+2][k9]).equals(this.shelf[i9+2][k9+2])) {
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
				if((this.shelf[k10][0]).equals(this.shelf[k10+1][1]) && (this.shelf[k10+1][1]).equals(this.shelf[k10+2][2]) && (this.shelf[k10+2][2]).equals(this.shelf[k10+3][3]) && (this.shelf[k10+3][3]).equals(this.shelf[k10+4][4])) {
					verifica=true;	
					break;
				}
				else if((this.shelf[k10][4]).equals(this.shelf[k10+1][3]) && (this.shelf[k10+1][3]).equals(this.shelf[k10+2][2]) && (this.shelf[k10+2][2]).equals(this.shelf[k10+3][1]) && (this.shelf[k10+3][1]).equals(this.shelf[k10+4][0])) {
					verifica=true;
					break;
				}

			}
			break;

		case 12: // da corregere 
			for (int k11=0; k11<2; k11++) { 
				if( !(this.shelf[k11][0]).isEmpty() && !(this.shelf[k11+1][1]).isEmpty() && !(this.shelf[k11+2][2]).isEmpty() && !(this.shelf[k11+3][3]).isEmpty() && !(this.shelf[k11+4][4]).isEmpty()) {
					verifica=true;
					break;
				}
				else if( !(this.shelf[k11][4]).isEmpty() && !(this.shelf[k11+1][3]).isEmpty() && !(this.shelf[k11+2][2]).isEmpty() && !(this.shelf[k11+3][1]).isEmpty() && !(this.shelf[k11+4][0]).isEmpty())  {
					verifica=true;
					break;
				}

			}
			break;

		}

		return verifica;
	}



}
