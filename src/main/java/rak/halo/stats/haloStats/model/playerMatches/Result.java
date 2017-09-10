package rak.halo.stats.haloStats.model.playerMatches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
	
	@JsonProperty("Links")
	private Links links;
	
	@JsonProperty("Id")
	private MatchId id;
	
	@JsonProperty("HopperId")
	private String hopperId;
	
	@JsonProperty("MapId")
	private String mapId;

	@JsonProperty("MapVariant")
	private MapVariant mapVariant;

	@JsonProperty("GameBaseVariantId")
	private String gameBaseVariantId;

	@JsonProperty("GameVariant")
	private GameVariant gameVariant;

	@JsonProperty("MatchDuration")
	private String matchDuration;

	@JsonProperty("MatchCompletedDate")
	private MatchCompletedDate matchCompletedDate;

	@JsonProperty("Teams")
	private Team[] teams;
	
	@JsonProperty("Players")
	private Player[] players;

	@JsonProperty("IsTeamGame")
	private boolean isTeamGame;

	@JsonProperty("SeasonId")
	private String seasonId;
	
	@JsonProperty("MatchCompletedDateFidelity")
	private int matchCompletedDateFidelity;
	
	
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public MatchId getId() {
		return id;
	}
	public void setId(MatchId id) {
		this.id = id;
	}
	public String getHopperId() {
		return hopperId;
	}
	public void setHopperId(String hopperId) {
		this.hopperId = hopperId;
	}
	public String getMapId() {
		return mapId;
	}
	public void setMapId(String mapId) {
		this.mapId = mapId;
	}
	public MapVariant getMapVariant() {
		return mapVariant;
	}
	public void setMapVariant(MapVariant mapVariant) {
		this.mapVariant = mapVariant;
	}
	public String getGameBaseVariantId() {
		return gameBaseVariantId;
	}
	public void setGameBaseVariantId(String gameBaseVariantId) {
		this.gameBaseVariantId = gameBaseVariantId;
	}
	public GameVariant getGameVariant() {
		return gameVariant;
	}
	public void setGameVariant(GameVariant gameVariant) {
		this.gameVariant = gameVariant;
	}
	public String getMatchDuration() {
		return matchDuration;
	}
	public void setMatchDuration(String matchDuration) {
		this.matchDuration = matchDuration;
	}
	public MatchCompletedDate getMatchCompletedDate() {
		return matchCompletedDate;
	}
	public void setMatchCompletedDate(MatchCompletedDate matchCompletedDate) {
		this.matchCompletedDate = matchCompletedDate;
	}
	public Team[] getTeams() {
		return teams;
	}
	public void setTeams(Team[] teams) {
		this.teams = teams;
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	public boolean isTeamGame() {
		return isTeamGame;
	}
	public void setTeamGame(boolean isTeamGame) {
		this.isTeamGame = isTeamGame;
	}
	public String getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
	public int getMatchCompletedDateFidelity() {
		return matchCompletedDateFidelity;
	}
	public void setMatchCompletedDateFidelity(int matchCompletedDateFidelity) {
		this.matchCompletedDateFidelity = matchCompletedDateFidelity;
	}


}
