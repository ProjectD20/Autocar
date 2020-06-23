package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.models.Arret_Bus;
import com.example.demo.models.Ville;
import com.example.demo.repository.Arret_BusRepository;
import com.example.demo.repository.VilleRepository;
import com.sun.el.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	 @Bean
	    CommandLineRunner init(Arret_BusRepository arretRepository , VilleRepository villeRepository) {
	        return args -> {
	        	//delete all object in data base
	        	arretRepository.deleteAll();
	        	villeRepository.deleteAll();
	        	//ajout statique des 4 Ville exemple dans la base
		        Ville lille=new Ville("Lille");
		        villeRepository.save(lille);
		        Ville paris=new Ville("Paris");
		        villeRepository.save(paris);
		        Ville arras=new Ville("Arras");
		        villeRepository.save(arras);
		        Ville Compiegne=new Ville("Compiegne");
		        villeRepository.save(Compiegne);
	        //ajout statique des 3 Ville exemple dans la base 
		        Arret_Bus ab1=new Arret_Bus(lille.getId(),arras.getId(),paris.getId(),53);
		        Arret_Bus ab2=new Arret_Bus(lille.getId(),Compiegne.getId(),paris.getId(),149);

		        arretRepository.save(ab1);
	        	arretRepository.save(ab2);
	        	arretRepository.findAll().forEach(System.out::println);
	        	villeRepository.findAll().forEach(System.out::println);
	        	
	        };
	    }

}
