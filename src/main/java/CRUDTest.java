import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDTest {

	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");

			Connection connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/mydb?createDatabaseIfNotExist=true&useSsl=false&useUnicode=true&characterEncoding=UTF-8",
					"root", "123456");

			Statement statement = connection.createStatement();
			int n = statement.executeUpdate("CREATE TABLE employee(emp_id int, emp_name varchar(30), emp_salary int)");
			
			System.out.println("Number of rows affected: " + n);
			
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
