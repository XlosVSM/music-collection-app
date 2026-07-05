package xlosvsm.database.mediums;

/**
 * @author Matthew McDermott
 */
public record Cassette(int amount) implements Medium {
	public Cassette {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than 0.");
		}
	}
}
