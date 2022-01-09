package com.pov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pov.entities.Type;
@Repository
public interface ITypeRepository extends JpaRepository<Type, Long> {

}
