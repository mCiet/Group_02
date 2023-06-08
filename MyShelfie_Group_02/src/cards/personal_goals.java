package cards;

import bookshelf.Shelf;
import tiles.ObjectEnum;
import tiles.Tiles;


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
	GOALS7(new ObjectEnum[][]{
		{ObjectEnum.GREEN, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.PINK,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.YELLOW},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY}} ),
	GOALS8(new ObjectEnum[][]{
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.BLUE},
		{ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.PINK,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.WHITE,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.YELLOW,ObjectEnum.EMPTY}} ),
	GOALS9(new ObjectEnum[][]{
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.YELLOW, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.WHITE},
		{ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK},
		{ObjectEnum.BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY}} ),
	GOALS10(new ObjectEnum[][]{
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.LIGHT_BLUE},
		{ObjectEnum.EMPTY,ObjectEnum.YELLOW,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.WHITE, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.PINK,ObjectEnum.EMPTY}} ),
	GOALS11(new ObjectEnum[][]{
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.PINK, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.WHITE,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.YELLOW, ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.GREEN},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY}} ),
	GOALS12(new ObjectEnum[][]{
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY, ObjectEnum.WHITE, ObjectEnum.EMPTY, ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.PINK,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY, ObjectEnum.EMPTY,ObjectEnum.BLUE,ObjectEnum.EMPTY, ObjectEnum.EMPTY },
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.LIGHT_BLUE,ObjectEnum.EMPTY},
		{ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.YELLOW},
		{ObjectEnum.GREEN,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY,ObjectEnum.EMPTY}} );
	
	private final ObjectEnum[][] personal_goals;

	public ObjectEnum[][] getPersonal_goals() {
		return personal_goals;
	}

	private personal_goals(ObjectEnum[][] personal_goals) {
		this.personal_goals = personal_goals;
	}
	
	public void printPersGoals() {
	for (int k=0; k<6; k++) {
		System.out.println(personal_goals[k][0].gObject()+ " "+ personal_goals[k][1].gObject()+ " "+ personal_goals[k][2].gObject()+ " " + personal_goals[k][3].gObject()+ " " + personal_goals[k][4].gObject());
	}	
	}
	public int obb_raggiunto(Shelf shelfGioc) {
		int cont=0;
		Tiles[][] shelf = shelfGioc.getShelf();
		for (int i=0;i<6;i++) {
			for(int j=0;j<5;j++) {
				//Tiles tiles = shelf[i][j];
				if(!(this.personal_goals[i][j]== ObjectEnum.EMPTY)) {
					if(this.personal_goals[i][j]==(shelf[i][j].gObject())) {
						cont++;
					}
				}
			}
		}
		
	return cont;
		
		
	}
	
	
}
