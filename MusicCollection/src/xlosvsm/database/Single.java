package xlosvsm.database;

import java.time.LocalDate;
import java.util.List;

public record Single(String name, String artist, LocalDate releaseDate, Medium medium, String publisher, String id,
		List<String> genres) implements Release {

}
