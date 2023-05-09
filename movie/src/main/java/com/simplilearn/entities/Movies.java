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
	private boolean availability;
	private String timing1;
	private String timing2;
	private String timing3;
	private String url;
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(int id, String name, String genre, float price, String language, String description,
			boolean availability, String timing1, String timing2, String timing3, String url) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.price = price;
		this.language = language;
		this.description = description;
		this.availability = availability;
		this.timing1 = timing1;
		this.timing2 = timing2;
		this.timing3 = timing3;
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
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public String getTiming1() {
		return timing1;
	}
	public void setTiming1(String timing1) {
		this.timing1 = timing1;
	}
	public String getTiming2() {
		return timing2;
	}
	public void setTiming2(String timing2) {
		this.timing2 = timing2;
	}
	public String getTiming3() {
		return timing3;
	}
	public void setTiming3(String timing3) {
		this.timing3 = timing3;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}