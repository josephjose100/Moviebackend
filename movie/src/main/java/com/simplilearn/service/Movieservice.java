package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entities.Movies;

public interface Movieservice {

	public void addMovie(Movies movie);
	public void deleteMovie(int id);
	public void updateMovie(Movies movie);
	public void enableDisableMovie(int id,boolean availability);
	public Movies getJson(String movie);
	public List<Movies> getMovies();
}
