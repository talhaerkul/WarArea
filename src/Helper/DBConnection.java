package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

		Connection connection = null;
	
	public DBConnection() {}
	
	public Connection connectiondbMethod() {
		
		try {
			this.connection = DriverManager.getConnection("jdbc:mariadb://localhost:3325/game?user=root&password=a3110z");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	
}
