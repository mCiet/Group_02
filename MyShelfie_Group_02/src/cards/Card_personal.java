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
		int cont=0;
		
		for (int i=0;i<6;i++) {
			for(int j=0;j<5;j++) {
				Tiles tiles = shelf[i][j];
				if(!(pCard.getPersonal_goals()[i][j]== ObjectEnum.EMPTY)) {
					if(pCard.getPersonal_goals()[i][j]==(shelf[i][j].gObject())) {
						cont++;
					}
				}
			}
		}
		
		if(cont==6) {
			return true;
		}else {
			return false;
		}
		
		
	}


	
	
	
	
	
	
}
