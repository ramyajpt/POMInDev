package week9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DBConnection {
	@Test
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://13.232.48.225:3306/opentaps", "dbuser", "test@123");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select PARTY_ID from opentaps.person");
		while(result.next()) {
			String ID = result.getString("PARTY_ID");
			System.out.println(ID);
		}
		result.close();
		statement.close();
		connection.close();
	}

}
