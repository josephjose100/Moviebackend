package com.simplilearn.service;

import com.simplilearn.entities.Movies;

public interface Movieservice {

	public void addMovie(Movies movie);
	public void deleteMovie(int id);
	public void updateMovie(Movies movie);
	public void enableDisableMovie(int id,int availability);
	
}
