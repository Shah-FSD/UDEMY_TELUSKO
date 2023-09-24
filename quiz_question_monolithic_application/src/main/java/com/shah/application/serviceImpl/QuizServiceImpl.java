package com.shah.application.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shah.application.entity.QuestionWrapper;
import com.shah.application.entity.Questions;
import com.shah.application.entity.Quiz;
import com.shah.application.entity.Response;
import com.shah.application.repositoy.QuizRepository;
import com.shah.application.service.QuestionService;
import com.shah.application.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{
	
	@Autowired
	private QuizRepository quizRepository;

	@Autowired
	private QuestionService questionService;
	
	@Override
	public boolean createQuizOfRadomNumbers(String category, int num, String title) {
	 	List<Questions> questions = questionService.getRandomQuestionsRelatedToCategoryAndNumbers(category, num);
		
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questions);
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
			List<Questions> questions = quiz.get().getQuestions();
			List<QuestionWrapper> questionWrappers = new ArrayList<>();
			for(Questions question: questions) {
				QuestionWrapper questionWrapper = new QuestionWrapper();
				questionWrapper.setId(question.getId());
				questionWrapper.setOption1(question.getOption1());
				questionWrapper.setOption2(question.getOption2());
				questionWrapper.setOption3(question.getOption3());
				questionWrapper.setOption4(question.getOption4());
				questionWrapper.setQuestionTitle(question.getQuestionTitle());
				
				questionWrappers.add(questionWrapper);
			}
			return questionWrappers;
		} else
			return null;
			
	}

	@Override
	public Integer getScore(Integer id, List<Response> responses) {
		Optional<Quiz> quiz = quizRepository.findById(id);
		if(quiz.isPresent()) {
			List<Questions> questions = quiz.get().getQuestions();
			int right = 0;
			int i =0;
			for(Response response: responses) {
				if(response.getResponse().equals(questions.get(i).getRightAnswer()))
					right++;
				
				i++;
			}
			return right;
		}
		return 0;
	}
	
}
