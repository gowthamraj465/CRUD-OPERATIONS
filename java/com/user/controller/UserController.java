package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserSerVice;

@RestController
public class UserController {
	
	@Autowired
	UserSerVice service;
	 
	
	@PostMapping("/save")
	public void saveuser(@RequestBody User user) {
		service.saveUser(user);
		
	}
	

}
