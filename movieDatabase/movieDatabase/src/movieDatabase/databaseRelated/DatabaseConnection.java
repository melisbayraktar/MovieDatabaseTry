package movieDatabase.databaseRelated;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	private String userName = "postgres"; // Informations needed to connect pgadmin
	private String password = "root";
	private String url = "jdbc:postgresql://localhost/movie_db";

	private static DatabaseConnection instance; // Singelton type connect instance

	public DatabaseConnection() {

	}

	public static DatabaseConnection getInstance() {
		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}

	public Connection connect() {
		Connection mConnector = null;

		try {
			mConnector = DriverManager.getConnection(url, userName, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mConnector;
	}

	public void stringSender(String s) {
		Connection mConnector = null;
		try {
			mConnector = DriverManager.getConnection(url, userName, password);
			Statement stm = mConnector.createStatement();
			stm.executeUpdate(s);
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void stringGetter(String s) {
		Connection mConnector = null;

		try {
			mConnector = DriverManager.getConnection(url, userName, password);
			Statement stm = mConnector.createStatement();
			ResultSet rs = stm.executeQuery(s);

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
