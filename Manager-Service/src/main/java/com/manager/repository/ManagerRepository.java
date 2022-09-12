package com.manager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manager.model.ManagerInformation;





public interface ManagerRepository extends MongoRepository<ManagerInformation , String> {
	
	ManagerInformation findByEmail(String email);

}