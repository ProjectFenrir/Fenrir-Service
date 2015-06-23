package FenrirService.database.data;

import java.sql.ResultSet;
import java.sql.SQLException;
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
		return "SELECT * FROM attempt WHERE user_id=" + user.getId();
	}

	@Override
	public String buildInsert() {
		System.out.println(user.getId() + " is de user Id");
		return "INSERT INTO attempt (state, user_id) VALUES ( 0, " + user.getId() + ")";
	}

	@Override
	public String buildUpdate() {
		return "UPDATE attempt SET state=" + state + " WHERE id=" + id;
	}

	@Override
	public String buildDelete() {
		return "DELETE FROM attempt WHERE id =" + id;
	}

	@Override
	public void setAll(ResultSet set) {		
		try {
			set.last();
			setId(set.getInt("id"));
			setState(set.getInt("id"));
			user.setId(set.getInt("user_id"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
