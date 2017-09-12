package rak.halo.stats.haloStats.model.serviceRecord;

import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.model.other.FriendlyDuration;
import rak.halo.stats.haloStats.utility.ReflectivePrint;

@ReflectivePrint
public class CoreStats {
	
	@JsonProperty("TotalMeleeKills")
	private int totalMeleeKills;
	
	@JsonProperty("TotalTimePlayed")
	private FriendlyDuration totalTimePlayed;

	public int getTotalMeleeKills() {
		return totalMeleeKills;
	}

	public FriendlyDuration getTotalTimePlayed() {
		return totalTimePlayed;
	}
	
	

}
