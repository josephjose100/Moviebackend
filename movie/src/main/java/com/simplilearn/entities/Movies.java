package com.simplilearn.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Movies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String genre;
	private float price;
	private String language;
	private String description;
	private int availability;
	@OneToOne
	private ShowTiming timings;
	private String url;
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(int id, String name, String genre, float price, String language, String description, int availability,
			ShowTiming timings, String url) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.price = price;
		this.language = language;
		this.description = description;
		this.availability = availability;
		this.timings = timings;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	public ShowTiming getTimings() {
		return timings;
	}
	public void setTimings(ShowTiming timings) {
		this.timings = timings;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
