package xlosvsm.database;

/**
 * @author Matthew McDermott
 */
public record CD(int amount) implements Medium {
	public CD {
		assert amount > 0;
	}
}
