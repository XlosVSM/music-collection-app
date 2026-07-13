package xlosvsm.database.releases;

import java.time.LocalDate;
import java.util.List;

import xlosvsm.database.mediums.Medium;
import xlosvsm.database.releases.track.Track;

public record Album(String name, String artist, LocalDate releaseDate, Medium medium, String publisher, String id,
		List<String> genres, List<List<Track>> trackListings) implements Release {
	public Album(String name, String artist, LocalDate releaseDate, Medium medium, String publisher, String id,
			String genre, List<List<Track>> trackListings) {
		this(name, artist, releaseDate, medium, publisher, id, List.of(genre), trackListings);
	}

	public Album(String name, String artist, Integer releaseYear, Medium medium, String publisher, String id,
			List<String> genres, List<List<Track>> trackListings) {
		this(name, artist, LocalDate.of(releaseYear, 1, 1), medium, publisher, id, genres, trackListings);
	}

	@Override
	public String toString() {
		return name + "by" + artist + "(" + releaseDate.getYear() + ")";
	}
}