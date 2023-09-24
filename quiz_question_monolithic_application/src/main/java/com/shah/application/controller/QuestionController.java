package com.shah.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shah.application.entity.Questions;
import com.shah.application.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
						
	@Autowired
	public QuestionService questionService;
	
	@GetMapping(value = "/all")
	public List<Questions> getAllQuestions() {
		List<Questions> result = questionService.getAllQuestions();
		return result;
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<String> addQuestion(@RequestBody Questions question) {
		if(questionService.addQuestion(question))
			return new ResponseEntity<String>("Successfully saved in the database",HttpStatus.CREATED);	
		else 
			return new ResponseEntity<String>("Something went wrong",HttpStatus.SERVICE_UNAVAILABLE);
	}

	@PostMapping(value = "/add/all")
	public ResponseEntity<String> addAllQuestion(@RequestBody List<Questions> questions){
		if(questionService.addAllQuestions(questions))
			 return ResponseEntity.ok("saved every question successfully");
		else
		     return new ResponseEntity<String>("something wen wrong",HttpStatus.BAD_REQUEST);	
	}
	
}
