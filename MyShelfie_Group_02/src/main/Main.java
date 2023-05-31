package main;

import java.util.Scanner;

import board.*;
import tiles.*;
import player.*;
import bookshelf.*;
import cards.*
;
public class Main {
	
	public static boolean isNumeric(String str) {
	    if (str == null || str.length() == 0) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(str);
	    } catch (NumberFormatException e) {
	        return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		
		//grafic.FrontEnd.Window(args); utlizzo della grafica non
		int nGiocatori;
		
		Scanner scn = new Scanner(System.in);
		
		do {
			System.out.println("inserisci il numero di giocatori valido tra 2 e 4: ");
			nGiocatori= scn.nextInt();
		}while(nGiocatori<=2 && nGiocatori>=4);
		
		
		
		 //passaggio del numero dei giocatori per creare soggiorno 
		Board livingroom = new Board(nGiocatori);
			Bag bag = new Bag();
			
			livingroom.boardFill(bag);
		// creazione player 
			Player[] vettPlayer = null;
			
			for(int i =0; i<4;i++) {
				vettPlayer[i] = new Player();
			}
			
			//stampa della plancia
			System.out.println("Ecco la vostra plancia: ");
			livingroom.printBoard();
			
		//scelta da parte del giocatore della Tiles
			
			
			while(!endgame(vettPlayer)) {//controllo che non shelf non siano piene
				for(int i=0;i<4;i++) { //scandisce il turno di ogni giocatore
					
					int nTessere;
					boolean piena;
					int col;
					
					do {
					//manca controllo tessere
						do{
							System.out.println("Quante tessere vuoi prendere? (da 1 a 3)");
							nTessere=scn.nextInt();
						}while(nTessere<1 || nTessere >3);
					
					
						System.out.println("in che posizione si trova la tessera che vuoi prelevare? ");
						System.out.println("inserisci la riga: ");
						int y1 = scn.nextInt();
						System.out.println("inserisci la colonna: ");
						int x1 = scn.nextInt();
						if(nTessere>=2) {
							System.out.println("in che posizione si trova la 2° tessera che vuoi prelevare? ");
							System.out.println("inserisci la riga: ");
							int y2 = scn.nextInt();
							System.out.println("inserisci la colonna: ");
							int x2 = scn.nextInt();
						}
						if(nTessere>=3) {
							System.out.println("in che posizione si trova la 2° tessera che vuoi prelevare? ");
							System.out.println("inserisci la riga: ");
							int y3 = scn.nextInt();
							System.out.println("inserisci la colonna: ");
							int x3 = scn.nextInt();
						}
						
						do {
							System.out.println("inserisci la colonna in cui vuoi posizionare le tessere che hai scelto da 0 a 5");
							col = scn.nextInt();
						
							piena = vettPlayer[i].getShelf().IsFullCol(col, nTessere);
						}while(!piena);
						
						
						
						Tiles tiles = livingroom.getTiles(y1,x1);
						livingroom.emptycell(y1, x1); //rende la cella presa vuota
						
						
						
						
							
							
						}while(!piena);
						
						
						//da gestire come passare la giusta shelf
				}
				}
	}
	
	public static boolean endgame(Player[] vettPlayer){
	
		
		for(int i=0;i<4;i++) {
			if(!(vettPlayer[i].getShelf().Isfull())) {
				return true;
			}
		}
		return false;
		
		
		
	
	}
			

}

