package cards;

import cards.CardObjectEnum;


public enum personal_goals {

	GOALS1(new CardObjectEnum[][]{{CardObjectEnum.PINK, CardObjectEnum.EMPTY, CardObjectEnum.BLUE, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.GREEN},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.WHITE, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.YELLOW,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY}} ),
	GOALS2(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.PINK,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.GREEN, CardObjectEnum.EMPTY,CardObjectEnum.YELLOW,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.YELLOW},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.BLUE}} ),
	GOALS3(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.BLUE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.YELLOW,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.PINK,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.GREEN,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.WHITE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY}} ),
	GOALS4(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.YELLOW},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.LIGHT_BLUE, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.PINK,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.WHITE,CardObjectEnum.GREEN,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY}} ),
	GOALS5(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.BLUE,CardObjectEnum.WHITE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.PINK},
		{CardObjectEnum.YELLOW,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.GREEN,CardObjectEnum.EMPTY}} ),
	GOALS6(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.LIGHT_BLUE, CardObjectEnum.EMPTY, CardObjectEnum.GREEN},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.WHITE, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.YELLOW,CardObjectEnum.EMPTY,CardObjectEnum.BLUE,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY}} ),
	//da finire ho solo copiato la riga sopra
	GOALS7(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.BLUE,CardObjectEnum.WHITE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.PINK},
		{CardObjectEnum.YELLOW,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.GREEN,CardObjectEnum.EMPTY}} ),
	GOALS8(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.BLUE,CardObjectEnum.WHITE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.PINK},
		{CardObjectEnum.YELLOW,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.GREEN,CardObjectEnum.EMPTY}} ),
	GOALS9(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.BLUE,CardObjectEnum.WHITE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.PINK},
		{CardObjectEnum.YELLOW,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.GREEN,CardObjectEnum.EMPTY}} ),
	GOALS10(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.BLUE,CardObjectEnum.WHITE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.PINK},
		{CardObjectEnum.YELLOW,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.GREEN,CardObjectEnum.EMPTY}} ),
	GOALS11(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.BLUE,CardObjectEnum.WHITE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.PINK},
		{CardObjectEnum.YELLOW,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.GREEN,CardObjectEnum.EMPTY}} ),
	GOALS12(new CardObjectEnum[][]{{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY, CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.LIGHT_BLUE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY, CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY, CardObjectEnum.EMPTY },
		{CardObjectEnum.EMPTY,CardObjectEnum.BLUE,CardObjectEnum.WHITE,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY},
		{CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.PINK},
		{CardObjectEnum.YELLOW,CardObjectEnum.EMPTY,CardObjectEnum.EMPTY,CardObjectEnum.GREEN,CardObjectEnum.EMPTY}} );
	
	private final CardObjectEnum[][] personal_goals;

	private personal_goals(CardObjectEnum[][] personal_goals) {
		this.personal_goals = personal_goals;
	}
	
	public CardObjectEnum[][] gPersGoal(){
		return personal_goals;
		
	}
}
