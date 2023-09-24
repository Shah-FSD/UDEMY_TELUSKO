package com.shah.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shah.application.entity.QuestionWrapper;
import com.shah.application.entity.Response;

@Service
public interface QuizService {

  	public boolean createQuizOfRadomNumbers(String category, int num, String title);

	public List<QuestionWrapper> getQuizQuestions(Integer id);

	public Integer getScore(Integer id, List<Response> responses);
}
