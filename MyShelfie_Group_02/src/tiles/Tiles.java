package tiles;

public class Tiles {
	
	private ObjectEnum colour;
	
	

	

	public void setColour(ObjectEnum colour) {
		switch(colour) {
		case WHITE:
			this.colour = ObjectEnum.WHITE;
			break;
		case BLUE:
			this.colour = ObjectEnum.BLUE;
			break;
		case PINK:
			this.colour = ObjectEnum.PINK;
			break;
		case GREEN:
			this.colour = ObjectEnum.GREEN;
			break;
		case YELLOW:
			this.colour = ObjectEnum.YELLOW;
			break;
		case LIGHT_BLUE:
			this.colour = ObjectEnum.LIGHT_BLUE;
			break;
		case EMPTY:
			this.colour = ObjectEnum.EMPTY;
			break;
		case NULL:
			this.colour = ObjectEnum.NULL;
			break;
		}
		
	}
	
	public Tiles() {
		this.colour = ObjectEnum.EMPTY;
	}
	public Tiles(ObjectEnum colour) {
		this.colour = colour;
	}
	
	
	
	public ObjectEnum gObject() {
		return this.colour;
		
	}
	
	public boolean equals(Tiles tiles) {
		if((this.colour).equals(tiles.colour)) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if((this.colour).equals(ObjectEnum.EMPTY)) {
			return true;
		}
		return false;
	}


	public boolean isPink () {
		if((this.colour).equals(ObjectEnum.PINK)) {
			return true;
		}
		return false;
	}
	
	public boolean isBlue () {
		if((this.colour).equals(ObjectEnum.BLUE)) {
			return true;
		}
		return false;
		
	}
	
	public boolean isGreen () {
		if((this.colour).equals(ObjectEnum.GREEN)) {
			return true;
		}
		return false;
		
	}
	public boolean isWhite () {
		if((this.colour).equals(ObjectEnum.WHITE)) {
			return true;
		}
		return false;
		
	}
	public boolean isYellow () {
		if((this.colour).equals(ObjectEnum.YELLOW)) {
			return true;
		}
		return false;
		
	}
	public boolean isLightBlue () {
		if((this.colour).equals(ObjectEnum.LIGHT_BLUE)) {
			return true;
		}
		return false;
		
	}
	
	
	
	
	

}
