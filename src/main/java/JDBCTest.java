import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {

		try {
			System.out.println("Conecting to the database...");

			Class.forName("org.mariadb.jdbc.Driver");

			Connection connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/mydb?createDatabaseIfNotExist=true&useSsl=false&useUnicode=true&characterEncoding=UTF-8",
					"root", "123456");

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM product");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt("productId") + " --> " + resultSet.getString("productName") + " -- "
						+ resultSet.getBigDecimal("productPrice"));
				
			}

			System.out.println("Connection estabilished!!!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
