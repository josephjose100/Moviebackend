package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entities.Users;


public interface Userservice {

	public void registerUser(Users user);
	public List<Users> getallUsers();
}
