package rak.halo.stats.haloStats.model.serviceRecord;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.utility.DurationTools;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomStats {
	
	@JsonProperty("TotalMeleeKills")
	private int totalMeleeKills;
	
	@JsonProperty("TotalTimePlayed")
	private String totalTimePlayed;
	
    @Override
    public String toString(){
    	return "total melee kills: " + totalMeleeKills + "\n"
    			+ "TotalTimePlayed: " + DurationTools.toFormattedString(totalTimePlayed);
    }

}
