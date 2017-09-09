package rak.halo.stats.haloStats;

import rak.halo.stats.haloStats.model.customs.ServiceRecordCustomsArray;

public class HaloStatsApplication {
	private static final String userId = "iceburg 33308";
//	private static final String userId = "danceparty17";

	public static void main(String[] args) {
		HaloStatManager manager = new HaloStatManager();

		ServiceRecordCustomsArray serviceRecord = manager.getServiceRecordForCustoms(userId, Platform.PC);

		System.out.println(serviceRecord);
	}
}
