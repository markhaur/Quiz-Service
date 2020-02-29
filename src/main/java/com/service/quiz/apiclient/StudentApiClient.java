package com.service.quiz.apiclient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.quiz.utils.ResponseUtils;
import com.squareup.okhttp.*;

import java.io.IOException;

public class StudentApiClient {

    public boolean validateStudent(String emailId){
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(String.format("http://localhost:8084/student/validate/%s", emailId))
                .get()
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();
            System.out.println("faisal nisar: " + responseBody);
            ObjectMapper objectMapper = new ObjectMapper();
            com.service.quiz.model.dto.Response apiResponse = objectMapper.readValue(responseBody, com.service.quiz.model.dto.Response.class);
            if(apiResponse.getResponseCode() == ResponseUtils.SUCCESS_CODE)
                return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
