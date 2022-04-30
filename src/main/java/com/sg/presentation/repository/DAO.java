package com.sg.presentation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sg.presentation.model.DTO;


@Repository
public interface DAO extends MongoRepository<DTO, String> {

}
