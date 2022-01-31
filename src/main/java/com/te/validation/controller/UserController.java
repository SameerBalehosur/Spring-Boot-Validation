package com.te.validation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.validation.model.User;
import com.te.validation.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user){
		User createUser = service.createUser(user);
		return new ResponseEntity<User>(createUser,HttpStatus.CREATED);
	}
}
