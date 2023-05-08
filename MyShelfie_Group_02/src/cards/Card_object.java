package cards;

public class Card_object {
	private int colour;

	public Card_object(int colour) {
		this.colour = colour;
	}
	/*
	 * Colori tessere oggetto 
	 * Rosa ==1
	 * Blu == 2
	 * Verde == 3
	 * Bianco == 4
	 * Giallo ==5
	 * Azzurro == 6
	 */
	
	public boolean isPink () {
		if(this.colour== 1) {
			return true;
		}
		return false;
		
	}
	
	public boolean isBlue () {
		if(this.colour== 2) {
			return true;
		}
		return false;
		
	}
	
	public boolean isGreen () {
		if(this.colour== 3) {
			return true;
		}
		return false;
		
	}
	public boolean isWhite () {
		if(this.colour== 4) {
			return true;
		}
		return false;
		
	}
	public boolean isYellow () {
		if(this.colour== 5) {
			return true;
		}
		return false;
		
	}
	public boolean isLightBlue () {
		if(this.colour== 6) {
			return true;
		}
		return false;
		
	}
	
}
