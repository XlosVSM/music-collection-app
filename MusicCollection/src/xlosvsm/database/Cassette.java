package xlosvsm.database;

/**
 * @author Matthew McDermott
 */
public record Cassette(int amount) implements Medium {
	public Cassette {
		assert amount > 0;
	}
}
