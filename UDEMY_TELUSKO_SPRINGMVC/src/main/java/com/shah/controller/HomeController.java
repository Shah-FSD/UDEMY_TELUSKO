package com.shah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping(value="/home")
	public String home() {
		return "index";
	}
	
	@PostMapping(value="/add")
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		return new ModelAndView("result").addObject("num3", num1+num2);
	}
	
}

