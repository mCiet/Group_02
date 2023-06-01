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
			//creazione soggiorno
				Board livingroom = new Board(nGiocatori);
			//creazione bag
				Bag bag = new Bag();
			
			//riempimento board
				livingroom.boardFill(bag);
				
			// creazione player 
				Player[] vettPlayer = null;
				
				for(int i =0; i<4;i++) {
					vettPlayer[i] = new Player();
				}
				
				//stampa della plancia
				System.out.println("Ecco la vostra plancia: ");
				livingroom.printBoard();
				
			
				
				//scelta e stampa obbiettivi communi
				
				
				
				//scleta e stampa degli obbiettivi personali
				
				
				
				
				
				
				
				
				while(!endgame(vettPlayer)) {//controllo che non shelf non siano piene
					for(int i=0;i<4;i++) { //scandisce il turno di ogni giocatore
						
						
						int nTessere;
						boolean piena; //mi serve per gestire se la colonna è piena
						int col; //numero colonna
						int colonneLibere=0; //conta le colonne in cui ci stanno le tessere scelte
						int x1= 0,x2= 0,x3= 0,y1= 0,y2= 0,y3 = 0; // coordinate per le tiles
						boolean valida; //controllo lato libero tessera
						
						//stampa shelf
						vettPlayer[i].getShelf().printShelf();
						
						do {
						
							//scelta da parte del giocatore della Tiles
							do {
								
							do{
								System.out.println("Quante tessere vuoi prendere? (da 1 a 3)");
								nTessere=scn.nextInt();
							}while(nTessere<1 || nTessere >3);
						
						
							
								System.out.println("in che posizione si trova la tessera che vuoi prelevare? ");
								System.out.println("inserisci la riga: ");
								x1 = scn.nextInt(); 
								System.out.println("inserisci la colonna: ");
								y1 = scn.nextInt();
								valida = livingroom.freeSide(x1, y1);
								
								if(valida) {
									if(nTessere>=2) {
										
										System.out.println("in che posizione si trova la 2° tessera che vuoi prelevare? ");
										System.out.println("inserisci la riga: ");
										x2 = scn.nextInt();
										System.out.println("inserisci la colonna: ");
										y2 = scn.nextInt();
										valida = livingroom.freeSide(x2, y2);
										if(((x2== x1) && (y2 == y1-1)) || ((x2== x1) && (y2 == y1+1)) ) { //significa che facendo una riga
											valida = true;
										}else if(((x2 == x1-1) && (y2 == y1)) || ((x2 == x1+1) && (y2 == y1)) ){ //sigifiva che sta facendo la colonna
											valida = true;
										}else {
											valida = false;
										}	
									}
								}
								
								if(valida) {
									if(nTessere>=3) {
										System.out.println("in che posizione si trova la 3° tessera che vuoi prelevare? ");
										System.out.println("inserisci la riga: ");
										x3 = scn.nextInt();
										System.out.println("inserisci la colonna: ");
										y3 = scn.nextInt();
										valida = livingroom.freeSide(x3, y3);
										
										if(((x3== x1) && (y3 == y1-1)) || ((x3== x1) && (y3 == y2+1)) ) { //significa che facendo una riga
											valida = true;
										}else if(((x3 == x2-1) && (y3 == y1)) || ((x3 == x1+1) && (y3 == y1)) ){ //sigifiva che sta facendo la colonna
											valida = true;
										}else {
											valida = false;
										}	
									}
								}
								
								if(!valida){
									System.out.println("Posizione non corretta, reinserire un numero di tessere inferiore o cmabiare la posizione");
								}
								
							}while(!valida);
							
							
							
							
							
							do {
								
								System.out.println("inserisci la colonna in cui vuoi posizionare le tessere che hai scelto da 0 a 5");
								col = scn.nextInt();
							
								piena = vettPlayer[i].getShelf().IsFullCol(col, nTessere); //controllo che colonna richesta dal giocatore sia 
								
								if(piena) {
									for(int j=0;j<5;j++) { //scandisco le colonne per vedere se c'è almeno una libera
										if(!(vettPlayer[i].getShelf().IsFullCol(j, nTessere))){ //se la colonna non è piena aument colonna libere
											colonneLibere ++;
										}
									}
									//System.out.println("colonna piena reinserire una colonna valida");
								}
							}while((piena) && (colonneLibere!=0)); //se shelf non è piena oppure se non ci sono colonne libere esce dal ciclo
							
							if(colonneLibere==0) {
								System.out.println("Non puoi prendere " + nTessere + " tessere, non ci stanno in nessuna delle colonne della tua libreria. Scegli un numero di Tessere inferiore");
							}
								
							}while(colonneLibere==0);
						
							//estrazione TILES e inserimento nella libreria
							Tiles tiles1 = livingroom.getTiles(x1,y1);
							livingroom.emptycell(x1, y1); //rende la cella presa vuota
							vettPlayer[i].getShelf().addTiles(col, tiles1); //inserimento nella colonna corrispondete
							
							if(nTessere >=2) {
								Tiles tiles2 = livingroom.getTiles(x2,y2);
								livingroom.emptycell(x2,y2); //rende la cella presa vuota
								vettPlayer[i].getShelf().addTiles(col, tiles2); //inserimento nella colonna corrispondete
							}
							
							if(nTessere ==3) {
								Tiles tiles3 = livingroom.getTiles(x3,y3);
								livingroom.emptycell(x3,y3); //rende la cella presa vuota
								vettPlayer[i].getShelf().addTiles(col, tiles3); //inserimento nella colonna corrispondete
							}
							
							System.out.println("Ora la tua shelf è questa: ");
							vettPlayer[i].getShelf().printShelf();
							
							System.out.println("Ecco la vostra plancia togliendo le tessere utilizzate: ");
							livingroom.printBoard();
							
							//controllo tessere comuni
							
							
							
							
							
							
							//controllo refill tabellone
							if(livingroom.refillLivingroom()) {
								livingroom.boardFill(bag);
							}
							
							
							
							
							
							
					}
				}
				
				//controllo carte personali
				
				
				//conteggio punti
				
				
				
				//stampa dei punteggi
				
				
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
			



