package FenrirService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import FenrirService.representation.login.Auth;

@RestController
public class LoginController {
	
	@RequestMapping("/login")
	public Auth auth(@RequestParam(value="username", defaultValue="None") String username, @RequestParam(value="company", defaultValue="None") String company){
		
		int state = 0;
		
		if(username.equals("None") || company.equals("None")){
			state = 1;
		}else{
			state = 2;
		}
		
		return new Auth(state);
	}

}
