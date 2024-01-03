package com.spring.jpa.projections.exceptions;


import com.spring.jpa.projections.model.response.ErrorResponse;
import com.spring.jpa.projections.model.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {BadRequestException.class})
    public ResponseEntity handleBadRequestException(Exception ex) {
        Response response = new ErrorResponse(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }


}
