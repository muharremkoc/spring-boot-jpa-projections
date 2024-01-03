package com.spring.jpa.projections.model.response;

public class SuccessDataResponse<T> extends DataResponse<T>{

    public SuccessDataResponse(String message, T data) {
        super(true, message, data);
    }
}
