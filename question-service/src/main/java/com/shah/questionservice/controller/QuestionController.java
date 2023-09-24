package com.shah.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shah.questionservice.model.QuestionWrapper;
import com.shah.questionservice.model.Questions;
import com.shah.questionservice.model.Response;
import com.shah.questionservice.service.QuestionService;

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

	//Create method for interaction with quiz-service used to generate quiz at quiz-service
	@GetMapping("/generate")
	public ResponseEntity<List<Integer>> generateQuiz(@RequestParam String category,@RequestParam int number){
		List<Integer> questionId = questionService.getRandomQuestionsRelatedToCategoryAndNumbers(category, number);
		return new ResponseEntity<List<Integer>>(questionId,HttpStatus.OK);
	}
	
	//used to get question details, requested from quiz-service
	@GetMapping("/getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionById(@RequestBody List<Integer> id){
		return new ResponseEntity<List<QuestionWrapper>>(questionService.getQuestionsFromId(id),HttpStatus.OK);
	}
	
	//used to calculate score, requested from quiz-service
	@PostMapping("/calculate")
	public ResponseEntity<Integer> caluclateResult(@RequestBody List<Response> responses){
		return new ResponseEntity<Integer>(questionService.calculateResult(responses),HttpStatus.OK);
	}
	
}
