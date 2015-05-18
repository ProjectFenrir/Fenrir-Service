package FenrirService.representation.login;

public class Auth {
	
	private final String message;
	
	public Auth(int state){
		
		switch (state) {
		case 0:
			message = "Error occured in LoginController";
			break;
		case 1:
			message = "Error occured in Parameters";
			break;
		case 2:
			message = "Login succeeded";
			break;
		default:
			message = "";
			break;
		}
	}
	
	public String getMessage(){
		return message;
	}

}
