package com.spring.jpa.projections.model.response;

public class ErrorDataResponse<T> extends DataResponse<T>{

    public ErrorDataResponse(String message, T data) {
        super(false, message, data);
    }

}
