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
			// CREATE A TABLE EMPOYEE
			//int n = statement.executeUpdate("CREATE TABLE employee(emp_id int, emp_name varchar(30), emp_salary int)");
			
			// INSERT A NEW ROW INSERT COMMAND
			//int n = statement.executeUpdate("INSERT INTO employee VALUES(103, 'Employee C', 7000)");
			//int n = statement.executeUpdate("INSERT INTO employee(emp_id, emp_name) VALUES(104, 'Employee D')");
			
			// UPDATE ROW COMMAND
			//int n = statement.executeUpdate("UPDATE employee SET emp_salary = 11000 WHERE emp_id = 104");
			//int n = statement.executeUpdate("UPDATE employee SET emp_salary = 5000 WHERE emp_salary > 1000");
			
			// DELETE RECORD COMMAND
			int n = statement.executeUpdate("DELETE FROM empoyee WHERE emp_id = 104");
			
			System.out.println("Number of rows affected: " + n);
			
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
