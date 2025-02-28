package com.example.securitysetup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.securitysetup.entity.Students;
import com.example.securitysetup.service.StudentsService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentsService service;
	
@GetMapping("/get")
	public List<Students> get(){
		return service.getAllStudents();
	}
@PostMapping("/post")
 public Students add(@RequestBody Students students) {
	return service.add(students);
	
}

	
}
