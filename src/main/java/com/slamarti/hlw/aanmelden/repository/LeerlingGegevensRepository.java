package com.slamarti.hlw.aanmelden.repository;

import com.slamarti.hlw.aanmelden.model.LeerlingGegevens;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeerlingGegevensRepository extends CrudRepository<LeerlingGegevens, Long> {

}