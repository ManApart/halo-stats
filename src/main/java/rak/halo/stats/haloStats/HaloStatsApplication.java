package rak.halo.stats.haloStats;

import rak.halo.stats.haloStats.model.serviceRecord.ServiceRecordArray;
import rak.halo.stats.haloStats.utility.ModelReflectiveReader;

public class HaloStatsApplication {
	private static final String userId = "iceburg 33308";
//	private static final String userId = "danceparty17";

	public static void main(String[] args) {
		HaloStatManager manager = new HaloStatManager();

		for (Platform platform : Platform.values()){
			ServiceRecordArray serviceRecord = manager.getServiceRecordForCustoms(userId, platform);
			System.out.println(platform.name() + " " + ModelReflectiveReader.toString(serviceRecord));
		}
	}
}
