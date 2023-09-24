package com.shah.questionservice.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shah.questionservice.model.Questions;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface QuestionRepository extends JpaRepository<Questions, Integer> {

	@Query(value = "SELECT q.id FROM questions q WHERE q.category = :category ORDER BY RAND() ", nativeQuery = true)
	public List<Integer> getRandomQuestionsRelatedToCategoryAndNumbers(String category, Pageable page);
	
}
