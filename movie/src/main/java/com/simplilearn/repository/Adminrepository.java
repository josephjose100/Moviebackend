package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entities.Admin;

@Repository
public interface Adminrepository extends JpaRepository<Admin, Integer> {

}
