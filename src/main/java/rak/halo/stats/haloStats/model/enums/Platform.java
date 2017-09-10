package rak.halo.stats.haloStats.model.enums;

public enum Platform {
	PC("h5pc/"),
	XBOX("h5/");
	
	private String path;
	
	private Platform(String path){
		this.path = path;
	}
	
	@Override
	public String toString(){
		return path;
	}

}
