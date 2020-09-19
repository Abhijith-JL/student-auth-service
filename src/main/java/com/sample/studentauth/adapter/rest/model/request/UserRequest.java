package com.sample.studentauth.adapter.rest.model.request;

public class UserRequest {

    private String name;
    private String emailId;
    private String password;
    private long mobile;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserRequest() {
    }

    public UserRequest(String name, String emailId, String password, long mobile, String address) {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
    }
}
