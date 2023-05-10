package tokens;

public class Tokens {
	
	private int score;
	
	
	public Tokens(int score) {
		this.score = score;
		
	}
	
	
	public boolean isScoring_2(){
		if(this.score==2) {
			return true;
		}
		return false;
		
	}
	
	public boolean isScoring_4() {
		if(this.score==4) {
			return true;
		}
		return false;
	}
	 
	
	public boolean isScoring_6() {
		if(this.score==6) {
			return true;
		}
		return false;
	}
	
	public boolean isScoring_8() {
		if(this.score==8) {
			return true;
		}
		return false;
	}
	
	public boolean isEndgame_Trigger() {
		if(this.score ==1) {
			return true;
		}
		return false;
	}
 
}
