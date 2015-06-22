package FenrirService.database.data;

import java.sql.ResultSet;

public interface DataInterface {
	
	public String buildSelect();
	public String buildInsert();
	public String buildUpdate();
	public String buildDelete();
	public void setAll(ResultSet set);

}
