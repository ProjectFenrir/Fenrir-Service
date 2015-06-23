package FenrirService.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FenrirLogging {
	
	private static FenrirLogging instance = new FenrirLogging();
	Logger logger = Logger.getLogger("FenrirLogger");  
    FileHandler fh;
    SimpleFormatter formatter;
	
	private FenrirLogging(){} //prevent instantiating
	
	public static FenrirLogging getInstance(){
		return instance;
	}
	
	public void setupInstance(String fhPath){
		if(fh == null){
			try {
				fh = new FileHandler(fhPath);
				formatter = new SimpleFormatter();  
				fh.setFormatter(formatter);
				logger.setUseParentHandlers(false);
			} catch (SecurityException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void logSevere(String msg){
		logger.severe(msg);
	}
	
	public void logWarning(String msg){
		logger.warning(msg);
	}
	
	public void logInfo(String msg){
		logger.info(msg);
	}

}
