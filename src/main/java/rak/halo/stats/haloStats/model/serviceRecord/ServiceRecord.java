package rak.halo.stats.haloStats.model.serviceRecord;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.utility.ReflectivePrint;

@ReflectivePrint
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceRecord {
	
	@JsonProperty("ArenaStats")
	private ArenaStats arenaStats;
	
	@JsonProperty("CampaignStat")
	private CampaignStats campaignStats;
	
	@JsonProperty("CustomStats")
	private CustomStats customStats;
	
	@JsonProperty("WarzoneStat")
	private WarzoneStats warzoneStats;
	
    @Override
    public String toString(){
    	return ""
			+ arenaStats != null ? arenaStats.toString() : ""
			+ campaignStats != null ? campaignStats.toString() : ""
			+ customStats != null ? customStats.toString() : ""
			+ warzoneStats != null ? warzoneStats.toString() : "";
    }

	public CustomStats getCustomStats() {
		return customStats;
	}


}
