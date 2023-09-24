package com.shah.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shah.application.entity.Questions;

@Service
public interface QuestionService {

	public List<Questions> getAllQuestions();
	
	public boolean addQuestion(Questions question);

	public boolean addAllQuestions(List<Questions> questions);

	public List<Questions> getRandomQuestionsRelatedToCategoryAndNumbers(String category, int num);
	
	
}
