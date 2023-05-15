package main;

import java.util.Scanner;

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
		
		// inizio gioco 

	}

}
