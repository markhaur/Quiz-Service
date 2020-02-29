package com.service.quiz.controller;

import com.service.quiz.model.dto.QuizDto;
import com.service.quiz.model.dto.QuizListDto;
import com.service.quiz.service.QuizServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class QuizController {

    @Autowired
    private QuizServiceImpl quizService;

    @RequestMapping(path = "/quiz/{quizid}/{emailId}", method = RequestMethod.GET)
    public QuizDto findQuizById(@PathVariable("quizid") Integer quizId,
                                @PathVariable("emailId") String emailId){
        return quizService.findQuizById(emailId, quizId);
    }

    @RequestMapping(path = "/quiz/{emailId}", method = RequestMethod.GET)
    public QuizListDto findAllQuizzes(@PathVariable("emailId") String emailId){
        return quizService.getAllQuizzes(emailId);
    }
}
