package rak.halo.stats.haloStats;

import rak.halo.stats.haloStats.model.enums.Platform;
import rak.halo.stats.haloStats.model.playerMatches.PlayerStatResults;
import rak.halo.stats.haloStats.utility.ModelReflectiveReader;

public class HaloStatsApplication {
	private static final String userId = "iceburg 33308";
//	private static final String userId = "danceparty17";

	public static void main(String[] args) {
		HaloStatManager manager = new HaloStatManager();

		for (Platform platform : Platform.values()){
//			ServiceRecordArray result = manager.getServiceRecordForCustoms(userId, platform);
			PlayerStatResults result = manager.getPlayerMatchHistory(userId, platform);
			System.out.println(platform.name() + " " + ModelReflectiveReader.toString(result));
		}
	}
}
