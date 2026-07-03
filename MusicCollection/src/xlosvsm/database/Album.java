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
public record Album(String name, String artist, LocalDate releaseDate, String publisher, String id, List<String> genres,
		LocalDate obtainedDate) {
	// Date firstDate1 = new Date(int year, int month, int date);
	public Album(String name, String artist, LocalDate releaseDate, String publisher, String id, String genre, LocalDate obtainedDate) {
		this(name, artist, releaseDate, publisher, id, List.of(genre), obtainedDate);
	}
	
	@Override
	public String toString() {
		return "Album Name: " + name;
	}
}
