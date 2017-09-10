package rak.halo.stats.haloStats.model.serviceRecord;

import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.utility.ReflectivePrint;

@ReflectivePrint
public class ServiceRecordArray {
	@JsonProperty("Results")
	private ServiceRecordForPlayer[] results;
	
	public ServiceRecordArray() {
	}
	
	@Override
	public String toString(){
		String message = "";
		for (ServiceRecordForPlayer result : getResults()){
			message += result.toString();
		}
		return message;
	}

	public ServiceRecordForPlayer[] getResults() {
		return results;
	}

	public void setResults(ServiceRecordForPlayer[] results) {
		this.results = results;
	}
}
