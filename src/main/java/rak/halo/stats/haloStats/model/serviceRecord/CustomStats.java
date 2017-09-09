package rak.halo.stats.haloStats.model.serviceRecord;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.model.FriendlyDuration;
import rak.halo.stats.haloStats.utility.ReflectivePrint;

@ReflectivePrint
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomStats {
	
	@JsonProperty("TotalMeleeKills")
	private int totalMeleeKills;
	
	@JsonProperty("TotalTimePlayed")
	private FriendlyDuration totalTimePlayed;
	
    @Override
    public String toString(){
    	return "total melee kills: " + totalMeleeKills + "\n"
    			+ "TotalTimePlayed: " + totalTimePlayed;
    }
    
    public void setTotalTimePlayed(String duration){
    	totalTimePlayed = new FriendlyDuration(duration);
    }
    

}
