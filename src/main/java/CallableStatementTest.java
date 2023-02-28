import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementTest {

	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");

			Connection connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/mydb?createDatabaseIfNotExist=true&useSsl=false&useUnicode=true&characterEncoding=UTF-8",
					"root", "123456");

			// Callable Statement
			CallableStatement cs = connection.prepareCall("{call getEmployeeById(?, ?, ?)}");
			cs.setInt(1, 101);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			int n = cs.executeUpdate();

			System.out.println("Name: " + cs.getString(2) + " - Salary: " + cs.getInt(3));

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// Callable Statement insertEmployee
//DROP PROCEDURE IF EXISTS insertEmployee;

// Callable Statement getEmployeeById
//CREATE OR REPLACE PROCEDURE getEmployeeById (
//eid INT,
//OUT ename VARCHAR(30),
//OUT esal INT)
//BEGIN
//  SELECT emp_name, emp_salary INTO ename, esal FROM employee;  
//END;
