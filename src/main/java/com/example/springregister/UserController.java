package com.example.springregister;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class UserController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserRepository userrepository;
	@GetMapping("/allusers")
	public List<User> getAllusers(){
		logger.info("entered -->UserController Class-->getAllusers method -->with parameters username,user,password,address,age,gender");
		return userrepository.findAll();
		
	}
	//get function
	@GetMapping("/{username}")
	public User getEmployeeById(@PathVariable(name="username") String username) {
		if(username.equalsIgnoreCase("krishna@gmail.com")) {
			throw new RuntimeException("Something Went Wrong");
		}
		
		logger.info("entered -->UserController Class-->getEmployeeById method -->with parameters username,user,password,address,age,gender\");");
		logger.info("exiting  -->UserController Class-->getEmployeeById method -->with parameters username,user,password,address,age,gender\");");
		
		return userrepository.getOne(username);
	}
	
	//post function
	
	@PostMapping("/saveusers")
	public String saveUsers(@RequestBody User user){
		logger.info("entered  saveusers method");
		userrepository.save(user);
		return "user registered successfully into database";
	}
	//delete function

	@DeleteMapping("/deleteuser/{username}")
	public String deleteById(String username){
		logger.info("entered  deletebyId method");
		userrepository.deleteById(username);
		return "Deleting user success";
	}
	
	
	
}
