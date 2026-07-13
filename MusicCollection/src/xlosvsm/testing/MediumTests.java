package xlosvsm.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import xlosvsm.database.mediums.CD;
import xlosvsm.database.mediums.Cassette;
import xlosvsm.database.mediums.Vinyl;

class MediumTests {
	// Cassette checks //
	// Illegal argument tests
	@Test
	public void illegalCassetteTest() {
		assertThrows(IllegalArgumentException.class, () -> new Cassette(0));
	}

	// toString test
	@Test
	public void cassetteToStringTest1() {
		Cassette cassette = new Cassette(1);

		assertEquals("Black Cassette", cassette.toString());
	}
	
	@Test
	public void cassetteToStringTest2() {
		Cassette cassette = new Cassette(2);

		assertEquals("2 Black Cassette", cassette.toString());
	}
	
	@Test
	public void cassetteToStringTest3() {
		Cassette cassette = new Cassette("Transparent", 1);

		assertEquals("Transparent Cassette", cassette.toString());
	}
	
	@Test
	public void cassetteToStringTest4() {
		Cassette cassette = new Cassette("Transparent", 2);

		assertEquals("2 Transparent Cassette", cassette.toString());
	}

	// CD checks //
	// Illegal argument tests
	@Test
	public void illegalCDTest() {
		assertThrows(IllegalArgumentException.class, () -> new CD(0));
	}

	// toString test
	@Test
	public void cdToStringTest1() {
		CD cd = new CD(1);

		assertEquals("CD", cd.toString());
	}
	
	@Test
	public void cdToStringTest2() {
		CD cd = new CD(2);

		assertEquals("2 CD", cd.toString());
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

	// toString() tests	
	@Test
	public void vinylToStringTest1() {
		Vinyl vinyl = new Vinyl(12, 33, 1);

		assertEquals("Black Vinyl (12\" @ 33RPM)", vinyl.toString());
	}

	@Test
	public void vinylToStringTest2() {
		Vinyl vinyl = new Vinyl(12, 45, 1);

		assertEquals("Black Vinyl (12\" @ 45RPM)", vinyl.toString());
	}

	@Test
	public void vinylToStringTest3() {
		Vinyl vinyl = new Vinyl(12, 33, "Orange", 1);

		assertEquals("Orange Vinyl (12\" @ 33RPM)", vinyl.toString());
	}

	@Test
	public void vinylToStringTest4() {
		Vinyl vinyl = new Vinyl(12, 33, 2);

		assertEquals("2 Black Vinyl (12\" @ 33RPM)", vinyl.toString());
	}
}
