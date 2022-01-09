package com.pov.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pov.entities.Pov;
import com.pov.entities.Sceance;

@Repository
public interface ISceanceRepository extends JpaRepository<Sceance, Long>{

	public List<Sceance> findByPov(Pov pov);
}
