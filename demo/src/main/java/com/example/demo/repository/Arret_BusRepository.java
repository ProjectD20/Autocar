/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Arret_Bus;

/**
 * @author Mahmoud
 *
 */
@Repository
public interface Arret_BusRepository  extends CrudRepository<Arret_Bus,Long>{

}
