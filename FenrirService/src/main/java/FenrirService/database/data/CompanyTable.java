package FenrirService.database.data;

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

}
