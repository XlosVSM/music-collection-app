package xlosvsm.database;

import java.time.LocalDate;
import java.util.List;

/**
 * The {@code Release} represents any to be stored in the database, to cover Albums, EPs, and Singles.
 * 
 * @author Matthew McDermott
 */
public interface Release {
	String name();

	String artist();

	LocalDate releaseDate();

	Medium medium();

	String publisher();

	String id();

	List<String> genres();
}
