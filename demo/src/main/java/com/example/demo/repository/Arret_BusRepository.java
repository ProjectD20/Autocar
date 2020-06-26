/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Arret_Bus;


/**
 * @author Mahmoud
 *
 */
@Repository
public interface Arret_BusRepository  extends CrudRepository<Arret_Bus,Long> , JpaRepository<Arret_Bus, Long>{
	 @Query("SELECT a FROM Arret_Bus a WHERE id_Source = ?1 AND id_detination = ?2")
	 java.util.List<Arret_Bus> findByIdsIdd(Long source, Long destination);
}
