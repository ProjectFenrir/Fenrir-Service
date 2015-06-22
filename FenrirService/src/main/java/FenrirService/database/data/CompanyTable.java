package FenrirService.database.data;

import java.sql.ResultSet;

public class CompanyTable implements DataInterface {
	
	private int id;
	private String name;
	
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

	@Override
	public String buildSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildInsert() {
		return "INSERT INTO company (name) VALUES ('" + name + "')";
	}

	@Override
	public String buildUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDelete() {
		return "DELETE FROM company WHERE id = " + id;
	}

	@Override
	public void setAll(ResultSet set) {
		// TODO Auto-generated method stub
		
	}

}
