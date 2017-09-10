package rak.halo.stats.haloStats.model.other;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {
	
	@JsonProperty("StatsMatchDetails")
	private Link statsMatchDetails;
	
	
	@JsonProperty("UgcFilmManifest")
	private Link ugcFilmManifest;


	public Link getStatsMatchDetails() {
		return statsMatchDetails;
	}


	public void setStatsMatchDetails(Link statsMatchDetails) {
		this.statsMatchDetails = statsMatchDetails;
	}


	public Link getUgcFilmManifest() {
		return ugcFilmManifest;
	}


	public void setUgcFilmManifest(Link ugcFilmManifest) {
		this.ugcFilmManifest = ugcFilmManifest;
	}
	
	
	
	
	
}
