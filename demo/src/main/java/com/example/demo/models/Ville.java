/**
 * 
 */
package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Mahmoud
 *
 */
@Entity	
public class Ville {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nomVille;
	 //@ManyToMany
	    //Set<Course> likedCourses;

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomVille() {
		return nomVille;
	}


	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}


	/**
	 * 
	 */
	public Ville() {
		// TODO Auto-generated constructor stub
	}
	

}
