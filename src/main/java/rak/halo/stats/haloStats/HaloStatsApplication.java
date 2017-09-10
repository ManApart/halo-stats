package rak.halo.stats.haloStats;

import rak.halo.stats.haloStats.model.carnageReport.CarnageReport;
import rak.halo.stats.haloStats.model.enums.Platform;
import rak.halo.stats.haloStats.utility.ModelReflectiveReader;

public class HaloStatsApplication {
	private static final String userId = "iceburg 33308";
//	private static final String userId = "danceparty17";

	public static void main(String[] args) {
		HaloStatManager manager = new HaloStatManager();

		for (Platform platform : Platform.values()){
//			ServiceRecordArray result = manager.getServiceRecordForCustoms(userId, platform);
			CarnageReport result = manager.getLatestMatchResult(userId, platform);
//			PlayerStatResults result = manager.getPlayerMatchHistory(userId, platform, null, 0, 1);
//			PlayerStatResults result = manager.getPlayerMatchHistory(userId, platform, new GameMode[]{GameMode.CUSTOM}, 0, 1);
			System.out.println(platform.name() + " " + ModelReflectiveReader.toString(result));
		}
	}
}
