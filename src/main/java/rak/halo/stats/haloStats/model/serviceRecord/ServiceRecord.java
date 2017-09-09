package rak.halo.stats.haloStats.model.serviceRecord;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import rak.halo.stats.haloStats.utility.ReflectivePrint;

@ReflectivePrint
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceRecord {
	
	@JsonProperty("Id")
	private String id;
	
	@JsonProperty("Result")
	private ServiceRecordResult result;
	
	public ServiceRecord(){
		
	}
	
    @Override
    public String toString(){
    	return "id: " + id + "\n" + result;
    }
	
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

	public ServiceRecordResult getResult() {
		return result;
	}

	public void setResult(ServiceRecordResult result) {
		this.result = result;
	}
    
    


}
