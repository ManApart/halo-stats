package rak.halo.stats.haloStats.model.serviceRecord;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.utility.ReflectivePrint;

@ReflectivePrint
@JsonIgnoreProperties(ignoreUnknown = true)
public class WarzoneStats extends CoreStats{
	
	@JsonProperty("TotalPiesEarned")
	private int totalPiesEarned;

}
