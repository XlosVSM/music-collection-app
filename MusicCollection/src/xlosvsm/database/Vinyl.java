package xlosvsm.database;

import java.util.List;

/**
 * @param diameter
 * @param RPM
 * @param amount
 * @param colour
 * @author Matthew McDermott
 */
public record Vinyl(int diameter, int RPM, int amount, String colour) implements Medium {
	public Vinyl {
		List<Integer> vinylRPMs = List.of(33, 45, 78);

		assert vinylRPMs.contains(RPM);
	}
}
