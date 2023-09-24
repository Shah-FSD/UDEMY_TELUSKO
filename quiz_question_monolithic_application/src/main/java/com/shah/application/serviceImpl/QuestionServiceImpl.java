package com.shah.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shah.application.entity.Questions;
import com.shah.application.repositoy.QuestionRepository;
import com.shah.application.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	
	@Autowired
	public QuestionRepository questionRepository;
	
	@Override
	public List<Questions> getAllQuestions() {		
		return questionRepository.findAll();			
	}

	@Override
	public boolean addQuestion(Questions question) {
		try {
			questionRepository.save(question);
			return true;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return false;
	}

	@Override
	public boolean addAllQuestions(List<Questions> questions) {
		try {
			questions.forEach((question)->questionRepository.save(question));
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public List<Questions> getRandomQuestionsRelatedToCategoryAndNumbers(String category, int num) {
		try {
			Pageable page = PageRequest.of(0, num);
			return questionRepository.getRandomQuestionsRelatedToCategoryAndNumbers(category,page);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
