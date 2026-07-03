package xlosvsm.database;

import java.time.LocalDate;
import java.util.List;

/**
 * The {@code Album} represents an album to be stored in the database.
 * 
 * @param name
 * @param artist
 * @param releaseDate
 * @param publisher
 * @param id
 * @param genres
 * @param obtainedDate
 * @author Matthew McDermott
 */
public record Album(String name, String artist, LocalDate releaseDate, Medium medium, String publisher, String id,
		List<String> genres, LocalDate obtainedDate) {
	public Album(String name, String artist, LocalDate releaseDate, Medium medium, String publisher, String id,
			String genre, LocalDate obtainedDate) {
		this(name, artist, releaseDate, medium, publisher, id, List.of(genre), obtainedDate);
	}

	public Album(String name, String artist, Integer releaseYear, Medium medium, String publisher, String id,
			List<String> genres, LocalDate obtainedDate) {
		this(name, artist, LocalDate.of(releaseYear, 1, 1), medium, publisher, id, genres, obtainedDate);
	}

	public Album(String name, String artist, LocalDate releaseDate, Medium medium, String publisher, String id,
			List<String> genres, Integer obtainedYear) {
		this(name, artist, releaseDate, medium, publisher, id, genres, LocalDate.of(obtainedYear, 1, 1));
	}

	@Override
	public String toString() {
		return "Album Name: " + name;
	}
}
