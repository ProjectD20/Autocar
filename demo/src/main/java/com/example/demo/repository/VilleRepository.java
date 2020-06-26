/**
 * 
 */
package com.example.demo.repository;

import java.util.Optional;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Ville;

/**
 * @author Mahmoud
 *
 */

@Repository
public interface VilleRepository extends CrudRepository<Ville, Long>{
    public Ville findBynomVille(String name);        
     
	}
