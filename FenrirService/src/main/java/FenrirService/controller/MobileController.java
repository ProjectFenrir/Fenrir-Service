package FenrirService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import FenrirService.representation.mobile.*;

@RestController
public class MobileController {
	
	@RequestMapping("/mobile/data")
	public Data data(){
		return new Data();
	}
	
	@RequestMapping("/mobile/auth")
	public Auth auth(){
		return new Auth();
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
