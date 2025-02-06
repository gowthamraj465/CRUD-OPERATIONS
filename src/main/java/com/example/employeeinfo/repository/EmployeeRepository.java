package com.example.employeeinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeinfo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
