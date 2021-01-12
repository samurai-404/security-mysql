package com.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.security.model.Formation;

@Repository
public interface FormationRepository extends CrudRepository<Formation, Long>{

}
