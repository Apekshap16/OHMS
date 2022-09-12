package com.receptionist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.receptionist.model.ReceptionistInformation;


public interface ReceptionistRepository extends MongoRepository<ReceptionistInformation , String> {
	ReceptionistInformation findByEmail(String email);

}
