package rak.halo.stats.haloStats.model.serviceRecord;

import java.time.Duration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.utility.DurationTools;
import rak.halo.stats.haloStats.utility.ReflectivePrint;

@ReflectivePrint
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomStats {
	
	@JsonProperty("TotalMeleeKills")
	private int totalMeleeKills;
	
	@JsonProperty("TotalTimePlayed")
	private Duration totalTimePlayed;
//	private String totalTimePlayed;
	
    @Override
    public String toString(){
    	return "total melee kills: " + totalMeleeKills + "\n"
    			+ "TotalTimePlayed: " + DurationTools.toFormattedString(totalTimePlayed);
    }
    
    public void setTotalTimePlayed(String duration){
    	totalTimePlayed = DurationTools.getDuration(duration);
    }
    

}
