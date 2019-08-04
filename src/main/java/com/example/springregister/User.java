package com.example.springregister;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class User {

	@Id
	private String username;
	
	@NotEmpty(message = "Please provide a name")
	private String name;
	@NotEmpty(message = "Please provide a password")
	private String password;
	@NotEmpty(message = "Please provide a address")
	private String address;
	@NotNull(message = "Please provide a age")
	private int age;
	private char gender;
	
	
	
	
	public User() {
	
	}



	public User(String username, String name, String password, String address, int age, char gender) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	
}
