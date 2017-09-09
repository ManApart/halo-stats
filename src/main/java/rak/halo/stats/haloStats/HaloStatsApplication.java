package rak.halo.stats.haloStats;

import rak.halo.stats.haloStats.model.ServiceRecordCustoms;

public class HaloStatsApplication {
//	private static final String userId = "iceburg 33308";
	private static final String userId = "danceparty17";

	public static void main(String[] args) {
		HaloStatManager manager = new HaloStatManager();

		ServiceRecordCustoms serviceRecord = manager.getServiceRecordForCustoms(userId);

//		RestTemplate restTemplate = new RestTemplate();
//		Testthing test = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Testthing.class);
//		System.out.println(test);

		System.out.println(serviceRecord);
	}
}
