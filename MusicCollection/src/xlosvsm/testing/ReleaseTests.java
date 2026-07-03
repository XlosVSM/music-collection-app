package xlosvsm.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import xlosvsm.database.Album;
import xlosvsm.database.Vinyl;

class ReleaseTests {
	// Album checks
	@Test
	public void testAlbum1() {
		Album album = new Album("Amnesiac", null, 2001, null, null, null, List.of());
		String result = album.toString();

		assertEquals("Album Name: Amnesiac", result);
	}

	@Test
	public void testAlbum2() {
		Album album = new Album("Amnesiac", "Radiohead", 2001, null, null, null, List.of());
		String result = album.toString();

		assertEquals("Album Name: Amnesiac", result);
	}

	@Test
	public void testAlbum3() {
		Album album = new Album("Amnesiac", "Radiohead", null, null, null, null, "Alternative Rock");
		String result = album.toString();

		assertEquals("Album Name: Amnesiac", result);
	}

	@Test
	public void testAlbum4() {
		Album album = new Album("Amnesiac", "Radiohead", 2001, null, null, null, List.of("Alternative Rock"));
		String result = album.toString();

		assertEquals("Album Name: Amnesiac", result);
	}

	@Test
	public void testAlbum5() {
		Album album = new Album("Nowhere", "Ride", LocalDate.of(2022, 11, 4), new Vinyl(12, 33, "Transparent Blue", 1),
				"Wichita", "WEBB572LP", List.of("Alternative Rock"));
		String result = album.toString();

		assertEquals("Album Name: Nowhere", result);
	}

	// EP checks

	// Single checks

}
