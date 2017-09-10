package rak.halo.stats.haloStats.model.enums;

public enum GameMode {
	ERROR(0, "error"),
	ARENA(1, "arena"), 
	CAMPAIGN(2, "campaign"), 
	CUSTOM(3, "custom"), 
	WARZONE(4, "warzone");
	
	private int number;
	private String name;
	
	private GameMode(int number, String name){
		this.number = number;
		this.name = name;
	}
	
	public static GameMode findByNumber(int number){
		for (GameMode gameType : values()){
			if (gameType.number == number){
				return gameType;
			}
		}
		return GameMode.ERROR;
	}
	
	public String getName(){
		return this.name;
	}
}
