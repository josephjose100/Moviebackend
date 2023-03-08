package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entities.Users;
import com.simplilearn.repository.Userrepository;

@Service
public class Userserviceimpl implements Userservice {

	@Autowired
	Userrepository userrepository;
	
	public void registerUser(Users user) {
		userrepository.save(user);
		
	}

	
	public List<Users> getallUsers() {
		return userrepository.findAll();
	}

}
