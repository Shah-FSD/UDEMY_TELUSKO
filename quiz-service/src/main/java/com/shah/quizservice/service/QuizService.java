package com.shah.quizservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shah.quizservice.model.QuestionWrapper;
import com.shah.quizservice.model.Response;

@Service
public interface QuizService {

  	public boolean createQuizOfRadomNumbers(String category, int num, String title);

	public List<QuestionWrapper> getQuizQuestions(Integer id);

	public Integer getScore(Integer id, List<Response> responses);
}
