package rak.halo.stats.haloStats.model.carnageReport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.model.playerMatches.PlayerInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerStats {
	
	@JsonProperty("Player")
	private PlayerInfo playerInfo;
	
	@JsonProperty("TeamId")
	private int teamId;
	
	@JsonProperty("avgLifeTimeOfPlayer")
	private String avgLifeTimeOfPlayer;
	
	@JsonProperty("TotalKills")
	private int totalKills;
	
	@JsonProperty("TotalHeadshots")
	private int totalHeadshots;
	
	@JsonProperty("TotalWeaponDamage")
	private double totalWeaponDamage;
	
	@JsonProperty("TotalShotsFired")
	private int totalShotsFired;
	
	@JsonProperty("TotalShotsLanded")
	private int totalShotsLanded;
	
	@JsonProperty("TotalMeleeKills")
	private int totalMeleeKills;
	
	@JsonProperty("TotalAssassinations")
	private int totalAssassinations;
	
	@JsonProperty("TotalGroundPoundKills")
	private int totalGroundPoundKills;
	
	@JsonProperty("TotalShoulderBashKills")
	private int totalShoulderBashKills;
	
	@JsonProperty("TotalPowerWeaponKills")
	private int totalPowerWeaponKills;
	
	@JsonProperty("TotalPowerWeaponGrabs")
	private int totalPowerWeaponGrabs;
	
	@JsonProperty("TotalDeaths")
	private int totalDeaths;
	
	@JsonProperty("TotalAssists")
	private int totalAssists;
	
	@JsonProperty("TotalGrenadeKills")
	private int totalGrenadeKills;
	
	@JsonProperty("MapVariantId")
	private String mapVariantId;
	
	@JsonProperty("GameVariantId")
	private String gameVariantId;
	
	@JsonProperty("PlaylistId")
	private String playlistId;
	
	@JsonProperty("MapId")
	private String mapId;
	
	@JsonProperty("GameBaseVariantId")
	private String gameBaseVariantId;
	
	@JsonProperty("IsTeamGame")
	private boolean isTeamGame;

	public PlayerInfo getPlayerInfo() {
		return playerInfo;
	}

	public void setPlayerInfo(PlayerInfo playerInfo) {
		this.playerInfo = playerInfo;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getAvgLifeTimeOfPlayer() {
		return avgLifeTimeOfPlayer;
	}

	public void setAvgLifeTimeOfPlayer(String avgLifeTimeOfPlayer) {
		this.avgLifeTimeOfPlayer = avgLifeTimeOfPlayer;
	}

	public int getTotalKills() {
		return totalKills;
	}

	public void setTotalKills(int totalKills) {
		this.totalKills = totalKills;
	}

	public int getTotalHeadshots() {
		return totalHeadshots;
	}

	public void setTotalHeadshots(int totalHeadshots) {
		this.totalHeadshots = totalHeadshots;
	}

	public double getTotalWeaponDamage() {
		return totalWeaponDamage;
	}

	public void setTotalWeaponDamage(double totalWeaponDamage) {
		this.totalWeaponDamage = totalWeaponDamage;
	}

	public int getTotalShotsFired() {
		return totalShotsFired;
	}

	public void setTotalShotsFired(int totalShotsFired) {
		this.totalShotsFired = totalShotsFired;
	}

	public int getTotalShotsLanded() {
		return totalShotsLanded;
	}

	public void setTotalShotsLanded(int totalShotsLanded) {
		this.totalShotsLanded = totalShotsLanded;
	}

	public int getTotalMeleeKills() {
		return totalMeleeKills;
	}

	public void setTotalMeleeKills(int totalMeleeKills) {
		this.totalMeleeKills = totalMeleeKills;
	}

	public int getTotalAssassinations() {
		return totalAssassinations;
	}

	public void setTotalAssassinations(int totalAssassinations) {
		this.totalAssassinations = totalAssassinations;
	}

	public int getTotalGroundPoundKills() {
		return totalGroundPoundKills;
	}

	public void setTotalGroundPoundKills(int totalGroundPoundKills) {
		this.totalGroundPoundKills = totalGroundPoundKills;
	}

	public int getTotalShoulderBashKills() {
		return totalShoulderBashKills;
	}

	public void setTotalShoulderBashKills(int totalShoulderBashKills) {
		this.totalShoulderBashKills = totalShoulderBashKills;
	}

	public int getTotalPowerWeaponKills() {
		return totalPowerWeaponKills;
	}

	public void setTotalPowerWeaponKills(int totalPowerWeaponKills) {
		this.totalPowerWeaponKills = totalPowerWeaponKills;
	}

	public int getTotalPowerWeaponGrabs() {
		return totalPowerWeaponGrabs;
	}

	public void setTotalPowerWeaponGrabs(int totalPowerWeaponGrabs) {
		this.totalPowerWeaponGrabs = totalPowerWeaponGrabs;
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

	public int getTotalGrenadeKills() {
		return totalGrenadeKills;
	}

	public void setTotalGrenadeKills(int totalGrenadeKills) {
		this.totalGrenadeKills = totalGrenadeKills;
	}

	public String getMapVariantId() {
		return mapVariantId;
	}

	public void setMapVariantId(String mapVariantId) {
		this.mapVariantId = mapVariantId;
	}

	public String getGameVariantId() {
		return gameVariantId;
	}

	public void setGameVariantId(String gameVariantId) {
		this.gameVariantId = gameVariantId;
	}

	public String getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(String playlistId) {
		this.playlistId = playlistId;
	}

	public String getMapId() {
		return mapId;
	}

	public void setMapId(String mapId) {
		this.mapId = mapId;
	}

	public String getGameBaseVariantId() {
		return gameBaseVariantId;
	}

	public void setGameBaseVariantId(String gameBaseVariantId) {
		this.gameBaseVariantId = gameBaseVariantId;
	}

	public boolean isTeamGame() {
		return isTeamGame;
	}

	public void setTeamGame(boolean isTeamGame) {
		this.isTeamGame = isTeamGame;
	}

	
	
	
}
