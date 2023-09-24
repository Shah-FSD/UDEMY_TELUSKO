
package com.shah.quizservice.feignInterface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.shah.quizservice.model.QuestionWrapper;
import com.shah.quizservice.model.Response;

@FeignClient(name = "QUESTION-SERVICE")
public interface FeignInterface {


	@GetMapping("/question/generate")
	public ResponseEntity<List<Integer>> generateQuiz(@RequestParam String category,@RequestParam int number);
	
	//used to get question details, requested from quiz-service
	@GetMapping("/question/getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionById(@RequestBody List<Integer> id);
	
	//used to calculate score, requested from quiz-service
	@PostMapping("/question/calculate")
	public ResponseEntity<Integer> caluclateResult(@RequestBody List<Response> responses);

}
