package com.example.employeeinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeinfo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	

}
