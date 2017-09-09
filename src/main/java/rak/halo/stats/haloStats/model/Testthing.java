package rak.halo.stats.haloStats.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Testthing {
	private String type;
	
	public Testthing(){
		
	}
	
    @Override
    public String toString(){
    	return "test: " + type;
    }
	
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

}
