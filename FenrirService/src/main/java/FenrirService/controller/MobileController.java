package FenrirService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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

}
