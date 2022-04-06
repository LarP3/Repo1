package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.petdatabase.Pet;
import com.example.demo.petdatabase.Petrepository;
import com.example.demo.petdatabase.Owner;
import com.example.demo.petdatabase.Ownerrepository;

@SpringBootApplication
public class PetStoreApplication {
	@Autowired
	private Petrepository repo;
	
	@Autowired
	private Ownerrepository ownerRepo;
	public static void main(String[] args) {
		SpringApplication.run(PetStoreApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args -> {
			//Database data
			
			Owner owner1 = new Owner("James", "Smith");
			Owner owner2 = new Owner("Sue", "Smith");
			ownerRepo.save(owner1);
			ownerRepo.save(owner2);
			
			Pet pet = new Pet("Fish", "Goldfish", 13, 2, owner2);
			repo.save(pet);
			
			pet = new Pet("Dog", "Akita", 300, 1, owner1 );
			repo.save(pet);
			pet = new Pet("Cat", "Persian", 400, 1, owner1);
			repo.save(pet);
			
			
			
		};
		}
	}

