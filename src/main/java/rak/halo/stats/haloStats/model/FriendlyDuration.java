package rak.halo.stats.haloStats.model;

import java.time.Duration;

public class FriendlyDuration {
	private Duration duration;
	
	public FriendlyDuration(String duration) {
		this.duration = Duration.parse(duration);
	}
	
	@Override
	public String toString(){
		return duration.toDays() + " days, " + duration.minusDays(duration.toDays()).toHours() + " hours, " + duration.minusHours(duration.toHours()).toMinutes() + " minutes";
	}

}
