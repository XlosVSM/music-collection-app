package xlosvsm.database;

import java.util.List;
import java.util.Map;

/**
 * @author Matthew McDermott
 */
public record CD(int amount) implements Medium {
	public CD {
		assert amount > 0;
	}

	@Override
	public List<List<String>> tracklist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTracklist(Map<String, Integer> tracklist) {
		// TODO Auto-generated method stub
	}
}
