package xlosvsm.database.mediums;

/**
 * @author Matthew McDermott
 */
public record CD(int amount) implements Medium {
	public CD {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than 0.");
		}
	}
	
	@Override
	public String toString() {
		return "CD";
	}
}
