package FenrirService.database.data;

import java.sql.ResultSet;

public class UserTable implements DataInterface {
	
	private int id;
	private String name;
	private String phoneNumber;
	private CompanyTable company;
	
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
	
	public CompanyTable getCompany() {
		return company;
	}
	
	public void setCompany(CompanyTable company) {
		this.company = company;
	}

	@Override
	public String buildSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildInsert() {
		// TODO Auto-generated method stub
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
		
	}

}
