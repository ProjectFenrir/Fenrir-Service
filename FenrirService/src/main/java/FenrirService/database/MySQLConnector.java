package FenrirService.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLConnector {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	private void OpenConnectionDatabase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + DatabaseData.getIp() + "/" + 
					DatabaseData.getDatabase(),
					DatabaseData.getUsername(),
					DatabaseData.getPassword());
			statement = connect.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public <E> E readDatabase(E e){
		
		
		
		return e;
	}
	
	public void writeDatabase(){
		
	}
	
	public void updateDatabase(){
		
	}
	
	public void deleteDatabase(){
		
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
