package xlosvsm.database.releases;

/**
 * @param minutes
 * @param seconds
 * @author Matthew McDermott
 */
public record Duration(int minutes, int seconds) {
	public Duration {
		if (minutes < 0) {
			throw new IllegalArgumentException("Minutes cannot be negative.");
		}

		if (seconds < 0 || seconds >= 60) {
			throw new IllegalArgumentException("Seconds must be between 0 and 59.");
		}
	}
	
	public static Duration of(int minutes, int seconds) {
		return new Duration(minutes, seconds);
	}

	@Override
	public String toString() {
		return minutes + ":" + seconds;
	}
}
