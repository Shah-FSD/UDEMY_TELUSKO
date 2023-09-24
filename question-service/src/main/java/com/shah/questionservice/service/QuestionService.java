package com.shah.questionservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shah.questionservice.model.QuestionWrapper;
import com.shah.questionservice.model.Questions;
import com.shah.questionservice.model.Response;

@Service
public interface QuestionService {

	public List<Questions> getAllQuestions();
	
	public boolean addQuestion(Questions question);

	public boolean addAllQuestions(List<Questions> questions);

	public List<Integer> getRandomQuestionsRelatedToCategoryAndNumbers(String category, int num);

	public List<QuestionWrapper> getQuestionsFromId(List<Integer> id);

	public Integer calculateResult(List<Response> responses);
	
}
