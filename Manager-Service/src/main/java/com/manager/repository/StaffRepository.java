package com.manager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manager.model.Staff;






public interface StaffRepository extends MongoRepository<Staff, Long> {

}
