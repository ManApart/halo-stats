package rak.halo.stats.haloStats.model.playerMatches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties("Links")
public class PlayerStatResults {
	@JsonProperty("Start")
	private int start;
	
	@JsonProperty("Count")
	private int count;
	
	@JsonProperty("ResultCount")
	private int resultCount;
	
	@JsonProperty("Results")
	private Result[] results;
	
	public Result[] getResults() {
		return results;
	}
	
	public void setResults(Result[] results) {
		this.results = results;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getResultCount() {
		return resultCount;
	}
	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
