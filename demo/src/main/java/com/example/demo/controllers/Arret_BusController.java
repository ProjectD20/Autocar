/**
 * 
 */
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Arret_Bus;
import com.example.demo.models.Ville;
import com.example.demo.repository.Arret_BusRepository;

/**
 * @author Mahmoud
 *
 */
@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class Arret_BusController {

	/**
	 * 
	 */
	@Autowired
	Arret_BusRepository arret_BusRepository;
	public Arret_BusController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/Arret_Bus")
	public List<Arret_Bus> getArret() {
        return (List<Arret_Bus>) arret_BusRepository.findAll();
    }
	
	@PostMapping("/createArret")
	void addArret(@RequestBody Arret_Bus arret) {
		arret_BusRepository.save(arret);
		
    }
	
	

}
