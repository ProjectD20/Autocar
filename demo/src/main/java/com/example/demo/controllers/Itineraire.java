/**
 * 
 */
package com.example.demo.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.repository.Arret_BusRepository;
import com.example.demo.repository.VilleRepository;

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
	@GetMapping("/GetItiniraires")
	public String GetItiniraires(@RequestParam String Source,
					@RequestParam int budjet,
					@RequestParam String duree) {
       System.out.println(Source);
       System.out.println(budjet);
       System.out.println(duree);
	
		//return (String[][]) villeReposotery.findAll();
		return Source;
    }
}

