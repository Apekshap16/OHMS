package com.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.payment.Models.Payment;

@EnableMongoRepositories
public interface PayRepository  extends MongoRepository<Payment, Long> {

}
