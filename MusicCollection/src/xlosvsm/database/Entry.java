package xlosvsm.database;

import java.time.LocalDate;

import xlosvsm.database.releases.Release;

public record Entry(Release releaseType, LocalDate obtainedDate) {
	// Additional types: Live, Demo
}
