package rak.halo.stats.haloStats.model.other;

import java.time.Duration;

public class FriendlyDuration {
	private Duration duration;
	
	public FriendlyDuration(String duration) {
		try {
			this.duration = Duration.parse(duration);
		} catch (Exception e){
			this.duration = Duration.ZERO;
		}
	}
	
	public FriendlyDuration(Duration duration) {
		this.duration = duration;
	}

	public FriendlyDuration plus(FriendlyDuration other) {
		return new FriendlyDuration(this.duration.plus(other.duration));
	}
	
	@Override
	public String toString(){
		return duration.toDays() + " days, " + duration.minusDays(duration.toDays()).toHours() + " hours, " + duration.minusHours(duration.toHours()).toMinutes() + " minutes";
	}

}
