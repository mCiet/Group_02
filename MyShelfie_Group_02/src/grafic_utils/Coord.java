package grafic_utils;

public class Coord {

	private int row, col;

	public Coord(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj== null || getClass() != obj.getClass()) {
			return false;
		}
		Coord other = (Coord) obj;
		return this.row==other.row && this.col == other.col;
		
	}
	
	
	
}
