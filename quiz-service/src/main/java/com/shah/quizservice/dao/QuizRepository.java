package com.shah.quizservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shah.quizservice.model.Quiz;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

	
}
