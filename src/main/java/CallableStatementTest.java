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
			CallableStatement cs = connection.prepareCall("{call insertEmployee(?, ?, ?)}");
			cs.setInt(1, 101);
			cs.setString(2, "EmployeeA");
			cs.setInt(3, 9000);
			int n = cs.executeUpdate();

			System.out.println("Number of rows affected: " + n);

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// Callable Statement insertEmployee
//DROP PROCEDURE IF EXISTS insertEmployee;
/*
 * EXAMPLE insertEmployee STORED PROCEDURE MARIADB CREATE OR REPLACE PROCEDURE
 * insertEmployee (eid INT, ename VARCHAR(30), esal INT) BEGIN INSERT INTO
 * mydb.employee VALUES(eid, ename, esal); END;
 * 
 */