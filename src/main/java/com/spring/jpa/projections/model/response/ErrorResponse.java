package com.spring.jpa.projections.model.response;

public class ErrorResponse extends Response{

    public ErrorResponse(String message) {
        super(false, message);
    }
}
