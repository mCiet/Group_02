package main;

import java.util.Scanner;

import board.*;
import tiles.*;
import player.*;
import bookshelf.*;
import cards.*
;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int nGiocatori=0;
		int f =0;
		do {
			System.out.println("Inserire numero di giocatori da 2 a 4 : ");
			nGiocatori=scn.nextInt();
			System.out.println(nGiocatori);
			
		}while(nGiocatori < 2 || nGiocatori > 4  );
		
		scn.close();
		
		// passaggio del numero dei giocatori per creare soggiorno 
			Board livingroom = new Board(nGiocatori);
			Bag bag = new Bag();
			
			livingroom.boardFill(bag);
		// inizio gioco 
			Player p1 = new Player();
			Shelf s1 = new Shelf();
			Player p2 = new Player();
			Shelf s2 = new Shelf();
			if(nGiocatori>=3) {
				Player p3 = new Player();
				Shelf s3 = new Shelf();
				if(nGiocatori==4) {
					Player p4 = new Player();
					Shelf s4 = new Shelf();
				}
			}
			
			System.out.println("Ecco la tua plancia: ");
			livingroom.printBoard();
			
		//scelta da parte del giocatore della Tiles
			
			//secondo me sarebbe meglio utilizzare una sottofunzione per questo
			int nTessere;
			int c;
			//manca controllo tessere
			do{
				System.out.println("Quante tessere vuoi prendere? (da 1 a 3)");
				nTessere=scn.nextInt();
			}while(nTessere<1 || nTessere >3);
			
			for(int i=0;i<=nTessere;i++) {
				System.out.println("in che posizione si trova la tessera che vuoi prelevare? ");
				System.out.println("inserisci la riga: ");
				int y = scn.nextInt();
				System.out.println("inserisci la colonna: ");
				int x = scn.nextInt();
				
				Tiles tiles = livingroom.getTiles(y,x);
				
				do {
					System.out.println("inserisci la colonna in cui vuoi posizionare le tessere che hai scelto ");
					c = scn.nextInt();
				}while(s1.IsFull(c, nTessere));
				
				s1.addTiles(c, tiles); //da gestire come passare la giusta shelf
				
			}
			
			
		 
		//inserimento tiles nella sua libreria
		

			Card_common card = new Card_common(s1.getShelf());//prova per vedere se funziona metodo getshelf per richiamare le carte comuni
	}

}
