/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Ville;

/**
 * @author Mahmoud
 *
 */

@Repository
public interface VilleRepository extends CrudRepository<Ville, Long>{}
