package FenrirService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import FenrirService.database.DatabaseDataBuilder;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
    	DatabaseDataBuilder.setIp("188.166.123.191");
    	DatabaseDataBuilder.setDatabase("FenrirSecurity");
    	DatabaseDataBuilder.setUsername("access");
    	DatabaseDataBuilder.setPassword("vXn6dnOcMoObrsacZl3a");
    	
    	//Test test = new Test();
    	
        SpringApplication.run(Application.class, args);
    }

}