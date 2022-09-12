package com.manager.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manager.model.Staff;
import com.manager.model.StaffList;
import com.manager.service.Staffservice;






@CrossOrigin(origins ="http://localhost:4200" )
@RestController
//@RequestMapping("/Staff")
public class StaffController {

	@Autowired
	Staffservice staffService;
	
	//add staff(create)

	@PostMapping("/addEmp")
	public Staff addEmployee(@RequestBody Staff emp) {
		return this.staffService.addEmp(emp);
	}
	
	// get staff(read)

	@GetMapping("/getAllEmp")
	public StaffList getAllEmployee() {
		StaffList list = new StaffList();
		list.setAllEmp(this.staffService.getAllEmp());
		return list;
	}

	// get staff by id(read)
	@GetMapping("/getByEmp/{id}")
	public Optional<Staff> getEmployee(@PathVariable("id") String id) {
		return this.staffService.getEmp(Long.parseLong(id));
	}

	//update staff details
	@PutMapping("/updateEmp")
	public Staff updateEmployee(@RequestBody Staff emp) {
		return this.staffService.updateEmp(emp);
	}

	//delete staff details
	@DeleteMapping("/deleteByEmp/{id}")
	public String deleteEmployee(@PathVariable("id") String id) {
		return this.staffService.deleteEmp(Long.parseLong(id));
	}

}