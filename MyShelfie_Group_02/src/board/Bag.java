package board;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import tiles.ObjectEnum;
import tiles.Tiles;

public class Bag {
	
	List<Tiles> tiles = new ArrayList<Tiles>();
	
	public Bag() {
		BagGeneration();
		
	}
	
	private void BagGeneration() {
		int i=1;
		while( i<23 ) {
			tiles.add(new Tiles(ObjectEnum.PINK));
			tiles.add(new Tiles(ObjectEnum.BLUE));
			tiles.add(new Tiles(ObjectEnum.LIGHT_BLUE));
			tiles.add(new Tiles(ObjectEnum.GREEN));
			tiles.add(new Tiles(ObjectEnum.WHITE));
			tiles.add(new Tiles(ObjectEnum.YELLOW));
			i++;
		}
		
	}

	public Tiles RandGeneration() {
		
		Collections.shuffle(tiles);
		if(!tiles.isEmpty()) {
			Tiles temp;
			temp=tiles.get(0);
			tiles.remove(0);
			return temp;
		}
		else {
			System.out.println("ERRORE: Bag is EMPTY");
			return null;
		}
		
	}
		
		
	
	
}
