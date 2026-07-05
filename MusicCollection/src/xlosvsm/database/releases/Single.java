package xlosvsm.database.releases;

import java.time.LocalDate;
import java.util.List;

import xlosvsm.database.mediums.Medium;

public record Single(String name, String artist, LocalDate releaseDate, Medium medium, String publisher, String id,
		List<String> genres) implements Release {

}
