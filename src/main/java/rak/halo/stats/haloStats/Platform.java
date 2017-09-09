package rak.halo.stats.haloStats;

public enum Platform {
	XBOX("h5/"),
	PC("h5pc/");
	
	private String path;
	
	private Platform(String path){
		this.path = path;
	}
	
	@Override
	public String toString(){
		return path;
	}

}
