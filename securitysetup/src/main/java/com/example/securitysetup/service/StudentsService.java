package com.example.securitysetup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.securitysetup.entity.Students;
import com.example.securitysetup.repository.StudentRepository;

@Service
public class StudentsService {
	
	@Autowired
	StudentRepository repository;

	public List<Students> getAllStudents() {
		return repository.findAll() ;
	}

	

	public Students add(Students students) {
		return repository.save(students);
	}
	
	
	

}
