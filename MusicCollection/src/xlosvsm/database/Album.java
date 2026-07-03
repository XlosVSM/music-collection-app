package xlosvsm.database;

public record Album(String name, String artist, Integer yearOfRelease, String publisher, String id) {
	@Override
	public String toString() {
		return "Album Name: " + name;
	}
}
