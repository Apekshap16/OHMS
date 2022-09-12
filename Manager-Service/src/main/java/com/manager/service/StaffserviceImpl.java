package com.manager.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.model.Staff;
import com.manager.repository.StaffRepository;




@Service
public class StaffserviceImpl implements Staffservice {

	@Autowired
	StaffRepository staffRepo;

	@Override
	public Staff addEmp(Staff emp) {
		return staffRepo.insert(emp);
	}

	@Override
	public List<Staff> getAllEmp() {
		return staffRepo.findAll();
	}

	@Override
	public Optional<Staff> getEmp(long parseLong) {
		return staffRepo.findById(parseLong);
	}

	@Override
	public Staff updateEmp(Staff emp) {
		return staffRepo.save(emp);
	}

	@Override
	public String deleteEmp(long parseLong) {
		staffRepo.deleteById(parseLong);
		return "Deleted employee with ID :" + parseLong;
	}

}
