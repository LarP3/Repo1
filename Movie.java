package com.me.Movie.Home;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title, rating;
	private int yrReleased;
	public Movie() {}
	public Movie(String title, String rating, int yrReleased) {
		super();
		this.title = title;
		this.rating = rating;
		this.yrReleased = yrReleased;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getYrReleased() {
		return yrReleased;
	}
	public void setYrReleased(int yrReleased) {
		this.yrReleased = yrReleased;
	}
	
	
	
}
