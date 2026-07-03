package xlosvsm.database;

import java.util.List;

/**
 * @param diameter
 * @param RPM
 * @param amount
 * @param colour
 * @author Matthew McDermott
 */
public record Vinyl(int diametre, int RPM, int amount, String colour) implements Medium {
	public Vinyl {
		List<Integer> vinylDiametres = List.of(3, 7, 10, 12);
		List<Integer> vinylRPMs = List.of(33, 45, 78);

		assert vinylDiametres.contains(diametre);
		assert vinylRPMs.contains(RPM);
		assert amount > 0;
	}
	
	public Vinyl(int diametre, int RPM, int amount) {
		this(diametre, RPM, amount, "Black");
	}
}
