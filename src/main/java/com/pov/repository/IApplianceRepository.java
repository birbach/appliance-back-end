package com.pov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pov.entities.Appliance;

@Repository
public interface IApplianceRepository extends JpaRepository<Appliance, Long>{

}
