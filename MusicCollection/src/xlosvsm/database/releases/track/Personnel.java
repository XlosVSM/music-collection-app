package xlosvsm.database.releases.track;

import java.util.List;
import java.util.Map;

public record Personnel(List<String> producers, Map<String, String> musicians, String mixingEngineer,
		String masteringEngineer) {
	public Personnel(String producer, Map<String, String> musicians, String mixingEngineer, String masteringEngineer) {
		this(List.of(producer), musicians, mixingEngineer, masteringEngineer);
	}
}
