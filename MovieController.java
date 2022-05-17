package com.me.Movie.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.Movie.Home.Movie;
import com.me.Movie.Home.MovieRepo;

@RestController
public class MovieController {
	@Autowired
	private MovieRepo repo;
	@RequestMapping("/movies")
	public Iterable<Movie> getMovie() {
		return repo.findAll();
	}
}
