package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entities.Users;

@Repository
public interface Userrepository extends JpaRepository<Users, Integer> {

	
}
