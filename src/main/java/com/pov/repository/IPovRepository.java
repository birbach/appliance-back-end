package com.pov.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pov.entities.Appliance;
import com.pov.entities.Pov;

@Repository
public interface IPovRepository extends JpaRepository<Pov, Long> {

	public List<Pov> findByAppliance(Appliance appliance); 
	
}
