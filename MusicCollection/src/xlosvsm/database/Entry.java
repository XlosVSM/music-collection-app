package xlosvsm.database;

import java.time.LocalDate;
import java.util.List;

import xlosvsm.database.releases.Release;

public record Entry(Release releaseType, List<String> additionalTypes, LocalDate obtainedDate) {
	// Additional types: Live, Demo
	public Entry(Release releaseType, LocalDate obtainedDate) {
		this(releaseType, List.of(), obtainedDate);
	}
}
