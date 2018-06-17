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
import rak.halo.stats.haloStats.utility.Keys;

public class HaloStatsManager {
	private static final String BASE_URL = "https://www.haloapi.com/stats/";
	
	public ServiceRecordArray getServiceRecord(String userId, Platform platform, GameMode mode){
		String url = BASE_URL + platform + "servicerecords/" + mode.getName() + "?players=" + userId;
		return makeGetCall(url, ServiceRecordArray.class);
	}
	
	public GameHistory getPlayerMatchHistory(String userId, Platform platform){
		String url = BASE_URL + platform + "players/" + userId + "/matches";
		return makeGetCall(url, GameHistory.class);
	}
	
	public GameHistory getPlayerMatchHistory(String userId, Platform platform, GameMode[] modes, int start, int count){
		String modesString = modesToQueryString(modes);
		String possibleAmpersand = modesString != "" ? "&" : "";
		String url = BASE_URL + platform + "players/" + userId + "/matches?" + modesString + possibleAmpersand + "start=" + start + "&count=" + count;
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
			return "";
		}
		String query = "modes=";
		for (GameMode mode : modes){
			query += mode.getName() + ",";
		}
		if (query.endsWith(",")){
			query = query.substring(0, query.length()-1);
		}
		return query;
	}
	
	private <T> T makeGetCall(String url, Class<T> clazz) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Ocp-Apim-Subscription-Key", Keys.TOKEN);
		HttpEntity<String> entity = new HttpEntity<String>("", headers);
		
		RestTemplate restTemplate = new RestTemplate();
		try {
			T result = restTemplate.exchange(url, HttpMethod.GET, entity, clazz).getBody();
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
