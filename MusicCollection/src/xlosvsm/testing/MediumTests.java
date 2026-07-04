package xlosvsm.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import xlosvsm.database.mediums.CD;
import xlosvsm.database.mediums.Cassette;
import xlosvsm.database.mediums.Vinyl;

class MediumTests {
	// Cassette checks
	/**
	 * Check that all IllegalArgumentExceptions are thrown
	 */
	@Test
	public void cassetteTest1() {
		assertThrows(IllegalArgumentException.class, () -> new Cassette(0));
	}

	// CD checks
	/**
	 * Check that all IllegalArgumentExceptions are thrown
	 */
	@Test
	public void cdTest1() {
		assertThrows(IllegalArgumentException.class, () -> new CD(0));
	}

	// Vinyl checks //
	// Illegal argument tests
	@Test
	public void illegalVinylTest1() {
		assertThrows(IllegalArgumentException.class, () -> new Vinyl(0, 33, 1));
	}

	@Test
	public void illegalVinylTest2() {
		assertThrows(IllegalArgumentException.class, () -> new Vinyl(12, 0, 1));
	}

	@Test
	public void illegalVinylTest3() {
		assertThrows(IllegalArgumentException.class, () -> new Vinyl(12, 33, 0));
	}

	@Test
	public void illegalVinylTest4() {
		assertThrows(IllegalArgumentException.class, () -> new Vinyl(0, 0, 0));
	}
}
