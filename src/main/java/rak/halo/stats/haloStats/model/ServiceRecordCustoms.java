package rak.halo.stats.haloStats.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceRecordCustoms {
	
	private String id;
	
	public ServiceRecordCustoms(){
		
	}
	
    @Override
    public String toString(){
    	return "test: " + id;
    }
	
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }


}
