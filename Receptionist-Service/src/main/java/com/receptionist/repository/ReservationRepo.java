package com.receptionist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.receptionist.model.Reservation;




public interface ReservationRepo extends MongoRepository<Reservation, Long> {

	
}
