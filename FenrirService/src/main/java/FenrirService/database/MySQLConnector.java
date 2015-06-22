package FenrirService.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import FenrirService.database.data.DataInterface;

public class MySQLConnector {
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	private void openConnectionDatabase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + DatabaseData.getIp() + ":3306/" + 
					DatabaseData.getDatabase(),
					DatabaseData.getUsername(),
					DatabaseData.getPassword());
			statement = connect.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public <E extends DataInterface> E readDatabase(E e){
		try {
			openConnectionDatabase();
			resultSet = statement.executeQuery(e.buildSelect());
			e.setAll(resultSet);
			closeConnectionDatabase();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return e;
	}
	
	public <E extends DataInterface> void writeDatabase(E e){
		try {
			openConnectionDatabase();
			statement.executeUpdate(e.buildInsert());
			closeConnectionDatabase();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
	
	public <E extends DataInterface> void updateDatabase(E e){
		try {
			openConnectionDatabase();
			statement.executeQuery(e.buildUpdate());
			closeConnectionDatabase();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
	
	public <E extends DataInterface> void deleteDatabase(E e){
		try {
			e = readDatabase(e);
			openConnectionDatabase();
			statement.executeQuery(e.buildDelete());
			closeConnectionDatabase();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
	
	private void closeConnectionDatabase(){
		try {
		      if (resultSet != null) {
		        resultSet.close();
		      }

		      if (statement != null) {
		        statement.close();
		      }

		      if (connect != null) {
		        connect.close();
		      }
		    } catch (Exception e) {

		    }
	}
	
}
