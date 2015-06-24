package FenrirService.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * Fenrir logging is a singleton object that takes care of logging to a file
 */

public class FenrirLogging {
	
	private static FenrirLogging instance = new FenrirLogging();
	Logger logger = Logger.getLogger("FenrirLogger");  
    FileHandler fh;
    SimpleFormatter formatter;
	
	private FenrirLogging(){} //prevent instantiating
	
	//returns the singleton object
	public static FenrirLogging getInstance(){
		return instance;
	}
	
	//sets up the instance
	public void setupInstance(String fhPath){
		if(fh == null){
			try {
				fh = new FileHandler(fhPath);
		        logger.addHandler(fh);
				formatter = new SimpleFormatter();  
				fh.setFormatter(formatter);
				logger.setUseParentHandlers(false);
			} catch (SecurityException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//log severe mesage
	public void logSevere(String msg){
		logger.severe(msg);
	}
	
	//log wanring message
	public void logWarning(String msg){
		logger.warning(msg);
	}
	
	//log info message
	public void logInfo(String msg){
		logger.info(msg);
	}

}
