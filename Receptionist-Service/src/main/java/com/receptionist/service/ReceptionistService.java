package com.receptionist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.receptionist.model.ReceptionistInformation;
import com.receptionist.repository.ReceptionistRepository;


@Service
public class ReceptionistService {

	@Autowired
	private ReceptionistRepository receptionistRepo;

	
	public  List<ReceptionistInformation> getReceptionistInfos() {
		List<ReceptionistInformation> receptionistInfos = receptionistRepo.findAll();
		System.out.println("Getting Receptionist from DB" + receptionistInfos);
		return receptionistInfos;
	}


	
	public void addReceptionist(ReceptionistInformation receptionist)
	{
		receptionistRepo.save(receptionist);
	}
}
	
	

