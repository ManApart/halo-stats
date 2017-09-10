package rak.halo.stats.haloStats.model.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties("Xuid")
public class PlayerInfo {

	@JsonProperty("Gamertag")
	private String gamertag;

	public String getGamertag() {
		return gamertag;
	}

	public void setGamertag(String gamertag) {
		this.gamertag = gamertag;
	}
}
