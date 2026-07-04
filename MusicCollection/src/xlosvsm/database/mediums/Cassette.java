package xlosvsm.database.mediums;

import java.util.List;
import java.util.Map;

/**
 * @author Matthew McDermott
 */
public record Cassette(int amount) implements Medium {
	public Cassette {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than 0.");
		}
	}

	@Override
	public List<List<String>> tracklist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTracklist(Map<String, Integer> tracklist) {
		// TODO Auto-generated method stub=
	}
}
