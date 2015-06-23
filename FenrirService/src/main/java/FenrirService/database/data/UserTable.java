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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String buildSelect() {
		if(id != 0){
			return "SELECT * FROM users WHERE id=" + id;
		}else if(name != null){
			return "SELECT * FROM users WHERE username=" + name + " AND company=" + companyName + "";
		}else{
			return "SELECT * FROM users WHERE phone='" + phoneNumber + "'";
		}
	}

	@Override
	public String buildInsert() {
		return "INSERT INTO users (id, username, company, phone) VALUES " + id + "," + name + "," + companyName + "," + phoneNumber;
	}

	@Override
	public String buildUpdate() {
		return "UPDATE users SET username=" + name + ", company=" + companyName + ", phone=" + phoneNumber + " WHERE id=" + id;
	}

	@Override
	public String buildDelete() {
		return "DELETE FROM users WHERE id=" + id;
	}

	@Override
	public void setAll(ResultSet set) {
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
}
