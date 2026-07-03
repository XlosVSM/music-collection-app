package xlosvsm.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import xlosvsm.database.Album;

class DatabaseTest {
	@Test
	public void testAlbum1() {
		Album album = new Album("Amnesiac", null, null, null, null, List.of(), null);
		String result = album.toString();

		assertEquals("Album Name: Amnesiac", result);
	}

	@Test
	public void testAlbum2() {
		Album album = new Album("Amnesiac", "Radiohead", null, null, null, List.of(), null);
		String result = album.toString();

		assertEquals("Album Name: Amnesiac", result);
	}

	@Test
	public void testAlbum3() {
		Album album = new Album("Amnesiac", "Radiohead", null, null, null, "Alternative Rock", null);
		String result = album.toString();

		assertEquals("Album Name: Amnesiac", result);
	}
	
	@Test
	public void testAlbum4() {
		Album album = new Album("Amnesiac", "Radiohead", null, null, null, List.of("Alternative Rock"), LocalDate.of(2026, 7, 3));
		String result = album.toString();

		assertEquals("Album Name: Amnesiac", result);
	}
}
