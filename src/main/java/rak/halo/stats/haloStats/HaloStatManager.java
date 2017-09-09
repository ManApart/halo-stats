package rak.halo.stats.haloStats;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import rak.halo.stats.haloStats.model.customs.ServiceRecordCustomsArray;

public class HaloStatManager {
	private static final String TOKEN = "170f6ad95dd740689eedc31707ccf2c2";
	private static final String BASE_URL = "https://www.haloapi.com/stats/";
	
	public ServiceRecordCustomsArray getServiceRecordForCustoms(String userId, Platform patform){
		String methodUrl = "servicerecords/custom?players=";
		String url = BASE_URL + patform + methodUrl + userId;
		
		return makeGetCall(url, ServiceRecordCustomsArray.class);
	}
	
	private <T> T makeGetCall(String url, Class<T> clazz) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Ocp-Apim-Subscription-Key", TOKEN);
		HttpEntity<String> entity = new HttpEntity<String>("", headers);
		
		RestTemplate restTemplate = new RestTemplate();
		T result = restTemplate.exchange(url, HttpMethod.GET, entity, clazz).getBody();
		return result;
	}
	
}
