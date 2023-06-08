package player;

import main.Main;
import java.util.Set;
import java.util.Random;
import player.Player;
import java.util.HashSet;
import bookshelf.Shelf;
import tiles.*;
import cards.*;

public class Player {

	private int ID; // INCREMENTO AUTOMATICO


	//int c =0;
	private Shelf shelf;
	private personal_goals personalCard;
	private int score;
	public Player(int i) {
		//this.ID = c++;
		this.ID = i;
		this.shelf = new Shelf();
		this.personalCard=null;
		this.setScore(0);

	}

	public void setPersonalCard(personal_goals personalCard) {
		this.personalCard = personalCard;
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


	

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = this.score + score; //incremnete il valore
	}




}
