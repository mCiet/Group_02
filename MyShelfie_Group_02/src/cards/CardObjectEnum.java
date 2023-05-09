package cards;

public enum CardObjectEnum {

	NULL("null"),
	EMPTY("empty"),
	GREEN("green"),
	PINK("pink"),
	BLUE("blue"),
	LIGHT_BLUE("light_blue"),
	WHITE("white"),
	YELLOW("yellow");
	
	private final String object;

	private CardObjectEnum(String object) {
		this.object = object;
	}
	
	public String gObject() {
		return object;
		
	}
}
