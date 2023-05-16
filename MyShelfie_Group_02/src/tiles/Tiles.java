package tiles;
/* ho creato pacchetto e classe tiles perchè nei folder di gioco li idnetifica come pedine, semplicemente, sposterei qui
 * ciò che è nella classe Card_objects, fatemi sapere in caso si possa fare diversamente.
 */
public class Tiles {
	
	private ObjectEnum colour;
	
	
	public Tiles(ObjectEnum colour) {
		this.colour = colour;
	}
	
	public ObjectEnum gObject() {
		return this.colour;
		
	}
	


	/*public boolean isPink () {
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
	
	*/
	
	
	

}
