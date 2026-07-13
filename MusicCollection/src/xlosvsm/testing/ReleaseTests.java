package xlosvsm.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import xlosvsm.database.mediums.Vinyl;
import xlosvsm.database.releases.Album;

class ReleaseTests {
	// Duration tests //
	// Illegal argument tests

	// toString test

	// Track tests //
	// Illegal argument tests

	// toString test

	// Album tests //
	// Illegal argument tests
	@Test
	public void illegalAlbumTest1() {
		assertThrows(IllegalArgumentException.class,
				() -> new Album("Amnesiac", "", 2001, null, null, null, List.of(), List.of()));
	}

	// toString test
	@Test
	public void albumToStringTest1() {
		Album album = new Album("Amnesiac", "Radiohead", 2001, null, null, null, List.of(), List.of());
		String result = album.toString();

		assertEquals("Amnesiac by Radiohead (2001)", result);
	}

	@Test
	public void albumToStringTest2() {
		Album album = new Album("Nowhere", "Ride", LocalDate.of(1990, 10, 15), new Vinyl(12, 33, "Transparent Blue", 1),
				"Wichita", "WEBB572LP", List.of("Alternative Rock"), List.of());
		String result = album.toString();

		assertEquals("Nowhere by Ride (1990)", result);
	}

	// EP tests //
	// Illegal argument tests

	// toString test

	// Single tests //
	// Illegal argument tests

	// toString test
}
