package com.shah.questionservice.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shah.questionservice.dao.QuestionRepository;
import com.shah.questionservice.model.QuestionWrapper;
import com.shah.questionservice.model.Questions;
import com.shah.questionservice.model.Response;
import com.shah.questionservice.service.QuestionService;

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
	public List<Integer> getRandomQuestionsRelatedToCategoryAndNumbers(String category, int num) {
		try {
			Pageable page = PageRequest.of(0, num);
			return questionRepository.getRandomQuestionsRelatedToCategoryAndNumbers(category,page);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<QuestionWrapper> getQuestionsFromId(List<Integer> ids) {
		List<QuestionWrapper> wrappers = new ArrayList<>();
		List<Questions> questions = new ArrayList<>();
		
		for(Integer id: ids) {
			Questions question = questionRepository.findById(id).get();
			questions.add(question);
		}
		
		for(Questions question: questions) {
			QuestionWrapper wrapper = new QuestionWrapper();
			wrapper.setId(question.getId());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption3(question.getOption3());
			wrapper.setOption4(question.getOption4());
			wrapper.setQuestionTitle(question.getQuestionTitle());
			
			wrappers.add(wrapper);
		}
		return wrappers;
	}

	@Override
	public Integer calculateResult(List<Response> responses) {
		int right = 0;
		for (Response response : responses) {
			Questions question = questionRepository.findById(response.getId()).get();
			if (response.getResponse().equals(question.getRightAnswer()))
				right++;
		}
		return right;

	}
}
