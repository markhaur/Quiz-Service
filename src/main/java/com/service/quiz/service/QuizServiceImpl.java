package com.service.quiz.service;

import com.service.quiz.apiclient.StudentApiClient;
import com.service.quiz.model.data.Quiz;
import com.service.quiz.model.dto.QuizDto;
import com.service.quiz.model.dto.QuizListDto;
import com.service.quiz.model.dto.Response;
import com.service.quiz.repository.QuizRepository;
import com.service.quiz.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService{

    @Autowired
    private QuizRepository quizRepository;
    private StudentApiClient studentApiClient = new StudentApiClient();

    @Override
    public QuizDto findQuizById(String emailId, Integer id) {
        boolean isValidated = studentApiClient.validateStudent(emailId);
        if(!isValidated)
            return new QuizDto(null, new Response(ResponseUtils.ERROR_CODE, ResponseUtils.VALIDATION_FAILED));
        Quiz quiz = quizRepository.findQuizById(id);
        return new QuizDto(quiz, new Response(ResponseUtils.SUCCESS_CODE, ResponseUtils.SUCCESS_DESC));
    }

    @Override
    public QuizListDto getAllQuizzes(String emailId) {
        boolean isValidated = studentApiClient.validateStudent(emailId);
        if(!isValidated)
            return new QuizListDto(new Response(ResponseUtils.ERROR_CODE, ResponseUtils.VALIDATION_FAILED), null);
        List<Quiz> quizList = quizRepository.findAll();
        Response response = new Response(ResponseUtils.SUCCESS_CODE, ResponseUtils.SUCCESS_DESC);
        return new QuizListDto(response, quizList);
    }

}
