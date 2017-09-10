package rak.halo.stats.haloStats.model.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.model.other.Links;
import rak.halo.stats.haloStats.model.player.Player;
import rak.halo.stats.haloStats.model.player.Team;

public class MatchMetaInfo {
	
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

	public MatchId getId() {
		return id;
	}

}
