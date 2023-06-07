package player;

import main.Main;
import java.util.Random;
import player.Player;

import bookshelf.Shelf;
import tiles.*;
import cards.*;

public class Player {

	private int ID; // INCREMENTO AUTOMATICO
	

	//int c =0;
	private Shelf shelf;
	private personal_goals personalCard;

	public Player(int i) {
		//this.ID = c++;
		this.ID = i;
		this.shelf = new Shelf();
		this.personalCard= genPersonalGoals();


	}

	public Shelf getShelf() {
		return shelf;//in questo modo ritorna matrice di tiles
	}

	public int getID() {
		return ID;
	}

	public personal_goals getPersonalGoals() {
		return personalCard;// ritorna l'obiettivo personale
	}


	public static personal_goals genPersonalGoals() {

		personal_goals goals = null;
		Random random = new Random();
		
		int numGen=random.nextInt(12) + 1;		

		switch(numGen) {
		case 1:
			goals=personal_goals.GOALS1;
		case 2:
			goals=personal_goals.GOALS2;
		case 3:
			goals=personal_goals.GOALS3;
		case 4:
			goals=personal_goals.GOALS4;
		case 5:
			goals=personal_goals.GOALS5;
		case 6:
			goals=personal_goals.GOALS6;
		case 7:
			goals=personal_goals.GOALS7;
		case 8:
			goals=personal_goals.GOALS8;
		case 9:
			goals=personal_goals.GOALS9;
		case 10:
			goals=personal_goals.GOALS10;
		case 11:
			goals=personal_goals.GOALS11;
		case 12:
			goals=personal_goals.GOALS12;
		}


		return goals;

	}




}
