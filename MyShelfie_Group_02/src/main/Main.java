package main;

import java.util.Scanner;

import board.*;
import tiles.*;
import player.*;
import bookshelf.*;

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
			int nTessere;
			//manca controllo tessere
			do{
				System.out.println("Quante tessere vuoi prendere? (da 1 a 3)");
				nTessere=scn.nextInt();
			}while(nTessere<1 || nTessere >3);
			
			System.out.println("in che posizione si trova la tessera che vuoi prelevare? ");
			//Tiles tiles = scn.nextLn(System.in);
			
		 
		//inserimento tiles nella sua libreria
		

	}

}
