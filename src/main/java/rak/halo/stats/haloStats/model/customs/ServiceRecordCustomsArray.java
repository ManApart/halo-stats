package rak.halo.stats.haloStats.model.customs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceRecordCustomsArray {
	@JsonProperty("Results")
	private ServiceRecordCustoms[] results;
	
	public ServiceRecordCustomsArray() {
	}
	
	@Override
	public String toString(){
		String message = "";
		for (ServiceRecordCustoms result : getResults()){
			message += result.toString();
		}
		return message;
	}

	public ServiceRecordCustoms[] getResults() {
		return results;
	}

	public void setResults(ServiceRecordCustoms[] results) {
		this.results = results;
	}
}
