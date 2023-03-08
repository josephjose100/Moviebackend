package com.simplilearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entities.Movies;
import com.simplilearn.exception.ResourceNotFoundException;
import com.simplilearn.repository.Moviesrepository;

@Service
public class Movieserviceimpl implements Movieservice {

	@Autowired
	Moviesrepository movierepository;
	
	public void addMovie(Movies movie) {
		movierepository.save(movie);
		
	}

	@Override
	public void deleteMovie(int id) {
		Movies movie=movierepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		movierepository.delete(movie); 
		
	}

	@Override
	public void updateMovie(Movies movie) {
		movierepository.save(movie);
		
	}

	@Override
	public void enableDisableMovie(int id, int availability) {
		
		Movies movie=movierepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		movie.setAvailability(availability);
		movierepository.save(movie);
		
	}

	
}
