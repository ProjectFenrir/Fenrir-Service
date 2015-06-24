package FenrirService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import FenrirService.database.DatabaseDataBuilder;
import FenrirService.logger.FenrirLogging;
/*
 * Main class that functiosn to startup the rest of the backend
 */

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
    	//Set database data
    	DatabaseDataBuilder.setIp("188.166.123.191");
    	DatabaseDataBuilder.setDatabase("fenrir_customers");
    	DatabaseDataBuilder.setUsername("access");
    	DatabaseDataBuilder.setPassword("vXn6dnOcMoObrsacZl3a");
    	
    	//setup logger
    	FenrirLogging.getInstance().setupInstance("C:/Users/Jan/Desktop/test.txt");
    	
    	//startup spring io service
        SpringApplication.run(Application.class, args);
    }

}