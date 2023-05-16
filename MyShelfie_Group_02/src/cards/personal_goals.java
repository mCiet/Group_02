package cards;

import tiles.ObjectEnum;


public enum personal_goals {

	GOALS1(new ObjectEnum[][]{{ObjectEnum.PINK, ObjectEnum.EMPTY, ObjectEnum.BLUE, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.WHITE, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY}} ),
	GOALS2(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.PINK,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.GREEN, ObjectEnum.EMPTY,ObjectEnum.YELLOW,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.YELLOW},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.BLUE}} ),
	GOALS3(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.YELLOW,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.PINK,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY}} ),
	GOALS4(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.YELLOW},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.LIGHT_BLUE, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.WHITE,ObjectEnum.GREEN,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY}} ),
	GOALS5(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK},
		{ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY}} ),
	GOALS6(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.LIGHT_BLUE, ObjectEnum.EMPTY, ObjectEnum.GREEN},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.WHITE, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY}} ),
	//da finire ho solo copiato la riga sopra
	GOALS7(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK},
		{ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY}} ),
	GOALS8(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK},
		{ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY}} ),
	GOALS9(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK},
		{ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY}} ),
	GOALS10(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK},
		{ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY}} ),
	GOALS11(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK},
		{ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY}} ),
	GOALS12(new ObjectEnum[][]{{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK},
		{ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY}} );
	
	private final ObjectEnum[][] personal_goals;

	private personal_goals(ObjectEnum[][] personal_goals) {
		this.personal_goals = personal_goals;
	}
	
	public ObjectEnum[][] gPersGoal(){
		return personal_goals;
		
	}
}
