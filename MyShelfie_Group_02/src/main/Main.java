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

		//generazione obbiettivi personali

		genPersonalGoals(nGiocatori,vettPlayer);


		//stampa della plancia
		System.out.println("Ecco la vostra plancia: ");
		livingroom.printBoard();

		//scelta e stampa obbiettivi communi
		int comGoals1 = genCommonGoals();
		int comGoals2;

		do {
			comGoals2 = genCommonGoals();
		} while (comGoals2 == comGoals1);
		int nComGolasMake = 0;
		System.out.println("   ");
		System.out.println("OBBIETTIVO COMUNE 1:");
		System.out.println("				");
		showCommonGoals(comGoals1);
		System.out.println("   ");
		System.out.println("OBBIETTIVO COMUNE 2:");
		System.out.println("				");
		showCommonGoals(comGoals2);
		boolean endgame =false;

		while(!endgame(vettPlayer,nGiocatori)) {//controllo che shelf non siano piene


			for(int i=0;i<nGiocatori;i++) { //scandisce il turno di ogni giocatore



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

						System.out.println("				");
						System.out.println("Selezione le tessere nell'ordine in cui vuoi inserirle nella tua libreria");
						System.out.println("				");

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
									if(x2!=x1 || y2 !=y1) {
										if(((x2== x1) && (y2 == y1-1)) || ((x2== x1) && (y2 == y1+1)) ) { //significa che facendo una riga
											valida = true;
										}else if(((x2 == x1-1) && (y2 == y1)) || ((x2 == x1+1) && (y2 == y1)) ){ //sigifiva che sta facendo la colonna
											valida = true;
										}else {
											valida = false;
											System.out.println("Devi prendere le tue caselle in modo che formino una riga o una colonna");
										}
									}else {
										System.out.println("Non è possibile inserire due caselle uguali");
										valida = false;
									}


								}else {
									valida = false;
									System.out.println("La tessera scelta non ha nessun lato libero");
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

								if((x3!=x1 && x3 != x2)|| (y3!=y1 && y3 != y2)) {
									if(livingroom.freeSide(x3, y3)) {
										if(((x3== x1) && (y3 == y1-1)) || ((x3== x1) && (y3 == y2+1)) ) { //significa che facendo una riga
											valida = true;
										}else if(((x3 == x2-1) && (y3 == y1)) || ((x3 == x2+1) && (y3 == y1)) ){ //sigifiva che sta facendo la colonna
											valida = true;
										}else {
											valida = false;
											System.out.println("Devi prendere le tue caselle in modo che formino una riga o una colonna");
										}
									}else {
										System.out.println("La tiles scelta non ha nessun lato libero");
										valida = false;
									}
								}else {
									valida = false;
									System.out.println("Non è possibile inserire due caselle uguali");
								}




							}
						}

						/*if(!valida){
							System.out.println("Posizione non corretta, reinserire un numero di tessere inferiore o cambiare la posizione");
						}*/

					}while(!valida);

					//inserimento nella shelf
					do {
						do {

							System.out.println("Inserisci la colonna in cui vuoi posizionare le tessere che hai scelto, DEVE essere un NUMERO da 0 a 4");
							if(sc.hasNextInt()){
								col = sc.nextInt();
								if(col<0 || col>4) {
									System.out.println("Devi inserire un valore tra 0-4");
								}
							}else {
								sc.nextLine();
								col=-1;
								System.out.println("Devi inserire un valore numerico, reinserisci la colonna");
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

					}while((piena) && (colonneLibere>0)); //se shelf non è piena oppure se non ci sono colonne libere esce dal ciclo



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


				//controllo tessere comuni

				if(Card_common.checkCommonGoals(comGoals1,vettPlayer[i].getShelf())) {
					switch(nComGolasMake) {
					case 0:
						vettPlayer[i].setScore(8);
						nComGolasMake++;
						break;
					case 1:
						vettPlayer[i].setScore(6);
						nComGolasMake++;
						break;
					case 2:
						vettPlayer[i].setScore(4);
						nComGolasMake++;
						break;
					case 3:
						vettPlayer[i].setScore(2);
						nComGolasMake++;
						break;
					}
				}
				if(Card_common.checkCommonGoals(comGoals2,vettPlayer[i].getShelf())) {
					switch(nComGolasMake) {
					case 0:
						vettPlayer[i].setScore(8);
						nComGolasMake++;
						break;
					case 1:
						vettPlayer[i].setScore(6);
						nComGolasMake++;
						break;
					case 2:
						vettPlayer[i].setScore(4);
						nComGolasMake++;
						break;
					case 3:
						vettPlayer[i].setScore(2);
						nComGolasMake++;
						break;
					}
				}




				//controllo refill tabellone
				if(livingroom.refillLivingroom()) {
					System.out.println("Non ci sono più tessere adiacenti "
							+ "faccio il riempimento della plancia");
					livingroom.boardFill(bag);
				}
				System.out.println("				");
				System.out.println("Ecco la vostra plancia aggiornata: ");
				System.out.println("				");
				livingroom.printBoard();

				System.out.println("				");
				System.out.println("				");
				System.out.println("				");
				System.out.println("				");

			}



		}


		//controllo obbiettivi personali

		int score=0;
		personal_goals pGoals;

		for(int i=0;i<nGiocatori;i++) {
			pGoals=vettPlayer[i].getPersonalGoals();
			score=pGoals.obb_raggiunto(vettPlayer[i].getShelf());
			vettPlayer[i].setScore(score);
		}


		//conteggio punti manca punto primo a finire

		//Conteggio tessere colori uguali vicini 
		for(int i=0;i<nGiocatori;i++) {
			score = nearTiles(vettPlayer[i]);
			vettPlayer[i].setScore(score);
		}


		//stampa dei punteggi

		System.out.println("   ");
		System.out.println("FINE PARTITA");
		System.out.println("				");
		System.out.println("TOTALE PUNTI PER OGNI GIOCATORE");

		int max = 0;
		Player winPlayer = new Player(2);

		for(int i =0;i<nGiocatori;i++) {
			System.out.println("Giocatore: " + i+1 + " ha totalizzato: " + vettPlayer[i].getScore() + " punti");
			if(vettPlayer[i].getScore()>max) {
				max = vettPlayer[i].getScore();
				winPlayer = vettPlayer[i];
			}
		}

		//stampa vincitore

		System.out.println("				");
		System.out.println("HA VINTO LA PARTITA");
		System.out.println("CON " + max + " PUNTI");
		System.out.println("IL GIOCATORE NUMERO: ");
		System.out.println("				");
		System.out.println(winPlayer.getID()+1);


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

	public static int nearTiles(Player player) {
		//controlla e assegna i punti per le tessere vicine
		Tiles[][] shelf = player.getShelf().getShelf(); //restituisce matrice di tiles

		//controllo per ogni colore
		int c=0;

		//green
		c = c + countcolor(shelf, ObjectEnum.GREEN);

		//pink
		c = c + countcolor(shelf, ObjectEnum.PINK);

		//BLUE
		c = c + countcolor(shelf, ObjectEnum.BLUE);

		//LIGHT_BLUE
		c = c + countcolor(shelf, ObjectEnum.LIGHT_BLUE);

		//WHITE
		c = c + countcolor(shelf, ObjectEnum.WHITE);

		//YELLOW
		c = c + countcolor(shelf, ObjectEnum.YELLOW);

		return c;

	}

	public static int countcolor(Tiles[][] shelf,ObjectEnum colore) {

		int c=0,punti = 0;
		for(int i =0;i<6;i++) {
			for(int j=0;j<5;j++) {
				if(shelf[i][j].gObject().equals(colore)) {
					if(nearcolor(i,j,shelf,colore)) {
						c++;
					}
				}
			}
		}

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

	public static boolean nearcolor(int i, int j, Tiles [][] shelf, ObjectEnum colour) {

		//sopra
		if(i!=0) {
			if(shelf[i-1][j].gObject().equals(colour)) {
				return true;
			}
		}

		//sotto
		if(i!= 5) {
			if(shelf[i+1][j].gObject().equals(colour)) {
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
			System.out.println("Inserisci la colonna tra A-I: ");
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


	public static void genPersonalGoals(int nGioc, Player[] vett) {

		int[] numeriCasuali = new int[nGioc];
		Random random = new Random();
		Set<Integer> numeriGenerati = new HashSet<>();

		int numeroGenerato;
		for (int i = 0; i < nGioc; i++) {
			do {
				numeroGenerato = random.nextInt(12) + 1;
			} while (numeriGenerati.contains(numeroGenerato));

			numeriCasuali[i] = numeroGenerato;
			numeriGenerati.add(numeroGenerato);
		}

		for (int i=0;i< numeriCasuali.length;i++) {
			switch(numeriCasuali[i]) {
			case 1:
				vett[i].setPersonalCard(personal_goals.GOALS1);
				break;
			case 2:
				vett[i].setPersonalCard(personal_goals.GOALS2);
				break;
			case 3:
				vett[i].setPersonalCard(personal_goals.GOALS3);
				break;
			case 4:
				vett[i].setPersonalCard(personal_goals.GOALS4);
				break;
			case 5:
				vett[i].setPersonalCard(personal_goals.GOALS5);
				break;
			case 6:
				vett[i].setPersonalCard(personal_goals.GOALS6);
				break;
			case 7:
				vett[i].setPersonalCard(personal_goals.GOALS7);
				break;
			case 8:
				vett[i].setPersonalCard(personal_goals.GOALS8);
				break;
			case 9:
				vett[i].setPersonalCard(personal_goals.GOALS9);
				break;
			case 10:
				vett[i].setPersonalCard(personal_goals.GOALS10);
				break;
			case 11:
				vett[i].setPersonalCard(personal_goals.GOALS11);
				break;
			case 12:
				vett[i].setPersonalCard(personal_goals.GOALS12);
				break;
			}
		}

	}


}


