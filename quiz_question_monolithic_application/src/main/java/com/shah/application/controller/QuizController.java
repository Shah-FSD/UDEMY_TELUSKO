package com.shah.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shah.application.entity.QuestionWrapper;
import com.shah.application.entity.Response;
import com.shah.application.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {


	@Autowired
	private QuizService quizService;
	
	@PostMapping("create")
	public ResponseEntity<String> addQuiz(@RequestParam String category, @RequestParam int num, @RequestParam String title ){
		if(quizService.createQuizOfRadomNumbers(category,num,title))
			return new ResponseEntity<String>("created quiz successfully",HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("something went wrong",HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
		if(quizService.getQuizQuestions(id)!=null) 
			return new ResponseEntity<List<QuestionWrapper>>(quizService.getQuizQuestions(id),HttpStatus.OK);
		else
		  return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("result/{id}")
	public ResponseEntity<Integer> getResult(@PathVariable Integer id,@RequestBody List<Response> responses){
		Integer result = quizService.getScore(id,responses);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
}
