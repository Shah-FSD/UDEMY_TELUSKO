package com.shah.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shah.springsecurity.entity.UserInfo;
import com.shah.springsecurity.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeService service; 
	
	@RequestMapping("/getHome")
	public String home() {	
		return "home";
	}
	
	@RequestMapping("/all")
	@ResponseBody
//	@PreAuthorize("hasAuthority('ROLE_USER')") // used to authorize request based on method
	public String all() {
		return "This page is accessible to all";
	}

	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(@RequestBody UserInfo userInfo){
		service.addUser(userInfo);
		return "User added successfully";
	}
	
}
