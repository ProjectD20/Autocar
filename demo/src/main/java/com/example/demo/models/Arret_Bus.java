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
public class Arret_Bus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ida;
	private long id_Source; // id Ville source du bus
	private long id_Ville_Arret; //id ville Arret du bus
	private long id_detination; //id ville destinataire du bus
	private int DSA; //distance entre Ville Source et ville D'arret en km

	/**
	 * 
	 */
	
	public Arret_Bus() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return ida;
	}

	public void setId(long id) {
		this.ida = id;
	}

	public long getId_Source() {
		return id_Source;
	}

	public void setId_Source(long id_Source) {
		this.id_Source = id_Source;
	}

	public long getId_Ville_Arret() {
		return id_Ville_Arret;
	}

	public void setId_Ville_Arret(long id_Ville_Arret) {
		this.id_Ville_Arret = id_Ville_Arret;
	}

	public long getId_detination() {
		return id_detination;
	}

	public void setId_detination(long id_detination) {
		this.id_detination = id_detination;
	}

	public int getDSA() {
		return DSA;
	}

	public void setDSA(int dSA) {
		DSA = dSA;
	}

	public Arret_Bus( long id_Source, long id_Ville_Arret, long id_detination, int dSA) {
		super();
		this.id_Source = id_Source;
		this.id_Ville_Arret = id_Ville_Arret;
		this.id_detination = id_detination;
		DSA = dSA;
	}

	@Override
	public String toString() {
		return "Arret_Bus [ida=" + ida + ", id_Source=" + id_Source + ", id_Ville_Arret=" + id_Ville_Arret
				+ ", id_detination=" + id_detination + ", DSA=" + DSA + "]";
	}
	

}
