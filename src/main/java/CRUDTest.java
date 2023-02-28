import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CRUDTest {

	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");

			Connection connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/mydb?createDatabaseIfNotExist=true&useSsl=false&useUnicode=true&characterEncoding=UTF-8",
					"root", "123456");

			// Delete using PreparedStatement
			PreparedStatement ps = connection.prepareStatement("DELETE FROM employee WHERE emp_id = ?");

			ps.setInt(1, 103);
			int n = ps.executeUpdate();
			
			System.out.println("Number of rows affected: " + n);
			
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
