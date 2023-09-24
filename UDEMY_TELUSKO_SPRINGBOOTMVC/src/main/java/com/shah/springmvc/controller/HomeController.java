package com.shah.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shah.springmvc.Student;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

	@RequestMapping(value = "/index")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value ="add")
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		
		return new ModelAndView("result").addObject("num3", num1+num2);
	}
	
	@RequestMapping(value ="show")
	public ModelAndView show(@ModelAttribute Student student ) {
		return new ModelAndView("show").addObject("details", student);
	}
	
	@RequestMapping(value = "/display")
	public String display() {
		return "display";
	}
	
}
