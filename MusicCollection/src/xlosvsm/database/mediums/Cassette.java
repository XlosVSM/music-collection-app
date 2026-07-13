package xlosvsm.database.mediums;

/**
 * @author Matthew McDermott
 */
public record Cassette(String colour, int amount) implements Medium {
	public Cassette {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than 0.");
		}
	}

	public Cassette(int amount) {
		this("Black", amount);
	}

	@Override
	public String toString() {
		return String.format("%s%s Cassette", amount != 1 ? amount + " " : "", colour);
	}
}
