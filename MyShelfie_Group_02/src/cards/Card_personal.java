package cards;

import bookshelf.Shelf;
import tiles.ObjectEnum;
import tiles.Tiles;

public class Card_personal {
	
	private personal_goals pCard;

	public Card_personal(personal_goals pCard) {
		this.pCard = pCard;
	}
	
	public boolean obb_raggiunto(Tiles[][] shelf) {
		
		Tiles[][] shelf2 = shelf;
		if(this.pCard.equals(shelf2)){ //non so se funziona
			
			return true;
		}
		return false;
	}
	
	
	
	
	
	
}
