package FenrirService.database.data;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserTable implements DataInterface {
	
	private int id;
	private String name;
	private String companyName;
	private String phoneNumber;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String buildSelect() {
		if(name != null){
			return "SELECT * FROM users WHERE username='" + name + "'";
		}else{
			return "SELECT * FROM users WHERE number='" + phoneNumber + "'";
		}
	}

	@Override
	public String buildInsert() {
		return null;
	}

	@Override
	public String buildUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDelete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAll(ResultSet set) {
		// TODO Auto-generated method stub
		try {
			while(set.next()){
				System.out.println(set.getInt("id"));
				setId(set.getInt("id"));
				setName(set.getString("username"));
				setCompanyName(set.getString("company"));
				setPhoneNumber(set.getString("phone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
