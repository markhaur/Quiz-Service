package com.service.quiz.utils;

public interface ResponseUtils {

    static final int SUCCESS_CODE = 200;
    static final int ERROR_CODE = 201;
    static final String SUCCESS_DESC = "Request processed successfully";
    static final String ERROR_DESC = "Unknown error while processing request";
    static final String INVALID_REQUEST = "Invalid Request";
    static final String LOGIN_FAILURE = "Username or password is incorrect";
    static final String VALIDATION_FAILED = "Validation Failure";
}
