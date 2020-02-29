package com.service.quiz.service;

import com.service.quiz.model.dto.QuizDto;
import com.service.quiz.model.dto.QuizListDto;
import org.springframework.stereotype.Service;

@Service
public interface QuizService {

    QuizDto findQuizById(String emailId, Integer id);

    QuizListDto getAllQuizzes(String emailId);
}
