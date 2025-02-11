package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserSerVice {
	
	@Autowired
	UserRepository repository;
	
	PasswordEncoder  passwordEncoder  = new BCryptPasswordEncoder();
 
	
	
	public void saveUser(User user) {
		
		String hashedPassword =  passwordEncoder.encode(user.getPassword());
		user.setPassword(hashedPassword);
		repository.save(user);
	}

}
