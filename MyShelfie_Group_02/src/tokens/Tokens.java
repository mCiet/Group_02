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
	
	
	
	public int TokenHierarchy( int nPlayer) {
		
		
	/*
	 * ho provato a creare la gerarchia di come vengono assegnati i token, lo schema si basa sul fatto che il primo che completa
	 * una common goal card, guadagna il token più alto, quello da 8, per poi assegnare gli altri in ordine decrescente 
	 * a chi completa la card successivamente.
	 * ho pensato di usare uno switch, ditemi se si può fare in un altro modo o se si può modificare qualcosa,
	 * se è da cancellare fate pure
	 */
		
		
		switch (nPlayer) {
		
		case 0:
		   
			    return this.score=8;	

		
		case 1:
			
				return this.score=6;
			
		
		case 2:
				return this.score=4;
			
			
		case 3:
			
				return this.score=2;
		

		
		
		}
		return 1;
	
		
		
	}
	
	
 
}
