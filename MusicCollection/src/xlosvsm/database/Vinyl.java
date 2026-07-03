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
public record Vinyl(int diameter, int RPM, String colour, int amount) implements Medium {
	public Vinyl {
		List<Integer> vinylDiameters = List.of(3, 7, 10, 12);
		List<Integer> vinylRPMs = List.of(16, 33, 45, 78);

		if (!vinylDiameters.contains(diameter)) {
			throw new IllegalArgumentException(
					"Vinyl diameter must be one of the following sizes: " + vinylDiameters.toString());
		}

		if (!vinylRPMs.contains(RPM)) {
			throw new IllegalArgumentException(
					"Vinyl RPM must be one of the following amounts: " + vinylRPMs.toString());
		}

		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than 0.");
		}
	}

	public Vinyl(int diametre, int RPM, int amount) {
		this(diametre, RPM, "Black", amount);
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
