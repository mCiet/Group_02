package cards;

import cards.CardObjectEnum;


public enum personal_goals {

	GOALS1(new CardObjectEnum[][]{{CardObjectEnum.PINK, CardObjectEnum.EMPTY, CardObjectEnum.BLUE, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},{}} ),
	GOALS2,
	GOALS3,
	GOALS4,
	GOALS5,
	GOALS6,
	GOALS7,
	GOALS8,
	GOALS9,
	GOALS10,
	GOALS11,
	GOALS12;
	
	private final CardObjectEnum[][] personal_goals;

	private personal_goals(CardObjectEnum[][] personal_goals) {
		this.personal_goals = personal_goals;
	}
	
	public CardObjectEnum[][] gPersGoal(){
		return personal_goals;
		
	}
}
