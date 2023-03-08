package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entities.Admin;
import com.simplilearn.repository.Adminrepository;

@Service
public class Adminserviceimpl implements Adminservice {

	@Autowired
	Adminrepository adminrepository;
	
	@Override
	public List<Admin> getAdmin() {
		
		return adminrepository.findAll();
	}

}
