package com.te.validation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.validation.model.User;
import com.te.validation.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userrepository;
	
	public User createUser(User user) {
		return userrepository.save(user);
		
	}
}
