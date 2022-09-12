package com.receptionist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.receptionist.model.Guest;



@Repository
public interface GuestRepo extends MongoRepository<Guest, Integer> {

}
