package com.service.quiz.repository;

import com.service.quiz.model.data.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

    Quiz findQuizById(Integer id);
}
