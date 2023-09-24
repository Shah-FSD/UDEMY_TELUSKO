package com.shah.springsecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shah.springsecurity.entity.UserInfo;
import com.shah.springsecurity.repository.UserInfoRepository;

@Service
public class UserInfoDetailsService implements UserDetailsService {

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	/**
	 * Method to identify the user existence in the database
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserInfo> user = userInfoRepository.findByName(username);
	 return	user.map(UserInfoDetails::new).orElseThrow(()->new UsernameNotFoundException("no such user exist"));	
	}

}
