package xlosvsm.database.releases;

public record Duration(int minutes, int seconds) {
	@Override
	public String toString() {
		return minutes + ":" + seconds;
	}
}
