package com.pov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pov.entities.TypePrestation;
@Repository
public interface ITypePrestationRepository extends JpaRepository<TypePrestation, Long> {

}
