package com.sample.studentauth.adapter.rest.model.response;

public class Response {

    private Object response;

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Response(Object response) {
        this.response = response;
    }

    public Response() {
    }
}
