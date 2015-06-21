package FenrirService.database;

public class DatabaseData {

	private static String ip;
	private static String database;
	private static String username;
	private static String password;

	public static String getIp() {
		return ip;
	}

	protected static void setIp(String ip) {
		DatabaseData.ip = ip;
	}

	public static String getDatabase() {
		return database;
	}

	protected static void setDatabase(String database) {
		DatabaseData.database = database;
	}

	public static String getUsername() {
		return username;
	}

	protected static void setUsername(String username) {
		DatabaseData.username = username;
	}

	public static String getPassword() {
		return password;
	}

	protected static void setPassword(String password) {
		DatabaseData.password = password;
	}

}
