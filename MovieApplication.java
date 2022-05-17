package com.me.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.me.Movie.Home.Movie;
import com.me.Movie.Home.MovieRepo;

@SpringBootApplication
public class MovieApplication {
	@Autowired
	private MovieRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args -> {
			repo.save(new Movie("Avatar: Way of Water", "PG-13", 2022));
			repo.save(new Movie("The Batman", "PG-13", 2022));
		};
	}

}
