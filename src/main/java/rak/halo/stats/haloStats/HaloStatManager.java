package rak.halo.stats.haloStats;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import rak.halo.stats.haloStats.model.enums.GameMode;
import rak.halo.stats.haloStats.model.enums.Platform;
import rak.halo.stats.haloStats.model.matches.CarnageReport;
import rak.halo.stats.haloStats.model.matches.GameHistory;
import rak.halo.stats.haloStats.model.matches.MatchMetaInfo;
import rak.halo.stats.haloStats.model.serviceRecord.ServiceRecordArray;

public class HaloStatManager {
	private static final String TOKEN = "170f6ad95dd740689eedc31707ccf2c2";
	private static final String BASE_URL = "https://www.haloapi.com/stats/";
	
	public ServiceRecordArray getServiceRecordForCustoms(String userId, Platform platform){
		String url = BASE_URL + platform + "servicerecords/custom?players=" + userId;
		return makeGetCall(url, ServiceRecordArray.class);
	}
	
	public GameHistory getPlayerMatchHistory(String userId, Platform platform){
		String url = BASE_URL + platform + "players/" + userId + "/matches";
		return makeGetCall(url, GameHistory.class);
	}
	
	public GameHistory getPlayerMatchHistory(String userId, Platform platform, GameMode[] modes, int start, int count){
		String modesString = modesToQueryString(modes);
		String possibleAmpersand = modesString == null ? "&" : "";
		String url = BASE_URL + platform + "players/" + userId + "/matches?" + modesString + possibleAmpersand + start + "&" + count;
		return makeGetCall(url, GameHistory.class);
	}
	
	public CarnageReport getLatestMatchResult(String userId, Platform platform){
		GameHistory history = getPlayerMatchHistory(userId, platform, null, 0, 1);
		if (history.getResults().length > 0){
			MatchMetaInfo historyMatch = history.getResults()[0];
			String matchId = historyMatch.getId().getMatchId();
			GameMode mode = historyMatch.getId().getGameModeEnum();
			
			return getMatchResult(platform, mode, matchId);
		}
		return null;
	}
	
	public CarnageReport getMatchResult(Platform platform, GameMode mode, String matchId){
		String url = BASE_URL + platform + mode.getName() + "/matches/" + matchId;
		return makeGetCall(url, CarnageReport.class);
	}
	
	private String modesToQueryString(GameMode[] modes){
		if (modes == null){
			return null;
		}
		String query = "";
		for (GameMode mode : modes){
			query += mode.getName() + ",";
		}
		if (query.length() > 0){
			query.substring(0, query.length()-1);
		}
		return query;
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
