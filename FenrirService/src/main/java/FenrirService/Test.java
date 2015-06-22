package FenrirService;

import FenrirService.database.MySQLConnector;
import FenrirService.database.data.CompanyTable;

public class Test {
	
	public Test(){
		MySQLConnector con = new MySQLConnector();
		CompanyTable company = new CompanyTable();
		company.setName("test");
		con.writeDatabase(company);
	}

}
