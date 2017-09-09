package rak.halo.stats.haloStats.model.serviceRecord;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.utility.ReflectivePrint;

@ReflectivePrint
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceRecordResult {
	
	@JsonProperty("CustomStats")
	private CustomStats customStats;
	
    @Override
    public String toString(){
    	return customStats.toString();
    }

	public CustomStats getCustomStats() {
		return customStats;
	}

	public void setCustomStats(CustomStats customStats) {
		this.customStats = customStats;
	}

}
