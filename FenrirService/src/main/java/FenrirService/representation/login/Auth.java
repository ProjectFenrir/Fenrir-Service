package FenrirService.representation.login;

/*
 * ====================================================================================
 * Auth data object required by REST for returning the proper information. This data
 * object is used for return messages for an authorization attempt by Fenrir Login API
 * ====================================================================================
 */

public class Auth {
	
	// message and state variable to be returned to the Fenrir Login API
	private final String message;
	private final int state;
	
	// Creation of data object requires state. State declares informational message to be sent back.
	public Auth(int state){
		
		this.state = state;
		
		//switch declaring content of message
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
	
	public int getState(){
		return state;
	}
	
	public String getMessage(){
		return message;
	}

}
