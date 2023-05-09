package com.simplilearn.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.simplilearn.entities.Movies;
import com.simplilearn.exception.ResourceNotFoundException;
import com.simplilearn.repository.Moviesrepository;

@Service
public class Movieserviceimpl implements Movieservice {

	@Autowired
	Moviesrepository movierepository;
	
	public void addMovie(Movies movie) {
		movie.setAvailability(true);;
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
	public void enableDisableMovie(int id, boolean availability) {
		
		Movies movie=movierepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		movie.setAvailability(availability);
		movierepository.save(movie);
		
	}

	public Movies getJson(String movie) {
		Movies movieJson=new Movies();
		try {
			ObjectMapper objectmapper=new ObjectMapper();
			movieJson=objectmapper.readValue(movie, Movies.class); 
		}
		catch(IOException err)
		{
			err.printStackTrace();
		}
		return movieJson;
	}

	@Override
	public List<Movies> getMovies() {
		
		return movierepository.findAll();
	}

	
}
