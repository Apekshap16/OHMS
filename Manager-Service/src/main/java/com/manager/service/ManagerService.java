package com.manager.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.model.ManagerInformation;
import com.manager.repository.ManagerRepository;



@Service
public class ManagerService {

	@Autowired
	private ManagerRepository managerRepo;

	
	public List<ManagerInformation> getManagerInfos() {
		List<ManagerInformation> managerInfos = managerRepo.findAll();
		System.out.println("Getting Manager from DB" + managerInfos);
		return managerInfos;
	}


	
	public void addManager(ManagerInformation manager)
	{
		managerRepo.save(manager);
	}







	



	
}
	
	
