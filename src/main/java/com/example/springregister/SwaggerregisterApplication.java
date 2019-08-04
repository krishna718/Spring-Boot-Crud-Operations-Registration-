package com.example.springregister;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class SwaggerregisterApplication  implements CommandLineRunner  {

	
	@Autowired
	UserRepository userrepository;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	/* @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder SwaggerregisterApplication) {
	        return SwaggerregisterApplication.sources(SwaggerregisterApplication.class);
	    }
	*/
	public static void main(String[] args) {
		SpringApplication.run(SwaggerregisterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Entering -->SwaggerregisterApplication Class-->run method-->adding users");
		userrepository.save(new User("krishna@gmail.com","krishna","password","myaddressssssss",22,'m'));
		userrepository.save(new User("bala@gmail.com","bala","password","myaddressssssss",22,'m'));
		userrepository.save(new User("newuser@gmail.com","newuser","password","myaddressssssss",22,'m'));
		
		logger.info("Exiting -->SwaggerregisterApplication Class-->run method");
		
	}

}
