package com.shah.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shah.springrest.entity.User;
import com.shah.springrest.repository.UserRepository;

@RestController
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/getUsers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}

	@GetMapping(value="/getUser/{userId}")
	public Optional<User> getUser(@PathVariable("userId") Integer id) {
		return userRepository.findById(id);
	}
	
}
