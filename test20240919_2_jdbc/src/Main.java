import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


	public static void main(String[] args) {

		String driver="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","676100nbc");
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
