package main;

import java.util.Scanner;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
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


		System.out.println("BENVENUTI IN MY SHELFIE");
		do {

			Scanner scn = new Scanner(System.in);
			System.out.println("Inserisci il numero di giocatori valido tra 2 e 4: ");
			if(scn.hasNextInt()) {
				nGiocatori= scn.nextInt();
			}else {
				System.out.println("Inserire un valore numerico");
				scn.nextLine();

			}


			//scn.close();
		}while(nGiocatori<2 || nGiocatori>4);




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
			vettPlayer[i] = new Player(i);
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
		System.out.println("				");
		showCommonGoals(comGoals1);
		System.out.println("   ");
		System.out.println("OBBIETTIVO COMUNE 2:");
		System.out.println("				");
		showCommonGoals(comGoals2);


		while(!endgame(vettPlayer,nGiocatori)) {//controllo che shelf non siano piene

			
			for(int i=0;i<4;i++) { //scandisce il turno di ogni giocatore



				//stampa id player per capire chi sta giocando
				System.out.println("   ");
				System.out.println("Turno del giocatore " + (vettPlayer[i].getID()+1)); //agiungo uno perche parte da 0
				//stampa shelf
				System.out.println("				");
				System.out.println("La tua libreria: ");
				vettPlayer[i].getShelf().printShelf();
				System.out.println("				");
				//stampa obbiettivo personale
				System.out.println("Il tuo obbiettivo personale: ");
				System.out.println("				");				
				vettPlayer[i].getPersonalGoals().printPersGoals();


				int nTessere = 0;
				boolean piena; //mi serve per gestire se la colonna è piena
				int col; //numero colonna
				int colonneLibere=0; //conta le colonne in cui ci stanno le tessere scelte
				int x1= 0,x2= 0,x3= 0 ,y1= 0,y2= 0,y3 = 0;// coordinate per le tiles
				boolean valida; //controllo lato libero tessera
				Scanner sc = new Scanner(System.in);

				do {

					//scelta da parte del giocatore della Tiles
					do {

						do{
							System.out.println("				");
							System.out.println("Ecco la vostra plancia: ");
							System.out.println("				");
							livingroom.printBoard();

							System.out.println("Quante tessere vuoi prendere? (numero valido: da 1 a 3): ");
							if(sc.hasNextInt()) {
								nTessere= sc.nextInt();
							}else {
								System.out.println("Inserire un valore numerico");
								sc.nextLine();

							}

						}while(nTessere<1 || nTessere >3);


						do {
							System.out.println("In che posizione si trova la 1° tessera che vuoi prelevare? ");
							//restiuisce riga gia verificata
							x1 = verificaRiga();
							//restituise colonna in numero e verificata
							y1 = verificaCol();
						}while(!livingroom.accessible(x1,y1));

						valida = livingroom.freeSide(x1, y1);

						if(valida) {
							if(nTessere>=2) {
								do {
									System.out.println("In che posizione si trova la 2° tessera che vuoi prelevare? ");
									//restiuisce riga gia verificata
									x2=verificaRiga();
									//restituise colonna in numero e verificata
									y2 = verificaCol();
								}while(!livingroom.accessible(x2,y2));


								if(livingroom.freeSide(x2, y2)) {

									if(((x2== x1) && (y2 == y1-1)) || ((x2== x1) && (y2 == y1+1)) ) { //significa che facendo una riga
										valida = true;
									}else if(((x2 == x1-1) && (y2 == y1)) || ((x2 == x1+1) && (y2 == y1)) ){ //sigifiva che sta facendo la colonna
										valida = true;
									}else {
										valida = false;
									}	

								}else {
									valida = false;
								}

							}
						}

						if(valida) {
							if(nTessere==3) {

								do {
									System.out.println("In che posizione si trova la 3° tessera che vuoi prelevare? ");
									//restiuisce riga gia verificata
									x3=verificaRiga();
									//restituise colonna in numero e verificata
									y3 = verificaCol();	
								}while(!livingroom.accessible(x3,y3));

								if(livingroom.freeSide(x3, y3)) {
									if(((x3== x1) && (y3 == y1-1)) || ((x3== x1) && (y3 == y2+1)) ) { //significa che facendo una riga
										valida = true;
									}else if(((x3 == x2-1) && (y3 == y1)) || ((x3 == x1+1) && (y3 == y1)) ){ //sigifiva che sta facendo la colonna
										valida = true;
									}else {
										valida = false;
									}

								}else {
									valida = false;
								}


							}
						}

						if(!valida){
							System.out.println("Posizione non corretta, reinserire un numero di tessere inferiore o cambiare la posizione");
						}

					}while(!valida);

					//inserimento nella shelf
					do {
						do {
							
							System.out.println("Inserisci la colonna in cui vuoi posizionare le tessere che hai scelto, DEVE essere un NUMERO da 0 a 4");
							if(sc.hasNextInt()){
								col = sc.nextInt();
							}else {
								sc.nextLine();
								col=-1;
							}
							
							
							
						}while(col<0 || col>4);
						

						piena = vettPlayer[i].getShelf().IsFullCol(col, nTessere); //controllo che colonna richesta dal giocatore sia vuota

						
							for(int j=0;j<5;j++) { //scandisco le colonne per vedere se c'è almeno una libera
								if(!(vettPlayer[i].getShelf().IsFullCol(j, nTessere))){ //se la colonna non è piena aument colonna libere
									colonneLibere ++;
								}
							}


							if(colonneLibere==0) {
								System.out.println("Non puoi prendere " + nTessere + " tessere, non ci stanno in nessuna delle colonne della tua libreria. Scegli un numero di Tessere inferiore");
							}else if(piena && colonneLibere>0){
								System.out.println("Colonna piena reinserire una colonna valida");
							}
						
					}while((piena) && (colonneLibere==0)); //se shelf non è piena oppure se non ci sono colonne libere esce dal ciclo



				}while(colonneLibere==0); //mi fa reinserire le tessere perchè non ho abbastanza spazio in nessun colonna

				// sc.close();

				//estrazione TILES e inserimento nella libreria
				
				
				vettPlayer[i].getShelf().addTiles(col, livingroom.getTiles(x1,y1)); //inserimento nella colonna corrispondete
				livingroom.emptycell(x1, y1); //rende la cella presa vuota
				

				if(nTessere >=2) {
					vettPlayer[i].getShelf().addTiles(col, livingroom.getTiles(x2,y2)); //inserimento nella colonna corrispondete
					livingroom.emptycell(x2,y2); //rende la cella presa vuota
					
				}

				if(nTessere ==3) {
					vettPlayer[i].getShelf().addTiles(col, livingroom.getTiles(x3,y3)); //inserimento nella colonna corrispondete
					livingroom.emptycell(x3,y3); //rende la cella presa vuota
				}
				
				System.out.println("				");
				System.out.println("Ora la tua shelf e' questa: ");
				System.out.println("				");
				vettPlayer[i].getShelf().printShelf();
				System.out.println("				");
				System.out.println("Ecco la vostra plancia aggiornata: ");
				System.out.println("				");
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






	public static boolean endgame(Player[] vettPlayer, int nPlayer){


		for(int i=0;i<nPlayer;i++) {
			if((vettPlayer[i].getShelf().Isfull())) {
				vettPlayer[i].setScore(1); //asseggno token fine partita
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


	public static int verificaRiga() {
		int x;
		
		Scanner s = new Scanner(System.in);

		do {
				System.out.println("Inserisci la riga, DEVE essere un NUMERO tra 0- 8: ");
				if(s.hasNextInt()) {
					x = s.nextInt();
				}else {
					s.nextLine();
					x = -1;
					
				}
			
		}while(x<0 || x>8);

		return x;
	}

	public static int verificaCol(){
		String col;
		int y;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("inserisci la colonna tra A-I: ");
			col = s.next();

			//assegnazione lettera corrispondente
			switch(col) {

			case "A","a":
				y = 0;
			break;

			case "B","b":
				y = 1;
			break;


			case "C","c":
				y = 2;
			break;

			case "D","d":
				y = 3;
			break;

			case "E","e":
				y = 4;
			break;


			case "F","f":
				y = 5;
			break;

			case "G","g":
				y = 6;
			break;

			case "H","h":
				y = 7;
			break;


			case "I","i":
				y = 8;
			break;

			default:
				y = -1;
				System.out.println("Inserire una LETTERA tra A-I");
			}

		}while(y<0);

		return y;
	}


}


