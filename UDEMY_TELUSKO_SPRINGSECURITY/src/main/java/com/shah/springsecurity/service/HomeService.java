package com.shah.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shah.springsecurity.entity.UserInfo;
import com.shah.springsecurity.repository.UserInfoRepository;

@Service
public class HomeService {
	
	@Autowired
	private UserInfoRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void addUser(UserInfo userInfo) {
	  userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
	  userRepository.save(userInfo);
	}

}
