package rak.halo.stats.haloStats.model.customs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceRecordCustomsResult {
	
	@JsonProperty("CustomStats")
	private CustomStats customStats;
	
    @Override
    public String toString(){
    	return customStats.toString();
    }

}
