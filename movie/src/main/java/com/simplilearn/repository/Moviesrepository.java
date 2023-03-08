package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entities.Movies;

@Repository
public interface Moviesrepository extends JpaRepository<Movies, Integer>{

}
