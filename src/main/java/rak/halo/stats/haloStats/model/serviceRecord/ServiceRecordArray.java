package rak.halo.stats.haloStats.model.serviceRecord;

import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.utility.ReflectivePrint;

@ReflectivePrint
public class ServiceRecordArray {
	@JsonProperty("Results")
	private ServiceRecord[] results;
	
	public ServiceRecordArray() {
	}
	
	@Override
	public String toString(){
		String message = "";
		for (ServiceRecord result : getResults()){
			message += result.toString();
		}
		return message;
	}

	public ServiceRecord[] getResults() {
		return results;
	}

	public void setResults(ServiceRecord[] results) {
		this.results = results;
	}
}
