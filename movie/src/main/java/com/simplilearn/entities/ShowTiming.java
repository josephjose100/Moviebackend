package com.simplilearn.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShowTiming {

	@Id
	int id;
	private String time1;
	private String time2;
	private String time3;
	public ShowTiming() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShowTiming(int id, String time1, String time2, String time3) {
		super();
		this.id = id;
		this.time1 = time1;
		this.time2 = time2;
		this.time3 = time3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public String getTime2() {
		return time2;
	}
	public void setTime2(String time2) {
		this.time2 = time2;
	}
	public String getTime3() {
		return time3;
	}
	public void setTime3(String time3) {
		this.time3 = time3;
	}
	
	
}
