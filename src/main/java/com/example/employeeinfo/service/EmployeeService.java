package com.example.employeeinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeinfo.entity.Employee;
import com.example.employeeinfo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepository;

	public void addEmployee(Employee employee) {
		empRepository.save(employee);
	}

	public void addEmployees(List<Employee> employeelist) {
		empRepository.saveAll(employeelist);
	}

	public List<Employee> findEmployees() {
		return empRepository.findAll();
	}

	public void updateEmployee(Employee employee) {
		empRepository.save(employee);
	}

	public void dleteEmployee(Long id) {
		empRepository.deleteById(id);
	}

}
