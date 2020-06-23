/**
 * 
 */
package com.example.demo.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.repository.Arret_BusRepository;
import com.example.demo.repository.VilleRepository;
import com.fasterxml.jackson.annotation.JsonAnyGetter;

/**
 * @author Mahmoud
 *
 */
@RestController
@CrossOrigin(origins= "http://localhost:4200")

public class Itineraire {


	@Autowired
	 VilleRepository villeReposotery; 
	@Autowired
	Arret_BusRepository arret_BusRepository;
	public long min;
	public long Max;
	public long id_D;
	public long id_S;
	
	public Itineraire() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//principale fonctionalité : retourne les itineraire possible entre S et D verifiant B et H
	@RequestMapping(value = "/GetItiniraires", method = RequestMethod.GET)
	public String [][] GetItiniraires(@RequestParam("Source") String Source,
            @RequestParam("Budjet") String Budjet,
            @RequestParam("Duree") String Duree) {
      	System.out.println(Source);
      	
		//return (String[][]) villeReposotery.findAll();
      	String [][] matrix =  { {"Lille","Compiègne","Paris"}, {"Lille","Arras","Paris"} };

		return matrix;
    }
}

