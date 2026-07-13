package xlosvsm.database.releases.track;

public record Track(String title, Duration duration, TrackPersonnel personnel) {
	@Override
	public String toString() {
		return title + "(" + duration.toString() + ")";
	}
}
