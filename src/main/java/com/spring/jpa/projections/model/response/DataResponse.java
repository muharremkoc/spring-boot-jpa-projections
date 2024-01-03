package com.spring.jpa.projections.model.response;

public class DataResponse<T> extends Response{

    private T data;

    public DataResponse(Boolean success, String message, T data) {
        super(success, message);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
