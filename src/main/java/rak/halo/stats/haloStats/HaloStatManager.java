package rak.halo.stats.haloStats;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import rak.halo.stats.haloStats.model.ServiceRecordCustoms;

public class HaloStatManager {
	private static final String TOKEN = "170f6ad95dd740689eedc31707ccf2c2";
	private static final String BASE_URL = "https://www.haloapi.com/stats/h5pc/servicerecords/custom?players=";
	
	public ServiceRecordCustoms getServiceRecordForCustoms(String userId){
		String url = BASE_URL + userId;
		
		return makeCall(url, ServiceRecordCustoms.class);
	}

	public <T> T makeCall(String url, Class<T> clazz) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Ocp-Apim-Subscription-Key", TOKEN);
		HttpEntity<String> entity = new HttpEntity<String>("", headers);
		
		RestTemplate restTemplate = new RestTemplate();
//		T result = restTemplate.postForObject(url, entity, clazz);
		
		T result = restTemplate.exchange(url, HttpMethod.GET, entity, clazz).getBody();
		
		return result;
	}
	
}
