package xlosvsm.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import xlosvsm.database.Album;

class DatabaseTest {
	@Test
	public void testAlbum1() {
		Album album = new Album("Amnesiac", null, null, null, null);
		String result = album.toString();
		
		assertEquals("Album Name: Amnesiac", result);
	}
}
