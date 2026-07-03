package xlosvsm.database;

import java.util.List;
import java.util.Map;

/**
 * @param diameter
 * @param RPM
 * @param amount
 * @param colour
 * @author Matthew McDermott
 */
public record Vinyl(int diameter, int RPM, int amount, String colour) implements Medium {
	public Vinyl {
		List<Integer> vinylDiameters = List.of(3, 7, 10, 12);
		List<Integer> vinylRPMs = List.of(16, 33, 45, 78);

		assert vinylDiameters.contains(diameter);
		assert vinylRPMs.contains(RPM);
		assert amount > 0;
	}

	public Vinyl(int diametre, int RPM, int amount) {
		this(diametre, RPM, amount, "Black");
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
