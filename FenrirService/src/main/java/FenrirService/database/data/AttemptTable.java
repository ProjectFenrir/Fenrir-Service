package FenrirService.database.data;

import java.sql.ResultSet;
import java.util.Date;

public class AttemptTable implements DataInterface {
	
	private int id;
	private Date stamp;
	private int state;
	private UserTable user;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getStamp() {
		return stamp;
	}
	
	public void setStamp(Date stamp) {
		this.stamp = stamp;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	public UserTable getUser() {
		return user;
	}
	
	public void setUser(UserTable user) {
		this.user = user;
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
