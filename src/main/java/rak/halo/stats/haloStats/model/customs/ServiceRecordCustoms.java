package rak.halo.stats.haloStats.model.customs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceRecordCustoms {
	
	@JsonProperty("Id")
	private String id;
	
	@JsonProperty("Result")
	private ServiceRecordCustomsResult result;
	
	public ServiceRecordCustoms(){
		
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


}
