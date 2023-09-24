package com.shah.quizservice.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shah.quizservice.dao.QuizRepository;
import com.shah.quizservice.feignInterface.FeignInterface;
import com.shah.quizservice.model.QuestionWrapper;
import com.shah.quizservice.model.Quiz;
import com.shah.quizservice.model.Response;
import com.shah.quizservice.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{
	
	@Autowired
	private QuizRepository quizRepository;

	 @Autowired
	 FeignInterface feign;	

	@Override
	public boolean createQuizOfRadomNumbers(String category, int num, String title) {

		List<Integer> ids = feign.generateQuiz(category, num).getBody();
		
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionIds(ids);
		try {
			quizRepository.save(quiz);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public List<QuestionWrapper> getQuizQuestions(Integer id) {
		Optional<Quiz> quiz = quizRepository.findById(id);
		if(quiz.isPresent()) {
			List<QuestionWrapper> questionWrappers = feign.getQuestionById(quiz.get().getQuestionIds()).getBody();
			return questionWrappers;
		} else
			return null;
			
	}

	@Override
	public Integer getScore(Integer id, List<Response> responses) {
		Integer result = feign.caluclateResult(responses).getBody();
		return result;
	}
	
}
