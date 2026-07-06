package xlosvsm.database.releases.track;

import java.util.List;
import java.util.Map;

/**
 * @param producers
 * @param musicians
 * @param mixingEngineer
 * @param masteringEngineer
 * @author Matthew McDermott
 */
public record Personnel(List<String> producers, Map<String, String> musicians, String mixingEngineer) {
	public Personnel(String producer, Map<String, String> musicians, String mixingEngineer) {
		this(List.of(producer), musicians, mixingEngineer);
	}
}
