package com.spring.jpa.projections.model.response;

import java.io.Serializable;

public class Response implements Serializable {

    private Boolean success;
    private String message;

    public Response(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Response() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
