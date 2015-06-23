package FenrirService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import FenrirService.database.MySQLConnector;
import FenrirService.database.data.AttemptTable;
import FenrirService.database.data.UserTable;
import FenrirService.logger.FenrirLogging;
import FenrirService.representation.login.Auth;

/*
 * ====================================================================================
 * LoginController is used to manage anything related to the Fenrir Login API.
 * It will create the required request mappings and execute the backend functionalities
 * required to make a successful authorization attempt.
 * ====================================================================================
 */

@RestController
public class LoginController {
	
	MySQLConnector mysql = new MySQLConnector();
	
	// url: <domain>/FenrirService/login?username=<user>&company=<company>
	@RequestMapping("/login")
	public Auth auth(@RequestParam(value="username", defaultValue="None") String username, @RequestParam(value="company", defaultValue="None") String company){
		
		//state variable used in data object to declare return message
		int state = 0;
		
		//If either username or company uses the default values declared by requestParam return 1 else execute authorization attempt.
		if(username.equals("None") || company.equals("None")){
			state = 1;
			FenrirLogging.getInstance().logInfo("Invalid login attempt");
		}else{
			UserTable user = new UserTable();
			user.setName(username);
			user.setCompanyName(company);
			user = mysql.readDatabase(user);
			AttemptTable attempt = new AttemptTable();
			attempt.setUser(user);
			mysql.writeDatabase(attempt);			
			state=2;
			FenrirLogging.getInstance().logInfo(user.getName() + " has logged in");
		}
		
		//Create Auth data object to return message
		return new Auth(state);
	}

}
