package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/mydb?createDatabaseIfNotExist=true&useSsl=false&useUnicode=true&characterEncoding=UTF-8",
					"root", "123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
