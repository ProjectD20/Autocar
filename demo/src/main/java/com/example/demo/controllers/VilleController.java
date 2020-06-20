/**
 * 
 */
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Ville;
import com.example.demo.repository.VilleRepository;

/**
 * @author Mahmoud
 *
 */
@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class VilleController {

	/**
	 * 
	 */
	 @Autowired
	 VilleRepository villeReposotery;


	public VilleController() {
	}
	
	@GetMapping("/Villes")
	public List<Ville> getVilles() {
        return (List<Ville>) villeReposotery.findAll();
    }
	
	
}
