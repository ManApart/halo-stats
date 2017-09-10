package rak.halo.stats.haloStats.model.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.model.enums.GameMode;

public class MatchId {

	@JsonProperty("MatchId")
	private String matchId;
	
	@JsonProperty("GameMode")
	private int gameMode;

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public int getGameMode() {
		return gameMode;
	}

	public void setGameMode(int gameMode) {
		this.gameMode = gameMode;
	}
	
	public GameMode getGameModeEnum(){
		return GameMode.findByNumber(gameMode);
	}
	
	
}
