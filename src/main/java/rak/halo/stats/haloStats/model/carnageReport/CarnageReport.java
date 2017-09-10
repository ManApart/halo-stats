package rak.halo.stats.haloStats.model.carnageReport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarnageReport {

	@JsonProperty("PlayerStats")
	private PlayerStats[] playerStats;

	public PlayerStats[] getPlayerStats() {
		return playerStats;
	}

	public void setPlayerStats(PlayerStats[] playerStats) {
		this.playerStats = playerStats;
	}
	
	
}
