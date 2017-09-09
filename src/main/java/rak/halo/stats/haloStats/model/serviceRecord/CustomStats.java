package rak.halo.stats.haloStats.model.serviceRecord;

import java.time.Duration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomStats {
	
	@JsonProperty("TotalMeleeKills")
	private int totalMeleeKills;
	
	@JsonProperty("TotalTimePlayed")
	private String totalTimePlayed;
	
    @Override
    public String toString(){
    	return "total melee kills: " + totalMeleeKills + "\n"
    			+ "TotalTimePlayed: " + formatDuration(getDuration());
    }
    
    public Duration getDuration(){
		return Duration.parse(totalTimePlayed);
    }
    
    private String formatDuration(Duration duration){
    	return duration.toDays() + " days, " + duration.minusDays(duration.toDays()).toHours() + " hours, " + duration.minusHours(duration.toHours()).toMinutes() + " minutes";
    }

}
