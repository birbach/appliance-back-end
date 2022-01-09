package com.pov.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pov.entities.Pov;
import com.pov.entities.Suivi;

@Repository
public interface ISuiviRepository extends JpaRepository<Suivi, Long> {
	
		public List<Suivi> findByPov(Pov pov);
}
