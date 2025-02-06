package com.example.employeeinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeinfo.entity.Employee;
import com.example.employeeinfo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	
	@PostMapping("/post")
	public void addEmployee(@RequestBody Employee employee) {
		empservice.addEmployee(employee);
		System.out.println("METHOD SUCCESSFULLY CALLED"); 
		
	}
	@PostMapping("/postall")
	public void addEmployees(@RequestBody List<Employee> employeelist) {
		empservice.addEmployees(employeelist);

	}
 @GetMapping("/get")
	public List<Employee> findEmployees(){
		return empservice.findEmployees();
	}
@PutMapping("/put/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
	empservice.updateEmployee(employee);
}

@DeleteMapping("/delete/{id}")
  public void deleteEmployee(@PathVariable Long id) {
	empservice.dleteEmployee(id);
}
}
