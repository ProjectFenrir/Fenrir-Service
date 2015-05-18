package FenrirService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	
	// url: <domain>/FenrirService/login?username=<user>&company=<company>
	@RequestMapping("/login")
	public Auth auth(@RequestParam(value="username", defaultValue="None") String username, @RequestParam(value="company", defaultValue="None") String company){
		
		//state variable used in data object to declare return message
		int state = 0;
		
		//If either username or company uses the default values declared by requestParam return 1 else execute authorization attempt.
		if(username.equals("None") || company.equals("None")){
			state = 1;
		}else{
			state = 2;
		}
		
		//Create Auth data object to return message
		return new Auth(state);
	}

}
