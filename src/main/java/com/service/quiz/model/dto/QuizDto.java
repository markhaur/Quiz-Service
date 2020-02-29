package com.service.quiz.model.dto;

import com.service.quiz.model.data.Quiz;

public class QuizDto {

    private Quiz quiz;
    private Response response;

    public QuizDto(Quiz quiz, Response response) {
        this.quiz = quiz;
        this.response = response;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
