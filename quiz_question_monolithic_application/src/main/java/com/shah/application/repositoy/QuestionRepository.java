package com.shah.application.repositoy;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shah.application.entity.Questions;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface QuestionRepository extends JpaRepository<Questions, Integer> {

	@Query(value = "SELECT * FROM questions q WHERE q.category = :category ORDER BY RAND() ", nativeQuery = true)
	public List<Questions> getRandomQuestionsRelatedToCategoryAndNumbers(String category, Pageable page);
	
}
