package xlosvsm.database.releases;

import java.time.LocalDate;
import java.util.List;

import xlosvsm.database.mediums.Medium;
import xlosvsm.database.releases.track.Track;

public record Single(String name, String artist, LocalDate releaseDate, Medium medium, String publisher, String id,
		List<String> genres, List<List<Track>> trackListings) implements Release {
	@Override
	public String toString() {
		return String.format("%s by %s (%d)", name, artist, releaseDate.getYear());
	}
}
