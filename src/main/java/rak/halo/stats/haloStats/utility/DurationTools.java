package rak.halo.stats.haloStats.utility;

import java.time.Duration;

public class DurationTools {
	
    public static Duration getDuration(String duration){
		return Duration.parse(duration);
    }
    
    public static String toFormattedString(String duration){
    	return toFormattedString(getDuration(duration));
    }
    public static String toFormattedString(Duration duration){
    	return duration.toDays() + " days, " + duration.minusDays(duration.toDays()).toHours() + " hours, " + duration.minusHours(duration.toHours()).toMinutes() + " minutes";
    }

}
