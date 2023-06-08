package tokens;

import player.Player;
import tiles.*;
import bookshelf.*;

public class Tokens {
	
	private int score;
	
	
	
	public Tokens(int score) {
		this.score = score;
		
	}
	
	
	public boolean isScoring_2(){
		if(this.score==2) {
			return true;
		}
		return false;
		
	}
	
	public boolean isScoring_4() {
		if(this.score==4) {
			return true;
		}
		return false;
	}
	 
	
	public boolean isScoring_6() {
		if(this.score==6) {
			return true;
		}
		return false;
	}
	
	public boolean isScoring_8() {
		if(this.score==8) {
			return true;
		}
		return false;
	}
	
	public boolean isEndgame_Trigger() {
		if(this.score ==1) {
			return true;
		}
		return false;
	}
	
	public int nearTiles(Player player) {
		//controlla e assegna i punti per le tessere vicine
		Tiles[][] shelf = player.getShelf().getShelf(); //restituisce matrice di tiles
		
		//controllo per ogni colore
		//VERDE
		int c, punti =0;
		c = countcolor(shelf, ObjectEnum.GREEN);
		
		if(c == 3) {
			punti = 2;
		}
		if(c==4) {
			punti = 3;
		}
		if(c==5) {
			punti = 5;
		}
		if(c>=6){
			punti = 8;
		}
		
		return punti;
		
	}
	
	public int countcolor(Tiles[][] shelf,ObjectEnum colore) {
		
		int c=0;
		for(int i =0;i<6;i++) {
			for(int j=0;j<5;j++) {
				if(shelf[i][j].gObject().equals(colore)) {
					if(nearcolor(i,j,shelf,colore)) {
						c++;
					}
				}
			}
		}
		return c;
	}
	
	public boolean nearcolor(int i, int j, Tiles [][] shelf, ObjectEnum colour) {
		
		//sopra
		if(i!=0) {
			if(shelf[i+1][j].gObject().equals(colour)) {
				return true;
			}
		}
		
		//sotto
		if(i!= 5) {
			if(shelf[i-1][j].gObject().equals(colour)) {
				return true;
			}
		}
		
		//sinistra
		if(j!=0) {
			if(shelf[i][j-1].gObject().equals(colour)) {
				return true;
			}
		}
		
		//destra
		if(j!=4) {
			if(shelf[i][j+1].gObject().equals(colour)) {
				return true;
			}
		}
		
		return false;
	}
		
	
	public int TokenHierarchy( int nPlayer) {
		
		
	/*
	 * ho provato a creare la gerarchia di come vengono assegnati i token, lo schema si basa sul fatto che il primo che completa
	 * una common goal card, guadagna il token più alto, quello da 8, per poi assegnare gli altri in ordine decrescente 
	 * a chi completa la card successivamente.
	 * ho pensato di usare uno switch, ditemi se si può fare in un altro modo o se si può modificare qualcosa,
	 * se è da cancellare fate pure
	 */
		
		
		switch (nPlayer) {
		
		case 0:
		   
			    return this.score=8;	

		
		case 1:
			
				return this.score=6;
			
		
		case 2:
				return this.score=4;
			
			
		case 3:
			
				return this.score=2;
		

		
		
		}
		return 1;
	
		
		
	}
	
	
 
}
