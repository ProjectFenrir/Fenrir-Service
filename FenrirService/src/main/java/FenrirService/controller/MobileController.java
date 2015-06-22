package FenrirService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import FenrirService.database.MySQLConnector;
import FenrirService.database.data.AttemptTable;
import FenrirService.database.data.UserTable;
import FenrirService.representation.mobile.*;

@RestController
public class MobileController {
	
	MySQLConnector mysql = new MySQLConnector();
	
	//Get required data for auth <url>/FenrirService/mobile/data?number=<number>
	@RequestMapping("/mobile/data")
	public Data data(@RequestParam(value="number", defaultValue="0") String number){
		// code to get required data from database
		
		return new Data(1);
	}
	
	@RequestMapping("/mobile/auth")
	public Auth auth(@RequestParam(value="number", defaultValue="0") String number, @RequestParam(value="auth", defaultValue="failed") String auth){
		
		//check if number is equal to 0 if so auth cannot succeed so return error
		if(number.equals("0")){
			return new Auth(2);
		}
		
		UserTable user = new UserTable();
		user.setPhoneNumber(number);
		user = mysql.readDatabase(user);
		AttemptTable attempt = new AttemptTable();
		attempt.setUser(user);
		attempt = mysql.readDatabase(attempt);
		
		//check if auth succeeded
		if(!auth.equals("failed")){
			//execude code for succeeded attempt
			attempt.setState(1);
			mysql.updateDatabase(attempt);
			return new Auth(1);
		}else{
			//execude code for failed attempt
			attempt.setState(2);
			mysql.updateDatabase(attempt);			
			return new Auth(0);
		}
		
	}
	
	//Check for new login attempts <url>/FenrirService/mobile/check?number=<number>
	@RequestMapping("/mobile/check")
	public Check check(@RequestParam(value="number", defaultValue="0") String number){
		
		//check if number is not equal to 0
		if(!number.equals("0")){
			//code for checking with database for new login attempts
			
			return new Check(1);
		}else{
			return new Check(0);
		}
		
	}

}
