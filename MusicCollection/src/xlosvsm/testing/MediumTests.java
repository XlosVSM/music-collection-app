package xlosvsm.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import xlosvsm.database.Album;
import xlosvsm.database.CD;
import xlosvsm.database.Cassette;
import xlosvsm.database.Vinyl;

class MediumTests {
	// Cassette checks
	@Test
	public void cassetteTest1() {
		assertThrows(IllegalArgumentException.class, () -> new Cassette(0));
	}

	// CD checks
	@Test
	public void cdTest1() {
		assertThrows(IllegalArgumentException.class, () -> new CD(0));
	}

	// Vinyl checks
	@Test
	public void vinylTest1() {
		assertThrows(IllegalArgumentException.class, () -> new Vinyl(0, 0, 0));
	}
}
