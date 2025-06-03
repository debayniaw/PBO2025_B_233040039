package pertemuan14;

public class DatabaseConnection {
	 private static String connectionString;
	    static {
	        setConnectionString("jdbc:mysql://localhost:3306/mydatabase");
	        System.out.println("Inisialisasi koneksi database telah dilakukan.");
	    }
		public static String getConnectionString() {
			return connectionString;
		}
		public static void setConnectionString(String connectionString) {
			DatabaseConnection.connectionString = connectionString;
		}
}
