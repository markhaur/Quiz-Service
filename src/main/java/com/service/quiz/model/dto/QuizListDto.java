package com.service.quiz.model.dto;

import com.service.quiz.model.data.Quiz;

import java.util.List;

public class QuizListDto {

    private Response response;
    private List<Quiz> quizList;

    public QuizListDto(Response response, List<Quiz> quizList) {
        this.response = response;
        this.quizList = quizList;
    }

    public QuizListDto(){}

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public List<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(List<Quiz> quizList) {
        this.quizList = quizList;
    }
}
