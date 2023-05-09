package com.simplilearn.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.simplilearn.entities.Movies;
import com.simplilearn.service.Adminservice;
import com.simplilearn.service.Movieservice;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Admincontroller {
	
	
	@Autowired
	Adminservice adminservice;
	
	@Autowired
	private Movieservice movieservice;		
	
	
	@PostMapping(value="/movie",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
	public void addMovie(@RequestPart("movie") String movie,@RequestPart("file") MultipartFile file) throws IOException
	{
   	File file1=new File("/home/joseph/angular projects/moviefrontend/src/assets/"+file.getOriginalFilename()); 
	    file1.createNewFile();
	    
	    try (FileOutputStream fout=new FileOutputStream(file1))
	    {
	      fout.write(file.getBytes());	
	    }
	    catch(Exception exe)
	    {
	    	exe.printStackTrace();
	    }
	    Movies newMovie=movieservice.getJson(movie);
	    newMovie.setUrl("assets/"+file.getOriginalFilename());
		movieservice.addMovie(newMovie);
   }
	
	
	@DeleteMapping("/movie/{id}")
	public void deleteMovie(@PathVariable Integer id)
	{
		
		movieservice.deleteMovie(id);
	}
	
	
	@PostMapping("/availability")
	public void updateAvailability(@RequestBody Movies movie)
	{
		movieservice.enableDisableMovie(movie.getId(),movie.isAvailability());
	}
	
    
	 @GetMapping("/movie")
	    public List<Movies> getAllMedicine()
	    {
	        return movieservice.getMovies();
	    }
    
    
   
    
    @GetMapping("/admin")
    public List<com.simplilearn.entities.Admin> getAdmin()
    {
    	return adminservice.getAdmin();
    	
    }
    
}

