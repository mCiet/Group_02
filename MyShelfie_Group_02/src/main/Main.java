package main;

import java.util.Scanner;
import java.util.Random;


import board.*;
import tiles.*;
import player.*;
import bookshelf.*;
import cards.*
;
public class Main {


	public static void main(String[] args) {

		//grafic.FrontEnd.Window(args); utlizzo della grafica non
		int nGiocatori=0;

		Scanner scn = new Scanner(System.in);
		System.out.println("BENEVNUTI IN MY SHELFIE");
		do {
			System.out.println("Inserisci il numero di giocatori valido tra 2 e 4: ");
			if(scn.hasNextInt()) {
				nGiocatori= scn.nextInt();
			}else {
				System.out.println("Inserire un valore numerico");
				scn.nextLine();

			}



		}while(nGiocatori<2 || nGiocatori>4);
		scn.close();



		//passaggio del numero dei giocatori per creare soggiorno 
		//creazione soggiorno
		Board livingroom = new Board(nGiocatori);
		//creazione bag
		Bag bag = new Bag();

		//riempimento board
		livingroom.boardFill(bag);

		// creazione player 
		Player[] vettPlayer = new Player[nGiocatori];


		for(int i =0; i<nGiocatori;i++) {
			vettPlayer[i] = new Player();
		}

		//stampa della plancia
		System.out.println("Ecco la vostra plancia: ");
		livingroom.printBoard();

		//scelta e stampa obbiettivi communi
		int comGoals1 = genCommonGoals();
		int comGoals2;

		do {
			comGoals2 = genCommonGoals();
		} while (comGoals2 == comGoals1);
		System.out.println("   ");
		System.out.println("OBBIETTIVO COMUNE 1:");
		showCommonGoals(comGoals1);
		System.out.println("   ");
		System.out.println("OBBIETTIVO COMUNE 2:");
		showCommonGoals(comGoals2);

		//scleta e stampa degli obbiettivi personali




	}

	/*
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
*/
	public static boolean endgame(Player[] vettPlayer){


		for(int i=0;i<4;i++) {
			if(!(vettPlayer[i].getShelf().Isfull())) {
				return true;
			}
		}
		return false;




	}
	 
	public static int genCommonGoals() {
		Random random = new Random();
		int numeroCasuale;

		do {
			numeroCasuale = random.nextInt(11) + 1;
		} while (numeroCasuale == 3 || numeroCasuale == 4);

		return numeroCasuale;
	}
	public static void showCommonGoals(int nr) {
		switch(nr) {
		case 1:
			System.out.println("Due gruppi separati di 4 tessere dello\r\n"
					+ "stesso tipo che formano un quadrato 2x2.\r\n"
					+ "Le tessere dei due gruppi devono essere\r\n"
					+ "dello stesso tipo.");
		case 2:
			System.out.println("Due colonne formate ciascuna\r\n"
					+ "da 6 diversi tipi di tessere. ");
		case 3:
			System.out.println("Quattro gruppi separati formati ciascuno\r\n"
					+ "da quattro tessere adiacenti dello stesso\r\n"
					+ "tipo (non necessariamente come mostrato\r\n"
					+ "in figura). Le tessere di un gruppo possono\r\n"
					+ "essere diverse da quelle di un altro gruppo. ");
		case 4:
			System.out.println("Sei gruppi separati formati ciascuno\r\n"
					+ "da due tessere adiacenti dello stesso tipo\r\n"
					+ "(non necessariamente come mostrato in\r\n"
					+ "figura). Le tessere di un gruppo possono\r\n"
					+ "essere diverse da quelle di un altro gruppo.");
		case 5:
			System.out.println("Tre colonne formate ciascuna da\r\n"
					+ "6 tessere di uno, due o tre tipi differenti.\r\n"
					+ "Colonne diverse possono avere\r\n"
					+ "combinazioni diverse di tipi di tessere.");
		case 6:
			System.out.println("Due righe formate ciascuna\r\n"
					+ "da 5 diversi tipi di tessere");

		case 7:
			System.out.println("Quattro righe formate ciascuna\r\n"
					+ "da 5 tessere di uno, due o tre tipi\r\n"
					+ "differenti. Righe diverse possono avere\r\n"
					+ "combinazioni diverse di tipi di tessere.");
		case 8:
			System.out.println("Quattro tessere dello stesso tipo\r\n"
					+ "ai quattro angoli della Libreria.");
		case 9:
			System.out.println("Otto tessere dello stesso tipo. Non ci\r\n"
					+ "sono restrizioni sulla posizione di\r\n"
					+ "queste tessere.");
		case 10:
			System.out.println("Cinque tessere dello stesso tipo\r\n"
					+ "che formano una X.");
		case 11:
			System.out.println("Cinque tessere dello stesso tipo che\r\n"
					+ "formano una diagonale. ");
		case 12:
			System.out.println("Cinque colonne di altezza crescente o\r\n"
					+ "decrescente: a partire dalla prima colonna\r\n"
					+ "a sinistra o a destra, ogni colonna successiva\r\n"
					+ "deve essere formata da una tessera in più.\r\n"
					+ "Le tessere possono essere di qualsiasi tipo.");

		}



	}

}


