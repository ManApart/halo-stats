package rak.halo.stats.haloStats.model.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
	@JsonProperty("Player")
	private PlayerInfo player;
	
	@JsonProperty("TeamId")
	private int teamId;
	
	@JsonProperty("Rank")
	private int rank;

	@JsonProperty("Result")
	private int result;

	@JsonProperty("TotalKills")
	private int totalKills;

	@JsonProperty("TotalDeaths")
	private int totalDeaths;

	@JsonProperty("TotalAssists")
	private int totalAssists;
	
	public PlayerInfo getPlayer() {
		return player;
	}
	public void setPlayer(PlayerInfo player) {
		this.player = player;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getTotalKills() {
		return totalKills;
	}
	public void setTotalKills(int totalKills) {
		this.totalKills = totalKills;
	}
	public int getTotalDeaths() {
		return totalDeaths;
	}
	public void setTotalDeaths(int totalDeaths) {
		this.totalDeaths = totalDeaths;
	}
	public int getTotalAssists() {
		return totalAssists;
	}
	public void setTotalAssists(int totalAssists) {
		this.totalAssists = totalAssists;
	}
	
}
