package com.manager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manager.model.inventory;





public interface InventoryRepository extends MongoRepository<inventory, Integer>{
	public inventory findById(int inventory_id);

}
