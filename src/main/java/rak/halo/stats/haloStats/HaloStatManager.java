package rak.halo.stats.haloStats;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import rak.halo.stats.haloStats.model.enums.GameMode;
import rak.halo.stats.haloStats.model.enums.Platform;
import rak.halo.stats.haloStats.model.playerMatches.PlayerStatResults;
import rak.halo.stats.haloStats.model.serviceRecord.ServiceRecordArray;

public class HaloStatManager {
	private static final String TOKEN = "170f6ad95dd740689eedc31707ccf2c2";
	private static final String BASE_URL = "https://www.haloapi.com/stats/";
	
	public ServiceRecordArray getServiceRecordForCustoms(String userId, Platform patform){
		String url = BASE_URL + patform + "servicerecords/custom?players=" + userId;
		
		return makeGetCall(url, ServiceRecordArray.class);
	}
	
	public PlayerStatResults getPlayerMatchHistory(String userId, Platform patform){
		String url = BASE_URL + patform + "players/" + userId + "/matches";
		
		return makeGetCall(url, PlayerStatResults.class);
	}
	
	public PlayerStatResults getPlayerMatchHistory(String userId, Platform patform, GameMode[] modes, int start, int count){
		String url = BASE_URL + patform + "players/" + userId + "/matches?" +modesToQueryString(modes) + "&" + start + "&" + count;
		
		return makeGetCall(url, PlayerStatResults.class);
	}
	
	private String modesToQueryString(GameMode[] modes){
		String query = "";
		for (GameMode mode : modes){
			query += mode.getName() + ",";
		}
		if (query.length() > 0){
			query.substring(0, query.length()-1);
		}
		return query;
	}
	
//	public ServiceRecordArray getMatchResult(String userId, Platform patform, String matchId){
//		String methodUrl = "servicerecords/custom?players=";
//		String url = BASE_URL + patform + methodUrl + userId;
//		
//		return makeGetCall(url, ServiceRecordArray.class);
//	}
	
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
