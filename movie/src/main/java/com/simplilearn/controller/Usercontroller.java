package com.simplilearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entities.Users;
import com.simplilearn.service.Userservice;

@CrossOrigin(origins = "*")
@RestController
public class Usercontroller {

	Logger logger = LoggerFactory.getLogger(Usercontroller.class);
	
	@Autowired
	private Userservice userservice;
	
	@PostMapping("/user")
	public void registerUser(@RequestBody Users user)
	{
		
		userservice.registerUser(user);
		logger.info("name>>>{}",user.getName());
	}
	
	@GetMapping("/user")
	public List<Users> getAllUsers()
	{
		return userservice.getallUsers();
	}
	
}
