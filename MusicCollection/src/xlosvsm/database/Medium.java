package xlosvsm.database;

import java.util.List;
import java.util.Map;

/**
 * @author Matthew McDermott
 */
public interface Medium {
	int amount();

	List<List<String>> tracklist();
	
	/**
	 * Adds a new track listing to end of list
	 * @param tracklist
	 */
	public void addTracklist(Map<String, Integer> tracklist);
}
